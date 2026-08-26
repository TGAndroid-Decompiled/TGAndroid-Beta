package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.CommunitySheet;

public final class ProfileActivity$$ExternalSyntheticLambda85 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final boolean f$1;

    public ProfileActivity$$ExternalSyntheticLambda85(boolean z, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        float f;
        PaintView.AnonymousClass7 anonymousClass7;
        Size size;
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (!profileActivity.finishFragmentIfPreviousIsChatActivity()) {
                    if (BulletinFactory.canShowBulletin(profileActivity)) {
                        int iIntValue = num.intValue();
                        boolean z = this.f$1;
                        if (iIntValue == 1) {
                            BulletinFactory.createDissableSharingBulletin(profileActivity, null, z).show();
                        } else if (num.intValue() == 2) {
                            BulletinFactory.createDissableSharingBulletin(profileActivity, DialogObject.getShortName(profileActivity.userId), z).show();
                        } else if (tL_error != null) {
                            BulletinFactory.showError(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.flagSecure;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    break;
                }
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj2;
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                if (obj == null) {
                    storyRecorder.getClass();
                    break;
                } else if (storyRecorder.galleryListViewOpening == null && !storyRecorder.scrollingY && storyRecorder.isGalleryOpen()) {
                    int i = 0;
                    if (!this.f$1) {
                        storyRecorder.showVideoTimer(false, true);
                        storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                        RecordControl recordControl = storyRecorder.recordControl;
                        boolean z2 = storyRecorder.mode == 1;
                        recordControl.overrideStartModeIsVideoT = -1.0f;
                        recordControl.startModeIsVideo = z2;
                        recordControl.invalidate();
                        storyRecorder.animateGalleryListView(false);
                        boolean z3 = obj instanceof MediaController.PhotoEntry;
                        int i2 = storyRecorder.currentAccount;
                        if (!z3) {
                            if (obj instanceof StoryEntry) {
                                StoryEntry storyEntry = (StoryEntry) obj;
                                if (storyEntry.file == null && !storyEntry.isCollage()) {
                                    storyRecorder.downloadButton.showToast(R.raw.error, "Failed to load draft");
                                    DraftsController draftsController = MessagesController.getInstance(i2).getStoriesController().draftsController;
                                    draftsController.getClass();
                                    ArrayList arrayList = new ArrayList(1);
                                    arrayList.add(storyEntry);
                                    draftsController.delete(arrayList);
                                } else {
                                    storyEntry.botId = storyRecorder.botId;
                                    storyEntry.botLang = storyRecorder.botLang;
                                    storyRecorder.mode = storyEntry.isVideo ? 1 : 0;
                                    storyEntry.blurredVideoThumb = bitmap;
                                    storyRecorder.fromGallery = false;
                                    StoryRecorder.AnonymousClass6 anonymousClass6 = storyRecorder.collageLayoutView;
                                    anonymousClass6.getClass();
                                    if (storyEntry.collageContent == null) {
                                        anonymousClass6.clear$2();
                                    } else {
                                        anonymousClass6.setLayout(storyEntry.collage);
                                        while (true) {
                                            ArrayList arrayList2 = anonymousClass6.parts;
                                            if (i < arrayList2.size()) {
                                                ((CollageLayoutView2.Part) arrayList2.get(i)).setContent((StoryEntry) storyEntry.collageContent.get(i));
                                                i++;
                                            }
                                        }
                                    }
                                    storyRecorder.outputEntry = storyEntry;
                                    if (z3) {
                                        StoryPrivacySelector.applySaved(i2, storyEntry);
                                    }
                                    storyRecorder.navigateTo(1, true);
                                }
                            }
                            break;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i = 1;
                            }
                            storyRecorder.mode = i;
                            StoryEntry storyEntryFromPhotoEntry = StoryEntry.fromPhotoEntry(photoEntry);
                            storyEntryFromPhotoEntry.blurredVideoThumb = bitmap;
                            storyEntryFromPhotoEntry.botId = storyRecorder.botId;
                            storyEntryFromPhotoEntry.botLang = storyRecorder.botLang;
                            storyEntryFromPhotoEntry.setupMatrix();
                            storyRecorder.fromGallery = true;
                            if (storyRecorder.collageLayoutView.hasLayout()) {
                                storyRecorder.outputFile = null;
                                storyEntryFromPhotoEntry.videoVolume = 1.0f;
                                if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoEntry)) {
                                    storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                                }
                                storyRecorder.updateActionBarButtons(true);
                            } else {
                                storyEntryFromPhotoEntry.setupMultipleStoriesSelector();
                                storyRecorder.outputEntry = storyEntryFromPhotoEntry;
                                if (z3) {
                                    StoryPrivacySelector.applySaved(i2, storyEntryFromPhotoEntry);
                                }
                                storyRecorder.navigateTo(1, true);
                            }
                        }
                    } else if (storyRecorder.outputEntry != null) {
                        storyRecorder.createPhotoPaintView();
                        storyRecorder.outputEntry.editedMedia = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                            anonymousClass24.appearAnimation(anonymousClass24.createPhoto(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            StoryRecorder.AnonymousClass24 anonymousClass25 = storyRecorder.paintView;
                            TLObject tLObject = (TLObject) obj;
                            anonymousClass25.forceChanges = true;
                            if (tLObject instanceof TLRPC.Photo) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000);
                                f = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h : 1.0f;
                                anonymousClass7 = anonymousClass25.entitiesView;
                                if (f > 1.0f) {
                                    float fFloor = (float) Math.floor(((double) Math.max(anonymousClass25.w, anonymousClass7.getMeasuredWidth())) * 0.5d);
                                    size = new Size(fFloor, fFloor / f);
                                } else {
                                    float fFloor2 = (float) Math.floor(((double) Math.max(anonymousClass25.h, anonymousClass7.getMeasuredHeight())) * 0.5d);
                                    size = new Size(f * fFloor2, fFloor2);
                                }
                                PhotoView photoView = new PhotoView(anonymousClass25.getContext(), anonymousClass25.centerPositionForEntity$1(), size, tLObject);
                                photoView.setDelegate(anonymousClass25);
                                anonymousClass7.addView(photoView);
                                anonymousClass25.checkEntitiesIsVideo();
                                anonymousClass25.appearAnimation(photoView);
                            } else if (!(tLObject instanceof TLRPC.Document)) {
                                boolean z4 = tLObject instanceof TLRPC.WebDocument;
                            }
                            anonymousClass7 = anonymousClass25.entitiesView;
                            if (f > 1.0f) {
                                float fFloor3 = (float) Math.floor(((double) Math.max(anonymousClass25.w, anonymousClass7.getMeasuredWidth())) * 0.5d);
                                size = new Size(fFloor3, fFloor3 / f);
                            } else {
                                float fFloor4 = (float) Math.floor(((double) Math.max(anonymousClass25.h, anonymousClass7.getMeasuredHeight())) * 0.5d);
                                size = new Size(f * fFloor4, fFloor4);
                            }
                            PhotoView photoView2 = new PhotoView(anonymousClass25.getContext(), anonymousClass25.centerPositionForEntity$1(), size, tLObject);
                            photoView2.setDelegate(anonymousClass25);
                            anonymousClass7.addView(photoView2);
                            anonymousClass25.checkEntitiesIsVideo();
                            anonymousClass25.appearAnimation(photoView2);
                        }
                        storyRecorder.animateGalleryListView(false);
                    }
                    StoryRecorder.AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
                    if (anonymousClass19 != null) {
                        storyRecorder.lastGalleryScrollPosition = anonymousClass19.layoutManager.onSaveInstanceState();
                        storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                    }
                    break;
                }
                break;
            default:
                ((CommunitySheet) this.f$0).lambda$linkToCommunity$10(this.f$1, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
