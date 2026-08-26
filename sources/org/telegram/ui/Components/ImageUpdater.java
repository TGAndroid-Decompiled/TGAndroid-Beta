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
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
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
import org.telegram.ui.ChannelAdminLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoAlbumPickerActivity;
import org.telegram.ui.PhotoCropActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoViewer;

public class ImageUpdater implements NotificationCenter.NotificationCenterDelegate, PhotoCropActivity.PhotoEditActivityDelegate {
    public static final int FOR_TYPE_CHANNEL = 1;
    public static final int FOR_TYPE_COMMUNITY = 3;
    public static final int FOR_TYPE_GROUP = 2;
    public static final int FOR_TYPE_USER = 0;
    private static final int ID_RECORD_VIDEO = 4;
    private static final int ID_REMOVE_PHOTO = 3;
    private static final int ID_SEARCH_WEB = 2;
    private static final int ID_TAKE_PHOTO = 0;
    private static final int ID_UPLOAD_FROM_GALLERY = 1;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_SET_PHOTO_FOR_USER = 1;
    public static final int TYPE_SUGGEST_PHOTO_FOR_USER = 2;
    private static final int attach_photo = 0;
    private TLRPC.PhotoSize bigPhoto;
    private boolean canSelectVideo;
    private boolean canceled;
    private ChatAttachAlert chatAttachAlert;
    private boolean clearAfterUpdate;
    private MessageObject convertingVideo;
    private float currentImageProgress;
    public String currentPicturePath;
    private ImageUpdaterDelegate delegate;
    private String finalPath;
    private boolean forUser;
    private boolean forceDarkTheme;
    private boolean isUser;
    private boolean isVideo;
    private boolean openWithFrontfaceCamera;
    public BaseFragment parentFragment;
    public final int setForType;
    private boolean showingFromDialog;
    private TLRPC.PhotoSize smallPhoto;
    private Bitmap smallPhotoBitmap;
    private boolean supportEmojiMarkup;
    private int type;
    private TLRPC.InputFile uploadedPhoto;
    private TLRPC.InputFile uploadedVideo;
    private String uploadingImage;
    private String uploadingVideo;
    private TLRPC.User user;
    private TLRPC.VideoSize vectorMarkup;
    private String videoPath;
    private double videoTimestamp;
    private int currentAccount = UserConfig.selectedAccount;
    private File picturePath = null;
    private boolean useAttachMenu = true;
    private boolean searchAvailable = true;
    private boolean uploadAfterSelect = true;
    private ImageReceiver imageReceiver = new ImageReceiver(null);

    public static class AvatarFor {
        public TLRPC.User fromObject;
        public boolean isVideo;
        public final TLObject object;
        public boolean self;
        public final int type;

        public AvatarFor(TLObject tLObject, int i) {
            this.object = tLObject;
            this.type = i;
            this.self = (tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self;
        }
    }

    public ImageUpdater(boolean z, int i, boolean z2) {
        this.canSelectVideo = z;
        this.supportEmojiMarkup = z2;
        this.setForType = i;
    }

