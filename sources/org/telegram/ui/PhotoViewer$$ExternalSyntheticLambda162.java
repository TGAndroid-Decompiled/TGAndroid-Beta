package org.telegram.ui;

import android.text.TextUtils;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class PhotoViewer$$ExternalSyntheticLambda162 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Serializable f$1;
    public final boolean f$2;
    public final Object f$3;
    public final boolean f$4;
    public final boolean f$5;

    public PhotoViewer$$ExternalSyntheticLambda162(PhotoViewer.AnonymousClass16 anonymousClass16, int[] iArr, int[] iArr2, boolean z, boolean z2, boolean z3) {
        this.f$0 = anonymousClass16;
        this.f$1 = iArr;
        this.f$3 = iArr2;
        this.f$2 = z;
        this.f$4 = z2;
        this.f$5 = z3;
    }

    @Override
    public final void run() throws Throwable {
        BulletinFactory.FileType fileType;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                File file = (File) this.f$1;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i = photoViewer.lastImageId;
                photoViewer.lastImageId = i - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z = this.f$2;
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i, 0L, absolutePath, z ? 0 : ((Integer) imageOrientation.first).intValue(), z, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.sendPhotoType = 2;
                photoViewer.doneButtonPressed = false;
                photoViewer.placeProvider = new PhotoViewer.EmptyPhotoViewerProvider(photoViewer.placeProvider, (MessageObject) this.f$3, orientation, this.f$4, this.f$5) {
                    public final ImageReceiver.BitmapHolder thumbHolder;
                    public final PhotoViewerProvider val$chatPhotoProvider;
                    public final boolean val$finalCanEdit;
                    public final boolean val$finalCanReplace;
                    public final MessageObject val$finalMessageObject;
                    public final MediaController.PhotoEntry val$photoEntry;

                    public AnonymousClass76(PhotoViewerProvider photoViewerProvider, MessageObject messageObject, MediaController.PhotoEntry orientation2, boolean z2, boolean z3) {
                        this.val$chatPhotoProvider = photoViewerProvider;
                        this.val$finalMessageObject = messageObject;
                        this.val$photoEntry = orientation2;
                        this.val$finalCanEdit = z2;
                        this.val$finalCanReplace = z3;
                        this.thumbHolder = PhotoViewer.this.centerImage.getBitmapSafe();
                    }

                    @Override
                    public final boolean canCaptureMorePhotos() {
                        return false;
                    }

                    @Override
                    public final boolean canEdit() {
                        return this.val$chatPhotoProvider != null && this.val$finalCanEdit;
                    }

                    @Override
                    public final boolean canReplace() {
                        return this.val$chatPhotoProvider != null && this.val$finalCanReplace;
                    }

                    @Override
                    public final MessageObject getEditingMessageObject() {
                        return this.val$finalMessageObject;
                    }

                    @Override
                    public final PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i2, boolean z2, boolean z3) {
                        PhotoViewerProvider photoViewerProvider = this.val$chatPhotoProvider;
                        if (photoViewerProvider != null) {
                            return photoViewerProvider.getPlaceForPhoto(this.val$finalMessageObject, null, 0, z2, false);
                        }
                        return null;
                    }

                    @Override
                    public final ImageReceiver.BitmapHolder getThumbForPhoto(int i2) {
                        return this.thumbHolder;
                    }

                    @Override
                    public final void replaceButtonPressed(VideoEditedInfo videoEditedInfo) {
                        MediaController.PhotoEntry photoEntry = this.val$photoEntry;
                        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
                            sendMedia(videoEditedInfo, false, 0, true, false);
                        }
                    }

                    @Override
                    public final void sendButtonPressed(int i2, VideoEditedInfo videoEditedInfo, boolean z2, int i3, int i4, boolean z3) {
                        sendMedia(videoEditedInfo, z2, i3, false, z3);
                    }

                    public final void sendMedia(VideoEditedInfo videoEditedInfo, boolean z2, int i2, boolean z3, boolean z4) {
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        if (photoViewer2.parentChatActivity != null) {
                            ChatActivity.ReplyQuote replyQuote = null;
                            MessageObject messageObject = this.val$finalMessageObject;
                            MessageObject messageObject2 = z3 ? messageObject : null;
                            MediaController.PhotoEntry photoEntry = this.val$photoEntry;
                            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                                messageObject2.editingMessage = photoEntry.caption;
                                messageObject2.editingMessageEntities = photoEntry.entities;
                            }
                            if (z3 || messageObject == null) {
                                ChatActivity chatActivity = photoViewer2.parentChatActivity;
                                messageObject = chatActivity.replyingMessageObject;
                                replyQuote = chatActivity.replyingQuote;
                            }
                            ChatActivity.ReplyQuote replyQuote2 = replyQuote;
                            MessageObject messageObject3 = messageObject;
                            if (photoEntry.isVideo) {
                                if (videoEditedInfo != null) {
                                    AccountInstance accountInstance = photoViewer2.parentChatActivity.getAccountInstance();
                                    String str = photoEntry.path;
                                    long dialogId = photoViewer2.parentChatActivity.getDialogId();
                                    ChatActivity chatActivity2 = photoViewer2.parentChatActivity;
                                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, dialogId, messageObject3, chatActivity2.threadMessageObject, null, replyQuote2, photoEntry.entities, photoEntry.ttl, messageObject2, z2, i2, 0, z4, photoEntry.hasSpoiler, photoEntry.caption, chatActivity2.getMessageChatSendParams(), 0L, 0L, photoViewer2.parentChatActivity.getSendMonoForumPeerId(), photoViewer2.parentChatActivity.messageSuggestionParams);
                                    return;
                                }
                                MessageObject messageObject4 = messageObject2;
                                AccountInstance accountInstance2 = photoViewer2.parentChatActivity.getAccountInstance();
                                String str2 = photoEntry.path;
                                long dialogId2 = photoViewer2.parentChatActivity.getDialogId();
                                ChatActivity chatActivity3 = photoViewer2.parentChatActivity;
                                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, dialogId2, messageObject3, chatActivity3.threadMessageObject, null, replyQuote2, photoEntry.entities, photoEntry.ttl, messageObject4, z2, i2, 0, z4, photoEntry.hasSpoiler, photoEntry.caption, chatActivity3.getMessageChatSendParams(), 0L, 0L, photoViewer2.parentChatActivity.getSendMonoForumPeerId(), photoViewer2.parentChatActivity.messageSuggestionParams);
                                return;
                            }
                            MessageObject messageObject5 = messageObject2;
                            if (photoEntry.imagePath != null) {
                                AccountInstance accountInstance3 = photoViewer2.parentChatActivity.getAccountInstance();
                                String str3 = photoEntry.imagePath;
                                String str4 = photoEntry.thumbPath;
                                long dialogId3 = photoViewer2.parentChatActivity.getDialogId();
                                ChatActivity chatActivity4 = photoViewer2.parentChatActivity;
                                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, dialogId3, messageObject3, chatActivity4.threadMessageObject, null, replyQuote2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z2, i2, 0, 0, z4, photoEntry.caption, chatActivity4.getMessageChatSendParams(), 0L, 0L, photoViewer2.parentChatActivity.getSendMonoForumPeerId(), photoViewer2.parentChatActivity.messageSuggestionParams);
                                return;
                            }
                            if (photoEntry.path != null) {
                                AccountInstance accountInstance4 = photoViewer2.parentChatActivity.getAccountInstance();
                                String str5 = photoEntry.path;
                                String str6 = photoEntry.thumbPath;
                                long dialogId4 = photoViewer2.parentChatActivity.getDialogId();
                                ChatActivity chatActivity5 = photoViewer2.parentChatActivity;
                                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, dialogId4, messageObject3, chatActivity5.threadMessageObject, null, replyQuote2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z2, i2, 0, 0, z4, photoEntry.caption, chatActivity5.getMessageChatSendParams(), 0L, 0L, photoViewer2.parentChatActivity.getSendMonoForumPeerId(), photoViewer2.parentChatActivity.messageSuggestionParams);
                            }
                        }
                    }
                };
                photoViewer.selectedPhotosAdapter.mObservable.notifyChanged();
                if (photoViewer.velocityTracker == null) {
                    photoViewer.velocityTracker = VelocityTracker.obtain();
                }
                photoViewer.aboutToSwitchTo = 3;
                photoViewer.togglePhotosListView(false, false);
                photoViewer.toggleActionBar(true, false, PhotoViewer.ActionBarToggleParams.DEFAULT);
                ChatActivity chatActivity = photoViewer.parentChatActivity;
                if (chatActivity == null || chatActivity.chatActivityEnterView == null || !chatActivity.isKeyboardVisible()) {
                    photoViewer.makeFocusable$1();
                } else {
                    AndroidUtilities.hideKeyboard(photoViewer.parentChatActivity.chatActivityEnterView.messageEditText);
                }
                photoViewer.backgroundDrawable.setAlpha(255);
                photoViewer.containerView.setAlpha(1.0f);
                photoViewer.onPhotoShow(null, null, null, null, null, null, Collections.singletonList(orientation2), 0, null);
                photoViewer.pickerView.setTranslationY(AndroidUtilities.dp(photoViewer.isCurrentVideo ? 154.0f : 96.0f));
                photoViewer.pickerViewSendButton.setTranslationY(AndroidUtilities.dp(photoViewer.isCurrentVideo ? 154.0f : 96.0f));
                PhotoViewer.AnonymousClass15 anonymousClass15 = photoViewer.actionBar;
                anonymousClass15.setTranslationY(-anonymousClass15.getHeight());
                photoViewer.captionTextViewSwitcher.setTranslationY(AndroidUtilities.dp(photoViewer.isCurrentVideo ? 154.0f : 96.0f));
                photoViewer.createPaintView();
                photoViewer.switchToPaintMode();
                photoViewer.aboutToSwitchTo = 0;
                break;
            default:
                PhotoViewer.AnonymousClass16 anonymousClass16 = (PhotoViewer.AnonymousClass16) this.f$0;
                int[] iArr = (int[]) this.f$1;
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                int i3 = ((int[]) this.f$3)[0];
                if (i2 == i3) {
                    PhotoViewer.FrameLayoutDrawer frameLayoutDrawer = PhotoViewer.this.containerView;
                    boolean z2 = this.f$4;
                    boolean z3 = this.f$2;
                    int i4 = (z2 ? 1 : 0) + (z3 ? 1 : 0);
                    boolean z4 = this.f$5;
                    if (i4 + (z4 ? 1 : 0) > 1) {
                        fileType = BulletinFactory.FileType.MEDIA;
                    } else if (z4) {
                        fileType = i3 > 1 ? BulletinFactory.FileType.LIVEPHOTOS : BulletinFactory.FileType.LIVEPHOTO;
                    } else if (z3) {
                        fileType = i3 > 1 ? BulletinFactory.FileType.VIDEOS : BulletinFactory.FileType.VIDEO;
                    } else {
                        fileType = i3 > 1 ? BulletinFactory.FileType.PHOTOS : BulletinFactory.FileType.PHOTO;
                    }
                    new BulletinFactory(frameLayoutDrawer, null).createDownloadBulletin(fileType, i3, -115203550, -1, null).show();
                }
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda162(PhotoViewer photoViewer, File file, boolean z, MessageObject messageObject, boolean z2, boolean z3) {
        this.f$0 = photoViewer;
        this.f$1 = file;
        this.f$2 = z;
        this.f$3 = messageObject;
        this.f$4 = z2;
        this.f$5 = z3;
    }
}
