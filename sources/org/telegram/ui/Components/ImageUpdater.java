package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.Pair;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoAlbumPickerActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105;

public final class ImageUpdater implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.PhotoSize bigPhoto;
    public final boolean canSelectVideo;
    public boolean canceled;
    public ChatAttachAlert chatAttachAlert;
    public boolean clearAfterUpdate;
    public MessageObject convertingVideo;
    public float currentImageProgress;
    public String currentPicturePath;
    public ImageUpdaterDelegate delegate;
    public String finalPath;
    public boolean forceDarkTheme;
    public boolean isVideo;
    public boolean openWithFrontfaceCamera;
    public BaseFragment parentFragment;
    public final int setForType;
    public boolean showingFromDialog;
    public TLRPC.PhotoSize smallPhoto;
    public Bitmap smallPhotoBitmap;
    public final boolean supportEmojiMarkup;
    public int type;
    public TLRPC.InputFile uploadedPhoto;
    public TLRPC.InputFile uploadedVideo;
    public String uploadingImage;
    public String uploadingVideo;
    public TLRPC.User user;
    public TLRPC.VideoSize vectorMarkup;
    public String videoPath;
    public double videoTimestamp;
    public final int currentAccount = UserConfig.selectedAccount;
    public boolean useAttachMenu = true;
    public boolean searchAvailable = true;
    public boolean uploadAfterSelect = true;
    public final ImageReceiver imageReceiver = new ImageReceiver(null);

    public final class AvatarFor {
        public TLRPC.User fromObject;
        public boolean isVideo;
        public final TLObject object;
        public final boolean self;
        public final int type;

        public AvatarFor(int i, TLObject tLObject) {
            this.object = tLObject;
            this.type = i;
            this.self = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
        }
    }

    public interface ImageUpdaterDelegate {
        boolean canFinishFragment();

        void didStartUpload(boolean z, boolean z2);

        void didUploadFailed();

        void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize);

        PhotoViewer.PlaceProviderObject getCloseIntoObject();

        String getInitialSearchString();

        void onUploadProgressChanged(float f);

        boolean supportsBulletin();
    }

    public ImageUpdater(int i, boolean z, boolean z2) {
        this.canSelectVideo = z;
        this.supportEmojiMarkup = z2;
        this.setForType = i;
    }

    public static void access$100(ImageUpdater imageUpdater, boolean z, ArrayList arrayList) throws FileNotFoundException {
        MessageObject messageObject;
        Bitmap bitmapLoadBitmap;
        imageUpdater.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
        Bitmap bitmapLoadBitmap2 = null;
        if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject.videoEditedInfo = sendingMediaInfo.videoEditedInfo;
            messageObject.emojiMarkup = sendingMediaInfo.emojiMarkup;
            bitmapLoadBitmap2 = ImageLoader.loadBitmap(sendingMediaInfo.thumbPath, null, 800.0f, 800.0f, true);
        } else {
            String str = sendingMediaInfo.path;
            if (str == null) {
                MediaController.SearchImage searchImage = sendingMediaInfo.searchImage;
                if (searchImage != null) {
                    TLRPC.Photo photo = searchImage.photo;
                    ImageReceiver imageReceiver = imageUpdater.imageReceiver;
                    int i = imageUpdater.currentAccount;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                        if (closestPhotoSizeWithSize != null) {
                            File pathToAttach = FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true);
                            imageUpdater.finalPath = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                bitmapLoadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(i).addObserver(imageUpdater, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i).addObserver(imageUpdater, NotificationCenter.fileLoadFailed);
                                imageUpdater.uploadingImage = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                            }
                        }
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        imageUpdater.finalPath = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            imageUpdater.uploadingImage = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(i).addObserver(imageUpdater, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(i).addObserver(imageUpdater, NotificationCenter.httpFileDidFailedLoad);
                            imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                        } else {
                            bitmapLoadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                    imageUpdater.processBitmap(z, bitmapLoadBitmap2, messageObject);
                }
                messageObject = null;
                imageUpdater.processBitmap(z, bitmapLoadBitmap2, messageObject);
            }
            bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
            messageObject = null;
            bitmapLoadBitmap2 = bitmapLoadBitmap;
        }
        imageUpdater.processBitmap(z, bitmapLoadBitmap2, messageObject);
    }

    public final void cleanup$1() {
        this.uploadingImage = null;
        this.uploadingVideo = null;
        this.videoPath = null;
        this.convertingVideo = null;
        if (this.clearAfterUpdate) {
            this.imageReceiver.setImageBitmap((Drawable) null);
            this.parentFragment = null;
            this.delegate = null;
        }
    }

    public final void clear$1() {
        this.canceled = false;
        if (this.uploadingImage == null && this.uploadingVideo == null && this.convertingVideo == null) {
            this.parentFragment = null;
            this.delegate = null;
        } else {
            this.clearAfterUpdate = true;
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.dismissInternal();
            this.chatAttachAlert.onDestroy();
        }
    }

    public final void createChatAttachView$2() {
        StarGiftSheet$$ExternalSyntheticLambda105 starGiftSheet$$ExternalSyntheticLambda105;
        int i = 2;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (this.chatAttachAlert == null) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(this.parentFragment.getParentActivity(), this.parentFragment, this.forceDarkTheme, this.showingFromDialog, true, null);
            this.chatAttachAlert = chatAttachAlert;
            int i2 = this.canSelectVideo ? 2 : 1;
            ImageUpdaterDelegate imageUpdaterDelegate = this.delegate;
            if (imageUpdaterDelegate == null || !imageUpdaterDelegate.supportsBulletin()) {
                starGiftSheet$$ExternalSyntheticLambda105 = null;
            } else {
                ImageUpdaterDelegate imageUpdaterDelegate2 = this.delegate;
                Objects.requireNonNull(imageUpdaterDelegate2);
                starGiftSheet$$ExternalSyntheticLambda105 = new StarGiftSheet$$ExternalSyntheticLambda105(imageUpdaterDelegate2, i);
            }
            chatAttachAlert.avatarPicker = i2;
            chatAttachAlert.avatarWithBulletin = starGiftSheet$$ExternalSyntheticLambda105;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
            if (i2 != 0) {
                chatAttachAlert.typeButtonsAvailable = false;
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout == null || attachAlertLayout == chatAttachAlertPhotoLayout) {
                    chatAttachAlert.buttonsRecyclerViewWrapper.setVisibility(8);
                }
                int i3 = chatAttachAlert.avatarPicker;
                TextView textView = chatAttachAlert.selectedTextView;
                if (i3 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
            } else {
                chatAttachAlert.typeButtonsAvailable = true;
            }
            if (chatAttachAlertPhotoLayout != null) {
                ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout.parentAlert;
                chatAttachAlertPhotoLayout.showAvatarConstructor = (chatAttachAlert2.avatarPicker == 0 || chatAttachAlert2.isPhotoPicker) ? false : true;
            }
            ChatAttachAlert chatAttachAlert3 = this.chatAttachAlert;
            chatAttachAlert3.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public final void didPressedButton(int i4, boolean z, boolean z2, int i5, int i6, long j, boolean z3, boolean z4, long j2) throws FileNotFoundException {
                    ChatAttachAlert chatAttachAlert4;
                    ImageUpdater imageUpdater = ImageUpdater.this;
                    BaseFragment baseFragment2 = imageUpdater.parentFragment;
                    if (baseFragment2 == null || baseFragment2.getParentActivity() == null || (chatAttachAlert4 = imageUpdater.chatAttachAlert) == null) {
                        return;
                    }
                    if (i4 != 8 && i4 != 7) {
                        chatAttachAlert4.dismissWithButtonClick(i4);
                        if (i4 == 0) {
                            imageUpdater.openCamera();
                            return;
                        }
                        return;
                    }
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert4.photoLayout.getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = imageUpdater.chatAttachAlert.photoLayout.getSelectedPhotosOrder();
                    ArrayList arrayList = new ArrayList();
                    boolean z5 = false;
                    for (int i7 = 0; i7 < selectedPhotosOrder.size(); i7++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i7));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        arrayList.add(sendingMediaInfo);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            String str = photoEntry.imagePath;
                            if (str != null) {
                                sendingMediaInfo.path = str;
                            } else {
                                sendingMediaInfo.path = photoEntry.path;
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo.isVideo = photoEntry.isVideo;
                            sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                            sendingMediaInfo.discardLivePhoto = true;
                            CharSequence charSequence = photoEntry.caption;
                            sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                            sendingMediaInfo.entities = photoEntry.entities;
                            sendingMediaInfo.masks = photoEntry.stickers;
                            sendingMediaInfo.ttl = photoEntry.ttl;
                            TLRPC.VideoSize videoSize = photoEntry.emojiMarkup;
                            sendingMediaInfo.emojiMarkup = videoSize;
                            z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
                        } else if (obj instanceof MediaController.SearchImage) {
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                            String str2 = searchImage.imagePath;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                sendingMediaInfo.searchImage = searchImage;
                            }
                            sendingMediaInfo.thumbPath = searchImage.thumbPath;
                            sendingMediaInfo.coverPath = searchImage.coverPath;
                            sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                            CharSequence charSequence2 = searchImage.caption;
                            sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                            sendingMediaInfo.entities = searchImage.entities;
                            sendingMediaInfo.masks = searchImage.stickers;
                            sendingMediaInfo.ttl = searchImage.ttl;
                            TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                            if (botInlineResult != null && searchImage.type == 1) {
                                sendingMediaInfo.inlineResult = botInlineResult;
                                sendingMediaInfo.params = searchImage.params;
                            }
                            searchImage.date = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    ImageUpdater.access$100(imageUpdater, z5, arrayList);
                    if (i4 != 8) {
                        imageUpdater.chatAttachAlert.dismiss(true);
                    }
                }

                @Override
                public final void didSelectBot(TLRPC.User user) {
                }

                @Override
                public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                    chatAttachAlert$$ExternalSyntheticLambda7.run();
                }

                @Override
                public final boolean needEnterComment() {
                    return false;
                }

                @Override
                public final void onCameraOpened() {
                    AndroidUtilities.hideKeyboard(ImageUpdater.this.parentFragment.getFragmentView().findFocus());
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                }

                @Override
                public final void openAvatarsSearch() {
                    ImageUpdater.this.openSearch();
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return false;
                }

                @Override
                public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i4, int i5, long j, boolean z2, long j2) {
                }
            };
            chatAttachAlert3.parentImageUpdater = this;
        }
        int i4 = this.type;
        if (i4 == 1) {
            this.chatAttachAlert.selectedTextView.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.user.first_name));
        } else if (i4 == 2) {
            this.chatAttachAlert.selectedTextView.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.user.first_name));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ImageUpdaterDelegate imageUpdaterDelegate;
        BaseFragment baseFragment;
        int i3 = NotificationCenter.fileUploaded;
        int i4 = this.currentAccount;
        if (i == i3 || i == NotificationCenter.fileUploadFailed) {
            String str = (String) objArr[0];
            if (str.equals(this.uploadingImage)) {
                this.uploadingImage = null;
                if (i == i3) {
                    this.uploadedPhoto = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.uploadingVideo)) {
                    return;
                }
                this.uploadingVideo = null;
                if (i == i3) {
                    this.uploadedVideo = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.uploadingImage == null && this.uploadingVideo == null && this.convertingVideo == null) {
                NotificationCenter.getInstance(i4).removeObserver(this, i3);
                NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i == i3 && (imageUpdaterDelegate = this.delegate) != null) {
                    imageUpdaterDelegate.didUploadPhoto(this.uploadedPhoto, this.uploadedVideo, this.videoTimestamp, this.videoPath, this.bigPhoto, this.smallPhoto, this.isVideo, this.vectorMarkup);
                }
                cleanup$1();
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            String str3 = this.convertingVideo != null ? this.uploadingVideo : this.uploadingImage;
            if (this.delegate == null || !str2.equals(str3)) {
                return;
            }
            float fMin = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            ImageUpdaterDelegate imageUpdaterDelegate2 = this.delegate;
            this.currentImageProgress = fMin;
            imageUpdaterDelegate2.onUploadProgressChanged(fMin);
            return;
        }
        int i5 = NotificationCenter.fileLoaded;
        if (i == i5 || i == NotificationCenter.fileLoadFailed || i == NotificationCenter.httpFileDidLoad || i == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.currentImageProgress = 1.0f;
            if (str4.equals(this.uploadingImage)) {
                NotificationCenter.getInstance(i4).removeObserver(this, i5);
                NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i4);
                int i6 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i6);
                NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.uploadingImage = null;
                if (i == i5 || i == i6) {
                    processBitmap(false, ImageLoader.loadBitmap(this.finalPath, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.imageReceiver.setImageBitmap((Drawable) null);
                ImageUpdaterDelegate imageUpdaterDelegate3 = this.delegate;
                if (imageUpdaterDelegate3 != null) {
                    imageUpdaterDelegate3.didUploadFailed();
                    return;
                }
                return;
            }
            return;
        }
        int i7 = NotificationCenter.filePreparingFailed;
        if (i == i7) {
            if (((MessageObject) objArr[0]) != this.convertingVideo || this.parentFragment == null) {
                return;
            }
            NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i4).removeObserver(this, i7);
            NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            cleanup$1();
            return;
        }
        if (i != NotificationCenter.fileNewChunkAvailable) {
            if (i == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.convertingVideo && (baseFragment = this.parentFragment) != null) {
                this.uploadingVideo = (String) objArr[1];
                baseFragment.getFileLoader().uploadFile(this.uploadingVideo, false, false, (int) this.convertingVideo.videoEditedInfo.estimatedSize, 33554432, false);
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]) != this.convertingVideo || this.parentFragment == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long jLongValue = ((Long) objArr[2]).longValue();
        long jLongValue2 = ((Long) objArr[3]).longValue();
        this.parentFragment.getFileLoader().checkUploadNewDataAvailable(str5, false, jLongValue, jLongValue2);
        if (jLongValue2 != 0) {
            double dLongValue = ((Long) objArr[5]).longValue() / 1000000.0d;
            if (this.videoTimestamp > dLongValue) {
                this.videoTimestamp = dLongValue;
            }
            Bitmap bitmapCreateVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str5, (long) (this.videoTimestamp * 1000.0d), null, true);
            if (bitmapCreateVideoThumbnailAtTime != null) {
                File pathToAttach = FileLoader.getInstance(i4).getPathToAttach(this.smallPhoto, true);
                if (pathToAttach != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach);
                    }
                    pathToAttach.delete();
                }
                File pathToAttach2 = FileLoader.getInstance(i4).getPathToAttach(this.bigPhoto, true);
                if (pathToAttach2 != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach2);
                    }
                    pathToAttach2.delete();
                }
                this.bigPhoto = ImageLoader.scaleAndSaveImage(bitmapCreateVideoThumbnailAtTime, 800.0f, 800.0f, 80, false, 320, 320);
                TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapCreateVideoThumbnailAtTime, 150.0f, 150.0f, 80, false, 150, 150);
                this.smallPhoto = photoSizeScaleAndSaveImage;
                if (photoSizeScaleAndSaveImage != null) {
                    try {
                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(BitmapFactory.decodeFile(FileLoader.getInstance(i4).getPathToAttach(this.smallPhoto, true).getAbsolutePath())), this.smallPhoto.location.volume_id + "_" + this.smallPhoto.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(i4).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            this.videoPath = str5;
            this.uploadingVideo = str5;
            this.convertingVideo = null;
        }
    }

    public final boolean dismissCurrentDialog(Dialog dialog) {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert == null || dialog != chatAttachAlert) {
            return false;
        }
        chatAttachAlert.photoLayout.closeCamera(false);
        this.chatAttachAlert.dismissInternal();
        this.chatAttachAlert.photoLayout.hideCamera(true);
        return true;
    }

    public final boolean isUploadingImage() {
        return (this.uploadingImage == null && this.uploadingVideo == null && this.convertingVideo == null) ? false : true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView$2();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.photoLayout.onActivityResultFragment(i, intent, this.currentPicturePath);
                }
                this.currentPicturePath = null;
                return;
            }
            if (i == 13) {
                this.parentFragment.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.getInstance().setParentActivity(null, this.parentFragment, null);
                openPhotoForEdit(this.currentPicturePath, null, AndroidUtilities.getImageOrientation(this.currentPicturePath), false);
                AndroidUtilities.addMediaToGallery(this.currentPicturePath);
                this.currentPicturePath = null;
                return;
            }
            if (i == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(0, this, intent.getData()));
                return;
            }
            if (i == 15) {
                openPhotoForEdit(this.currentPicturePath, null, true);
                AndroidUtilities.addMediaToGallery(this.currentPicturePath);
                this.currentPicturePath = null;
            }
        }
    }

    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
            if (i == 17) {
                chatAttachAlertPhotoLayout.checkCamera(false);
                this.chatAttachAlert.photoLayout.checkStorage();
            } else if (i == 4) {
                chatAttachAlertPhotoLayout.checkStorage();
            }
        }
    }

    public final void openCamera() {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && this.parentFragment.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
            if (fileGeneratePicturePath != null) {
                if (i >= 24) {
                    intent.putExtra("output", FileProvider.getUriForFile(this.parentFragment.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                }
                this.currentPicturePath = fileGeneratePicturePath.getAbsolutePath();
            }
            this.parentFragment.startActivityForResult(intent, 13);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void openGallery() {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        int i = Build.VERSION.SDK_INT;
        if (i < 33 || parentActivity == null) {
            if (i >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
            return;
        }
        PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(this.canSelectVideo ? 3 : 1, false, false, null);
        photoAlbumPickerActivity.allowSearchImages = this.searchAvailable;
        photoAlbumPickerActivity.delegate = new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
            @Override
            public final void didSelectPhotos(ArrayList arrayList) throws FileNotFoundException {
                ImageUpdater.access$100(ImageUpdater.this, false, arrayList);
            }

            @Override
            public final void startPhotoSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    ImageUpdater.this.parentFragment.startActivityForResult(intent, 14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        };
        this.parentFragment.presentFragment(photoAlbumPickerActivity);
    }

    public final void openMenu(boolean z, Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i) {
        int i2 = 0;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        this.canceled = false;
        this.type = i;
        if (this.useAttachMenu) {
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null || baseFragment2.getParentActivity() == null) {
                return;
            }
            createChatAttachView$2();
            ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
            chatAttachAlert.openWithFrontFaceCamera = this.openWithFrontfaceCamera;
            chatAttachAlert.setMaxSelectedPhotos(1, false);
            this.chatAttachAlert.photoLayout.loadGalleryPhotos();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 21 || i3 == 22) {
                AndroidUtilities.hideKeyboard(this.parentFragment.getFragmentView().findFocus());
            }
            this.chatAttachAlert.init();
            this.chatAttachAlert.setOnHideListener(onDismissListener);
            int i4 = this.type;
            if (i4 != 0) {
                this.chatAttachAlert.setAvatarFor = new AvatarFor(i4, this.user);
            }
            ChatAttachAlert chatAttachAlert2 = this.chatAttachAlert;
            chatAttachAlert2.getClass();
            this.parentFragment.showDialog(chatAttachAlert2);
            return;
        }
        BottomSheet bottomSheet = new BottomSheet(this.parentFragment.getParentActivity(), null, false, false);
        bottomSheet.fixNavigationBar();
        if (i == 1) {
            bottomSheet.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.user.first_name);
            bottomSheet.bigTitle = true;
        } else if (i == 2) {
            bottomSheet.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.user.first_name);
            bottomSheet.bigTitle = true;
        } else {
            bottomSheet.title = LocaleController.getString(R.string.ChoosePhoto);
            bottomSheet.bigTitle = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        zzlo.m(R.drawable.msg_camera, 0, arrayList2, arrayList3);
        if (this.canSelectVideo) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            zzlo.m(R.drawable.msg_video, 4, arrayList2, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        zzlo.m(R.drawable.msg_photos, 1, arrayList2, arrayList3);
        if (this.searchAvailable) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            zzlo.m(R.drawable.msg_search, 2, arrayList2, arrayList3);
        }
        if (z) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            zzlo.m(R.drawable.msg_delete, 3, arrayList2, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = ((Integer) arrayList2.get(i5)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        ImageUpdater$$ExternalSyntheticLambda3 imageUpdater$$ExternalSyntheticLambda3 = new ImageUpdater$$ExternalSyntheticLambda3(this, arrayList3, runnable, i2);
        bottomSheet.items = charSequenceArr;
        bottomSheet.itemIcons = iArr;
        bottomSheet.onClickListener = imageUpdater$$ExternalSyntheticLambda3;
        bottomSheet.setOnHideListener(onDismissListener);
        this.parentFragment.showDialog(bottomSheet);
        if (z) {
            bottomSheet.setItemColor(arrayList.size() - 1, Theme.getColor(null, Theme.key_text_RedBold, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
        }
    }

    public final void openPhotoForEdit(String str, String str2, boolean z) {
        openPhotoForEdit(str, str2, new Pair(0, 0), z);
    }

    public final void openSearch() {
        if (this.parentFragment == null) {
            return;
        }
        final HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, null, map, arrayList, 1, false, null, this.forceDarkTheme);
        photoPickerActivity.delegate = new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            public boolean sendPressed;

            @Override
            public final void actionButtonPressed(int i, boolean z, boolean z2) throws FileNotFoundException {
                HashMap map2 = map;
                if (map2.isEmpty()) {
                    return;
                }
                ImageUpdater imageUpdater = ImageUpdater.this;
                if (imageUpdater.delegate == null || this.sendPressed || z) {
                    return;
                }
                this.sendPressed = true;
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList3 = arrayList;
                    if (i2 >= arrayList3.size()) {
                        ImageUpdater.access$100(imageUpdater, false, arrayList2);
                        return;
                    }
                    Object obj = map2.get(arrayList3.get(i2));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    arrayList2.add(sendingMediaInfo);
                    if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        String str = searchImage.imagePath;
                        if (str != null) {
                            sendingMediaInfo.path = str;
                        } else {
                            sendingMediaInfo.searchImage = searchImage;
                        }
                        sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                        sendingMediaInfo.thumbPath = searchImage.thumbPath;
                        CharSequence charSequence = searchImage.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = searchImage.entities;
                        sendingMediaInfo.masks = searchImage.stickers;
                        sendingMediaInfo.ttl = searchImage.ttl;
                    }
                    i2++;
                }
            }

            @Override
            public final boolean canFinishFragment() {
                return ImageUpdater.this.delegate.canFinishFragment();
            }

            @Override
            public final void onCaptionChanged(Editable editable) {
            }

            @Override
            public final void onOpenInPressed() {
            }

            @Override
            public final void selectedPhotosChanged() {
            }
        };
        photoPickerActivity.setMaxSelectedPhotos(1, false);
        photoPickerActivity.initialSearchString = this.delegate.getInitialSearchString();
        if (this.showingFromDialog) {
            this.parentFragment.showAsSheet(photoPickerActivity);
        } else {
            this.parentFragment.presentFragment(photoPickerActivity);
        }
    }

    public final void processBitmap(boolean z, Bitmap bitmap, MessageObject messageObject) {
        if (bitmap == null) {
            return;
        }
        this.uploadedVideo = null;
        this.uploadedPhoto = null;
        this.convertingVideo = null;
        this.videoPath = null;
        this.vectorMarkup = messageObject == null ? null : messageObject.emojiMarkup;
        this.bigPhoto = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
        TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
        this.smallPhoto = photoSizeScaleAndSaveImage;
        int i = this.currentAccount;
        if (photoSizeScaleAndSaveImage != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i).getPathToAttach(this.smallPhoto, true).getAbsolutePath());
                this.smallPhotoBitmap = bitmapDecodeFile;
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapDecodeFile), this.smallPhoto.location.volume_id + "_" + this.smallPhoto.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.bigPhoto != null) {
            UserConfig.getInstance(i).saveConfig(false);
            StringBuilder sb = new StringBuilder();
            sb.append(FileLoader.getDirectory(4));
            sb.append("/");
            sb.append(this.bigPhoto.location.volume_id);
            sb.append("_");
            this.uploadingImage = SurfaceContainer$$ExternalSyntheticOutline0.m(this.bigPhoto.location.local_id, ".jpg", sb);
            if (this.uploadAfterSelect) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    ImageUpdaterDelegate imageUpdaterDelegate = this.delegate;
                    if (imageUpdaterDelegate != null) {
                        imageUpdaterDelegate.didStartUpload(z, false);
                    }
                    this.isVideo = false;
                } else {
                    if (this.supportEmojiMarkup && !MessagesController.getInstance(i).uploadMarkupVideo) {
                        ImageUpdaterDelegate imageUpdaterDelegate2 = this.delegate;
                        if (imageUpdaterDelegate2 != null) {
                            imageUpdaterDelegate2.didStartUpload(z, true);
                        }
                        ImageUpdaterDelegate imageUpdaterDelegate3 = this.delegate;
                        if (imageUpdaterDelegate3 != null) {
                            imageUpdaterDelegate3.didUploadPhoto(null, null, 0.0d, null, this.bigPhoto, this.smallPhoto, this.isVideo, null);
                            this.delegate.didUploadPhoto(null, null, this.videoTimestamp, this.videoPath, this.bigPhoto, this.smallPhoto, this.isVideo, this.vectorMarkup);
                            cleanup$1();
                            return;
                        }
                        return;
                    }
                    this.convertingVideo = messageObject;
                    VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                    long j = videoEditedInfo.startTime;
                    if (j < 0) {
                        j = 0;
                    }
                    this.videoTimestamp = (videoEditedInfo.avatarStartTime - j) / 1000000.0d;
                    videoEditedInfo.shouldLimitFps = false;
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.uploadingImage = null;
                    ImageUpdaterDelegate imageUpdaterDelegate4 = this.delegate;
                    if (imageUpdaterDelegate4 != null) {
                        imageUpdaterDelegate4.didStartUpload(z, true);
                    }
                    this.isVideo = true;
                }
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploadFailed);
                if (this.uploadingImage != null) {
                    FileLoader.getInstance(i).uploadFile(this.uploadingImage, false, true, 16777216);
                }
            }
            ImageUpdaterDelegate imageUpdaterDelegate5 = this.delegate;
            if (imageUpdaterDelegate5 != null) {
                imageUpdaterDelegate5.didUploadPhoto(null, null, 0.0d, null, this.bigPhoto, this.smallPhoto, this.isVideo, null);
            }
        }
    }

    public final void processEntry(MediaController.PhotoEntry photoEntry) {
        Bitmap bitmapLoadBitmap;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        MessageObject messageObject = null;
        if ((photoEntry.isVideo || photoEntry.editedInfo != null) && !photoEntry.isLivePhoto()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject2.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject2.videoEditedInfo = photoEntry.editedInfo;
            messageObject2.emojiMarkup = photoEntry.emojiMarkup;
            bitmapLoadBitmap = ImageLoader.loadBitmap(photoEntry.thumbPath, null, 800.0f, 800.0f, true);
            messageObject = messageObject2;
        } else {
            bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
        }
        processBitmap(false, bitmapLoadBitmap, messageObject);
    }

    public final void openPhotoForEdit(String str, String str2, Pair pair, boolean z) {
        final ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.getInstance().setParentActivity(null, this.parentFragment, null);
        PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 1, false, new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final boolean allowCaption() {
                return false;
            }

            @Override
            public final boolean canScrollAway() {
                return false;
            }

            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z2, boolean z3) {
                ImageUpdaterDelegate imageUpdaterDelegate = ImageUpdater.this.delegate;
                if (imageUpdaterDelegate == null) {
                    return null;
                }
                return imageUpdaterDelegate.getCloseIntoObject();
            }

            @Override
            public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z2, int i2, int i3, boolean z3) {
                ImageUpdater.this.processEntry((MediaController.PhotoEntry) arrayList.get(0));
            }
        }, null);
        PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation = true;
    }
}