    private void cleanup() {
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

    private void createChatAttachView() {
        ImageUpdater$$ExternalSyntheticLambda3 imageUpdater$$ExternalSyntheticLambda3;
        int i = 0;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (this.chatAttachAlert == null) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(this.parentFragment.getParentActivity(), this.parentFragment, this.forceDarkTheme, this.showingFromDialog);
            this.chatAttachAlert = chatAttachAlert;
            int i2 = this.canSelectVideo ? 2 : 1;
            boolean z = this.searchAvailable;
            ImageUpdaterDelegate imageUpdaterDelegate = this.delegate;
            if (imageUpdaterDelegate == null || !imageUpdaterDelegate.supportsBulletin()) {
                imageUpdater$$ExternalSyntheticLambda3 = null;
            } else {
                ImageUpdaterDelegate imageUpdaterDelegate2 = this.delegate;
                Objects.requireNonNull(imageUpdaterDelegate2);
                imageUpdater$$ExternalSyntheticLambda3 = new ImageUpdater$$ExternalSyntheticLambda3(imageUpdaterDelegate2, i);
            }
            chatAttachAlert.setAvatarPicker(i2, z, imageUpdater$$ExternalSyntheticLambda3);
            this.chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                private void processSelectedAttach(int i3) {
                    if (i3 == 0) {
                        ImageUpdater.this.openCamera();
                    }
                }

                @Override
                public void didPressedButton(int i3, boolean z2, boolean z3, int i4, int i5, long j, boolean z4, boolean z5, long j2) throws FileNotFoundException {
                    BaseFragment baseFragment2 = ImageUpdater.this.parentFragment;
                    if (baseFragment2 == null || baseFragment2.getParentActivity() == null || ImageUpdater.this.chatAttachAlert == null) {
                        return;
                    }
                    if (i3 != 8 && i3 != 7) {
                        ImageUpdater.this.chatAttachAlert.dismissWithButtonClick(i3);
                        processSelectedAttach(i3);
                        return;
                    }
                    HashMap<Object, Object> selectedPhotos = ImageUpdater.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = ImageUpdater.this.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    ArrayList arrayList = new ArrayList();
                    boolean z6 = false;
                    for (int i6 = 0; i6 < selectedPhotosOrder.size(); i6++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
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
                            z6 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
                    ImageUpdater.this.didSelectPhotos(z6, arrayList);
                    if (i3 != 8) {
                        ImageUpdater.this.chatAttachAlert.dismiss(true);
                    }
                }

                @Override
                public void didSelectBot(TLRPC.User user) {
                }

                @Override
                public void doOnIdle(Runnable runnable) {
                    runnable.run();
                }

                @Override
                public View getRevealView() {
                    return null;
                }

                @Override
                public boolean needEnterComment() {
                    return false;
                }

                @Override
                public void onCameraOpened() {
                    AndroidUtilities.hideKeyboard(ImageUpdater.this.parentFragment.getFragmentView().findFocus());
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public void openAvatarsSearch() {
                    ImageUpdater.this.openSearch();
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i3, int i4, long j, boolean z3, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z2, i3, i4, j, z3, j2);
                }
            });
            this.chatAttachAlert.setImageUpdater(this);
        }
        int i3 = this.type;
        if (i3 == 1) {
            this.chatAttachAlert.getSelectedTextView().setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.user.first_name));
        } else if (i3 == 2) {
            this.chatAttachAlert.getSelectedTextView().setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.user.first_name));
        }
    }

    public void didSelectPhotos(boolean z, ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList) throws FileNotFoundException {
        MessageObject messageObject;
        Bitmap bitmapLoadBitmap;
        if (arrayList.isEmpty()) {
            return;
        }
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = arrayList.get(0);
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
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                        if (closestPhotoSizeWithSize != null) {
                            File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                            this.finalPath = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                bitmapLoadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
                                this.uploadingImage = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                            }
                        }
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        this.finalPath = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            this.uploadingImage = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.httpFileDidFailedLoad);
                            this.imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                        } else {
                            bitmapLoadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                    processBitmap(z, bitmapLoadBitmap2, messageObject);
                }
                messageObject = null;
                processBitmap(z, bitmapLoadBitmap2, messageObject);
            }
            bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
            messageObject = null;
            bitmapLoadBitmap2 = bitmapLoadBitmap;
        }
        processBitmap(z, bitmapLoadBitmap2, messageObject);
    }

    public void lambda$openMenu$0(ArrayList arrayList, Runnable runnable, DialogInterface dialogInterface, int i) {
        int iIntValue = ((Integer) arrayList.get(i)).intValue();
        if (iIntValue == 0) {
            openCamera();
            return;
        }
        if (iIntValue == 1) {
            openGallery();
            return;
        }
        if (iIntValue == 2) {
            openSearch();
        } else if (iIntValue == 3) {
            runnable.run();
        } else {
            if (iIntValue != 4) {
                return;
            }
            openVideoCamera();
        }
    }

    public void lambda$startCrop$1(String str, Uri uri) {
        try {
            LaunchActivity launchActivity = (LaunchActivity) this.parentFragment.getParentActivity();
            if (launchActivity == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("photoPath", str);
            } else if (uri != null) {
                bundle.putParcelable("photoUri", uri);
            }
            PhotoCropActivity photoCropActivity = new PhotoCropActivity(bundle);
            photoCropActivity.setDelegate(this);
            launchActivity.lambda$runLinkRequest$100(photoCropActivity);
        } catch (Exception e) {
            FileLog.e(e);
            processBitmap(false, ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true), null);
        }
    }

    private void openAttachMenu(DialogInterface.OnDismissListener onDismissListener) {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.setOpenWithFrontFaceCamera(this.openWithFrontfaceCamera);
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            AndroidUtilities.hideKeyboard(this.parentFragment.getFragmentView().findFocus());
        }
        this.chatAttachAlert.init();
        this.chatAttachAlert.setOnHideListener(onDismissListener);
        int i2 = this.type;
        if (i2 != 0) {
            this.chatAttachAlert.avatarFor(new AvatarFor(this.user, i2));
        }
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        chatAttachAlert.forUser = this.forUser;
        this.parentFragment.showDialog(chatAttachAlert);
    }

    private void processBitmap(boolean z, Bitmap bitmap, MessageObject messageObject) {
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
        if (photoSizeScaleAndSaveImage != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(this.smallPhoto, true).getAbsolutePath());
                this.smallPhotoBitmap = bitmapDecodeFile;
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapDecodeFile), this.smallPhoto.location.volume_id + "_" + this.smallPhoto.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.bigPhoto != null) {
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
            StringBuilder sb = new StringBuilder();
            sb.append(FileLoader.getDirectory(4));
            sb.append("/");
            sb.append(this.bigPhoto.location.volume_id);
            sb.append("_");
            this.uploadingImage = Fragment$$ExternalSyntheticOutline0.m(this.bigPhoto.location.local_id, ".jpg", sb);
            if (this.uploadAfterSelect) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    ImageUpdaterDelegate imageUpdaterDelegate = this.delegate;
                    if (imageUpdaterDelegate != null) {
                        imageUpdaterDelegate.didStartUpload(z, false);
                    }
                    this.isVideo = false;
                } else {
                    if (this.supportEmojiMarkup && !MessagesController.getInstance(this.currentAccount).uploadMarkupVideo) {
                        ImageUpdaterDelegate imageUpdaterDelegate2 = this.delegate;
                        if (imageUpdaterDelegate2 != null) {
                            imageUpdaterDelegate2.didStartUpload(z, true);
                        }
                        ImageUpdaterDelegate imageUpdaterDelegate3 = this.delegate;
                        if (imageUpdaterDelegate3 != null) {
                            imageUpdaterDelegate3.didUploadPhoto(null, null, 0.0d, null, this.bigPhoto, this.smallPhoto, this.isVideo, null);
                            this.delegate.didUploadPhoto(null, null, this.videoTimestamp, this.videoPath, this.bigPhoto, this.smallPhoto, this.isVideo, this.vectorMarkup);
                            cleanup();
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
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.uploadingImage = null;
                    ImageUpdaterDelegate imageUpdaterDelegate4 = this.delegate;
                    if (imageUpdaterDelegate4 != null) {
                        imageUpdaterDelegate4.didStartUpload(z, true);
                    }
                    this.isVideo = true;
                }
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
                if (this.uploadingImage != null) {
                    FileLoader.getInstance(this.currentAccount).uploadFile(this.uploadingImage, false, true, 16777216);
                }
            }
            ImageUpdaterDelegate imageUpdaterDelegate5 = this.delegate;
            if (imageUpdaterDelegate5 != null) {
                imageUpdaterDelegate5.didUploadPhoto(null, null, 0.0d, null, this.bigPhoto, this.smallPhoto, this.isVideo, null);
            }
        }
    }

    private void startCrop(String str, Uri uri) {
        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, str, uri, 0));
    }

    public void cancel() {
        this.canceled = true;
        if (this.uploadingImage != null) {
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.uploadingImage, false);
        }
        if (this.uploadingVideo != null) {
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.uploadingVideo, false);
        }
        ImageUpdaterDelegate imageUpdaterDelegate = this.delegate;
        if (imageUpdaterDelegate != null) {
            imageUpdaterDelegate.didUploadFailed();
        }
    }

    public void clear() {
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

    @Override
    public void didFinishEdit(Bitmap bitmap) {
        processBitmap(false, bitmap, null);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ImageUpdaterDelegate imageUpdaterDelegate;
        BaseFragment baseFragment;
        int i3 = NotificationCenter.fileUploaded;
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
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i == i3 && (imageUpdaterDelegate = this.delegate) != null) {
                    imageUpdaterDelegate.didUploadPhoto(this.uploadedPhoto, this.uploadedVideo, this.videoTimestamp, this.videoPath, this.bigPhoto, this.smallPhoto, this.isVideo, this.vectorMarkup);
                }
                cleanup();
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
        int i4 = NotificationCenter.fileLoaded;
        if (i == i4 || i == NotificationCenter.fileLoadFailed || i == NotificationCenter.httpFileDidLoad || i == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.currentImageProgress = 1.0f;
            if (str4.equals(this.uploadingImage)) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i4);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i5 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i5);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.uploadingImage = null;
                if (i == i4 || i == i5) {
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
        int i6 = NotificationCenter.filePreparingFailed;
        if (i == i6) {
            if (((MessageObject) objArr[0]) != this.convertingVideo || this.parentFragment == null) {
                return;
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i6);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            cleanup();
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
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.smallPhoto, true);
                if (pathToAttach != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach);
                    }
                    pathToAttach.delete();
                }
                File pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.bigPhoto, true);
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
                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(BitmapFactory.decodeFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(this.smallPhoto, true).getAbsolutePath())), this.smallPhoto.location.volume_id + "_" + this.smallPhoto.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            this.videoPath = str5;
            this.uploadingVideo = str5;
            this.convertingVideo = null;
        }
    }

    public boolean dismissCurrentDialog(Dialog dialog) {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert == null || dialog != chatAttachAlert) {
            return false;
        }
        chatAttachAlert.getPhotoLayout().closeCamera(false);
        this.chatAttachAlert.dismissInternal();
        this.chatAttachAlert.getPhotoLayout().hideCamera(true);
        return true;
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.chatAttachAlert;
    }

    public float getCurrentImageProgress() {
        return this.currentImageProgress;
    }

    public Bitmap getPreviewBitmap() {
        return this.smallPhotoBitmap;
    }

    public String getUploadingFilePath() {
        String str = this.uploadingImage;
        if (str != null) {
            return str;
        }
        String str2 = this.uploadingVideo;
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isUploadingImage() {
        return (this.uploadingImage == null && this.uploadingVideo == null && this.convertingVideo == null) ? false : true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.onActivityResultFragment(i, intent, this.currentPicturePath);
                }
                this.currentPicturePath = null;
                return;
            }
            if (i == 13) {
                this.parentFragment.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                openPhotoForEdit(this.currentPicturePath, (String) null, AndroidUtilities.getImageOrientation(this.currentPicturePath), false);
                AndroidUtilities.addMediaToGallery(this.currentPicturePath);
                this.currentPicturePath = null;
                return;
            }
            if (i == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                startCrop(null, intent.getData());
                return;
            }
            if (i == 15) {
                openPhotoForEdit(this.currentPicturePath, (String) null, 0, true);
                AndroidUtilities.addMediaToGallery(this.currentPicturePath);
                this.currentPicturePath = null;
            }
        }
    }

    public void onPause() {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            if (i == 17) {
                chatAttachAlert.getPhotoLayout().checkCamera(false);
                this.chatAttachAlert.getPhotoLayout().checkStorage();
            } else if (i == 4) {
                chatAttachAlert.getPhotoLayout().checkStorage();
            }
        }
    }

    public void onResume() {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
    }

    public void openCamera() {
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

    public void openGallery() {
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
        PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(this.canSelectVideo ? PhotoAlbumPickerActivity.SELECT_TYPE_AVATAR_VIDEO : PhotoAlbumPickerActivity.SELECT_TYPE_AVATAR, false, false, null);
        photoAlbumPickerActivity.setAllowSearchImages(this.searchAvailable);
        photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
            @Override
            public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i2) throws FileNotFoundException {
                ImageUpdater.this.didSelectPhotos(false, arrayList);
            }

            @Override
            public void startPhotoSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    ImageUpdater.this.parentFragment.startActivityForResult(intent, 14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        this.parentFragment.presentFragment(photoAlbumPickerActivity);
    }

    public void openMenu(boolean z, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i) {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        this.canceled = false;
        this.type = i;
        if (this.useAttachMenu) {
            openAttachMenu(onDismissListener);
            return;
        }
        BottomSheet bottomSheet = new BottomSheet(this.parentFragment.getParentActivity(), false, false, null);
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
        final ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_camera, arrayList2, 0, arrayList3);
        if (this.canSelectVideo) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_video, arrayList2, 4, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_photos, arrayList2, 1, arrayList3);
        if (this.searchAvailable) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_search, arrayList2, 2, arrayList3);
        }
        if (z) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_delete, arrayList2, 3, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList2.get(i2)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f$0.lambda$openMenu$0(arrayList3, runnable, dialogInterface, i3);
            }
        };
        bottomSheet.items = charSequenceArr;
        bottomSheet.itemIcons = iArr;
        bottomSheet.onClickListener = onClickListener;
        bottomSheet.setOnHideListener(onDismissListener);
        this.parentFragment.showDialog(bottomSheet);
        if (z) {
            bottomSheet.setItemColor(arrayList.size() - 1, Theme.getColor(null, Theme.key_text_RedBold, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
        }
    }

    public void openPhotoForEdit(String str, String str2, int i, boolean z) {
        openPhotoForEdit(str, str2, new Pair<>(Integer.valueOf(i), 0), z);
    }

    public void openSearch() {
        if (this.parentFragment == null) {
            return;
        }
        final HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, null, map, arrayList, 1, false, null, this.forceDarkTheme);
        photoPickerActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            private boolean sendPressed;

            private void sendSelectedPhotos(HashMap<Object, Object> map2, ArrayList<Object> arrayList2, boolean z, int i) {
            }

            @Override
            public void actionButtonPressed(boolean z, boolean z2, int i, int i2) throws FileNotFoundException {
                if (map.isEmpty() || ImageUpdater.this.delegate == null || this.sendPressed || z) {
                    return;
                }
                this.sendPressed = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Object obj = map.get(arrayList.get(i3));
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
                }
                ImageUpdater.this.didSelectPhotos(false, arrayList2);
            }

            @Override
            public boolean canFinishFragment() {
                return ImageUpdater.this.delegate.canFinishFragment();
            }

            @Override
            public void onCaptionChanged(CharSequence charSequence) {
            }

            @Override
            public final void onOpenInPressed() {
                PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$onOpenInPressed(this);
            }

            @Override
            public void selectedPhotosChanged() {
            }
        });
        photoPickerActivity.setMaxSelectedPhotos(1, false);
        photoPickerActivity.setInitialSearchString(this.delegate.getInitialSearchString());
        if (this.showingFromDialog) {
            this.parentFragment.showAsSheet(photoPickerActivity);
        } else {
            this.parentFragment.presentFragment(photoPickerActivity);
        }
    }

    public void openVideoCamera() {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && this.parentFragment.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            File fileGenerateVideoPath = AndroidUtilities.generateVideoPath();
            if (fileGenerateVideoPath != null) {
                if (i >= 24) {
                    intent.putExtra("output", FileProvider.getUriForFile(this.parentFragment.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGenerateVideoPath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(fileGenerateVideoPath));
                }
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("android.intent.extra.durationLimit", 10);
                this.currentPicturePath = fileGenerateVideoPath.getAbsolutePath();
            }
            this.parentFragment.startActivityForResult(intent, 15);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void processEntry(MediaController.PhotoEntry photoEntry) throws FileNotFoundException {
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

    public void setCanSelectVideo(boolean z) {
        this.canSelectVideo = z;
    }

    public void setDelegate(ImageUpdaterDelegate imageUpdaterDelegate) {
        this.delegate = imageUpdaterDelegate;
    }

    public void setForceDarkTheme(boolean z) {
        this.forceDarkTheme = z;
    }

    public void setOpenWithFrontfaceCamera(boolean z) {
        this.openWithFrontfaceCamera = z;
    }

    public void setSearchAvailable(boolean z) {
        this.searchAvailable = z;
        this.useAttachMenu = z;
    }

    public void setShowingFromDialog(boolean z) {
        this.showingFromDialog = z;
    }

    public void setUploadAfterSelect(boolean z) {
        this.uploadAfterSelect = z;
    }

    public void setUser(TLRPC.User user) {
        this.user = user;
    }

    public void showAvatarConstructor(TLRPC.VideoSize videoSize) {
        createChatAttachView();
        this.chatAttachAlert.getPhotoLayout().showAvatarConstructorFragment(null, videoSize);
    }

    public void updateColors() {
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.checkColors();
        }
    }

    public void openPhotoForEdit(String str, String str2, Pair<Integer, Integer> pair, boolean z) {
        final ArrayList<Object> arrayList = new ArrayList<>();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.getInstance().setParentActivity(this.parentFragment);
        PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 1, false, new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public boolean allowCaption() {
                return false;
            }

            @Override
            public boolean canScrollAway() {
                return false;
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z2, boolean z3) {
                if (ImageUpdater.this.delegate == null) {
                    return null;
                }
                return ImageUpdater.this.delegate.getCloseIntoObject();
            }

            @Override
            public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z2, int i2, int i3, boolean z3) throws FileNotFoundException {
                ImageUpdater.this.processEntry((MediaController.PhotoEntry) arrayList.get(0));
            }
        }, null);
        PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation = true;
    }

    public void setSearchAvailable(boolean z, boolean z2) {
        this.useAttachMenu = z2;
        this.searchAvailable = z;
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

        public abstract class CC {
            public static boolean $default$canFinishFragment(ImageUpdaterDelegate imageUpdaterDelegate) {
                return true;
            }

            public static PhotoViewer.PlaceProviderObject $default$getCloseIntoObject(ImageUpdaterDelegate imageUpdaterDelegate) {
                return null;
            }

            public static String $default$getInitialSearchString(ImageUpdaterDelegate imageUpdaterDelegate) {
                return null;
            }

            public static boolean $default$supportsBulletin(ImageUpdaterDelegate imageUpdaterDelegate) {
                return false;
            }

            public static void $default$didUploadFailed(ImageUpdaterDelegate imageUpdaterDelegate) {
            }

            public static void $default$onUploadProgressChanged(ImageUpdaterDelegate imageUpdaterDelegate, float f) {
            }

            public static void $default$didStartUpload(ImageUpdaterDelegate imageUpdaterDelegate, boolean z, boolean z2) {
            }
        }
    }
}
