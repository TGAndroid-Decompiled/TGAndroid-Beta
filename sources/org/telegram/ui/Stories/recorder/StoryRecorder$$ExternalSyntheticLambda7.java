package org.telegram.ui.Stories.recorder;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class StoryRecorder$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda7(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void run() {
        char c;
        ArrayList arrayList;
        StoryRecorder.AnonymousClass7 anonymousClass7;
        StoryRecorder.WindowView windowView;
        int i = 10;
        int i2 = 3;
        StoryRecorder storyRecorder = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                storyRecorder.isShown = false;
                AndroidUtilities.unlockOrientation(storyRecorder.activity);
                if (storyRecorder.cameraView != null) {
                    if (storyRecorder.takingVideo) {
                        CameraController.getInstance().stopVideoRecording(storyRecorder.cameraView.getCameraSession(), false);
                    }
                    storyRecorder.destroyCameraView(false);
                }
                StoryRecorder.AnonymousClass7 anonymousClass8 = storyRecorder.previewView;
                if (anonymousClass8 != null) {
                    anonymousClass8.set(null);
                }
                storyRecorder.destroyPhotoPaintView();
                storyRecorder.destroyPhotoFilterView();
                File file = storyRecorder.outputFile;
                if (file != null && !storyRecorder.wasSend) {
                    try {
                        file.delete();
                        break;
                    } catch (Exception unused) {
                    }
                }
                storyRecorder.outputFile = null;
                AndroidUtilities.runOnUIThread(new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 28), 16L);
                StoryRecorder.SourceView sourceView = storyRecorder.fromSourceView;
                if (sourceView != null) {
                    sourceView.show(false);
                }
                if (storyRecorder.whenOpenDone != null) {
                    storyRecorder.whenOpenDone = null;
                }
                storyRecorder.lastGalleryScrollPosition = null;
                StoryRecorder storyRecorder2 = StoryRecorder.instance;
                if (storyRecorder2 != null) {
                    storyRecorder2.close(false);
                }
                StoryRecorder.instance = null;
                StoryRecorder.WindowView windowView2 = storyRecorder.windowView;
                if (windowView2 != null) {
                    Bulletin.removeDelegate(windowView2);
                }
                StoryRecorder.AnonymousClass4 anonymousClass4 = storyRecorder.captionContainer;
                if (anonymousClass4 != null) {
                    Bulletin.removeDelegate(anonymousClass4);
                }
                StoryRecorder.AnonymousClass6 anonymousClass6 = storyRecorder.collageLayoutView;
                if (anonymousClass6 != null) {
                    anonymousClass6.clear$2();
                }
                break;
            case 1:
                if (storyRecorder.frontfaceFlashMode >= 0) {
                    MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", storyRecorder.flashViews.warmth).putFloat("frontflash_intensity", storyRecorder.flashViews.intensity).apply();
                }
                storyRecorder.flashViews.flashTo(0.0f, 240L, null);
                storyRecorder.flashButton.setSelected(false);
                break;
            case 2:
                storyRecorder.applyPaintMessage();
                storyRecorder.preparingUpload = false;
                if (storyRecorder.outputEntry == null) {
                    storyRecorder.close(true);
                } else {
                    storyRecorder.destroyPhotoFilterView();
                    StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19 = new StoryRecorder$$ExternalSyntheticLambda19(storyRecorder, 4);
                    if (storyRecorder.entries == null) {
                        StoryEntry storyEntry = storyRecorder.outputEntry;
                        if (!storyEntry.isVideo || storyEntry.isCollage() || storyEntry.isEdit) {
                            c = 0;
                            arrayList = null;
                        } else {
                            long j = storyEntry.duration;
                            if (j <= 0 || storyEntry.isRepost) {
                                c = 0;
                                arrayList = null;
                            } else {
                                long j2 = (long) ((storyEntry.right - storyEntry.left) * j);
                                if (j2 < 68999) {
                                    c = 0;
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    storyEntry.right = (59000.0f / storyEntry.duration) + storyEntry.left;
                                    arrayList.add(storyEntry);
                                    long j3 = 59000;
                                    long j4 = 59000;
                                    while (true) {
                                        c = 0;
                                        if (j4 < j2) {
                                            long jMin = Math.min(j3, j2 - j4);
                                            if (jMin >= 1000) {
                                                StoryEntry storyEntryCopy$1 = storyEntry.copy$1();
                                                long j5 = j3;
                                                float f = storyEntry.left;
                                                long j6 = j2;
                                                float f2 = storyEntry.duration;
                                                storyEntryCopy$1.left = (j4 / f2) + f;
                                                storyEntryCopy$1.right = ((jMin + j4) / f2) + storyEntry.left;
                                                storyEntryCopy$1.caption = "";
                                                j4 += j5;
                                                arrayList.add(storyEntryCopy$1);
                                                j3 = j5;
                                                j2 = j6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        storyRecorder.entries = arrayList;
                        if (arrayList != null) {
                            storyRecorder.selectedEntries = new ArrayList();
                            storyRecorder.selectedEntriesOrder = new ArrayList();
                            for (int iM = 0; iM < storyRecorder.entries.size(); iM = LocationController$$ExternalSyntheticOutline0.m(iM, iM, 1, storyRecorder.selectedEntriesOrder)) {
                                storyRecorder.selectedEntries.add(Integer.valueOf(iM));
                            }
                        }
                    } else {
                        c = 0;
                    }
                    ArrayList arrayList2 = storyRecorder.entries;
                    int i3 = storyRecorder.currentAccount;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = storyRecorder.selectedEntriesOrder;
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList3.get(i4);
                            i4++;
                            Integer num = (Integer) obj;
                            if (storyRecorder.selectedEntries.contains(num)) {
                                StoryEntry storyEntry2 = (StoryEntry) storyRecorder.entries.get(num.intValue());
                                StoryEntry storyEntry3 = storyRecorder.outputEntry;
                                if (storyEntry3 == storyEntry2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[c] = storyRecorder.captionEdit.getText();
                                    ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i3).storyEntitiesAllowed() ? MediaDataController.getInstance(i3).getEntities(charSequenceArr, true) : new ArrayList<>();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[c] = storyRecorder.outputEntry.caption;
                                    ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i3).storyEntitiesAllowed() ? MediaDataController.getInstance(i3).getEntities(charSequenceArr2, true) : new ArrayList<>();
                                    StoryEntry storyEntry4 = storyRecorder.outputEntry;
                                    storyEntry4.editedCaption = (TextUtils.equals(storyEntry4.caption, charSequenceArr[c]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                                    storyRecorder.outputEntry.caption = new SpannableString(storyRecorder.captionEdit.getText());
                                } else if (storyEntry2.caption == null) {
                                    storyEntry3.editedCaption = false;
                                    storyEntry3.caption = new SpannableString("");
                                }
                                storyRecorder$$ExternalSyntheticLambda19.run(storyEntry2);
                            }
                            c = 0;
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {storyRecorder.captionEdit.getText()};
                        ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(i3).storyEntitiesAllowed() ? MediaDataController.getInstance(i3).getEntities(charSequenceArr3, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(i3).storyEntitiesAllowed() ? MediaDataController.getInstance(i3).getEntities(new CharSequence[]{storyRecorder.outputEntry.caption}, true) : new ArrayList<>();
                        StoryEntry storyEntry5 = storyRecorder.outputEntry;
                        storyEntry5.editedCaption = (TextUtils.equals(storyEntry5.caption, charSequenceArr3[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
                        storyRecorder.outputEntry.caption = new SpannableString(storyRecorder.captionEdit.getText());
                        storyRecorder$$ExternalSyntheticLambda19.run(storyRecorder.outputEntry);
                    }
                    long peerDialogId = UserConfig.getInstance(i3).clientUserId;
                    TLRPC.InputPeer inputPeer = storyRecorder.outputEntry.peer;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                    }
                    storyRecorder.outputEntry = null;
                    storyRecorder.wasSend = true;
                    storyRecorder.wasSendPeer = peerDialogId;
                    storyRecorder.forceBackgroundVisible = true;
                    storyRecorder.checkBackgroundVisibility();
                    LinkManager$3$$ExternalSyntheticLambda0 linkManager$3$$ExternalSyntheticLambda0 = new LinkManager$3$$ExternalSyntheticLambda0(storyRecorder, peerDialogId, 27);
                    StoryRecorder.ClosingViewProvider closingViewProvider = storyRecorder.closingSourceProvider;
                    if (closingViewProvider != null) {
                        closingViewProvider.preLayout(peerDialogId, linkManager$3$$ExternalSyntheticLambda0);
                    } else {
                        linkManager$3$$ExternalSyntheticLambda0.run();
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
                }
                break;
            case 3:
                storyRecorder.getClass();
                storyRecorder.animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, i));
                storyRecorder.previewButtons.appear(true, true);
                break;
            case 4:
                StoryEntry storyEntry6 = storyRecorder.outputEntry;
                if (storyEntry6 != null) {
                    storyEntry6.isDark = !storyEntry6.isDark;
                    StoryRecorder.AnonymousClass7 anonymousClass9 = storyRecorder.previewView;
                    if (anonymousClass9 != null) {
                        anonymousClass9.setupWallpaper(storyEntry6);
                    }
                    StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                    if (anonymousClass24 != null && anonymousClass24.entitiesView != null) {
                        for (int i5 = 0; i5 < storyRecorder.paintView.entitiesView.getChildCount(); i5++) {
                            View childAt = storyRecorder.paintView.entitiesView.getChildAt(i5);
                            if (childAt instanceof MessageEntityView) {
                                ((MessageEntityView) childAt).setupTheme(storyRecorder.outputEntry);
                            }
                        }
                    }
                    storyRecorder.updateThemeButtonDrawable(true);
                    break;
                }
                break;
            case 5:
                storyRecorder.close(true);
                break;
            case 6:
                storyRecorder.createCameraView();
                break;
            case 7:
                storyRecorder.animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, i));
                break;
            case 8:
                storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
                if (anonymousClass25 != null) {
                    anonymousClass25.destroy(true, null);
                    AndroidUtilities.removeFromParent(storyRecorder.cameraView);
                    StoryRecorder.AnonymousClass6 anonymousClass10 = storyRecorder.collageLayoutView;
                    if (anonymousClass10 != null) {
                        anonymousClass10.setCameraView(null);
                    }
                    storyRecorder.cameraView = null;
                }
                break;
            case 9:
                storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                break;
            case 10:
                storyRecorder.isShown = true;
                storyRecorder.wasSend = false;
                if (storyRecorder.openType == 1) {
                    storyRecorder.previewContainer.setAlpha(1.0f);
                    storyRecorder.previewContainer.setTranslationX(0.0f);
                    storyRecorder.previewContainer.setTranslationY(0.0f);
                    storyRecorder.actionBarContainer.setAlpha(1.0f);
                    storyRecorder.controlContainer.setAlpha(1.0f);
                    storyRecorder.windowView.setBackgroundColor(-16777216);
                    if (storyRecorder.currentPage == 2) {
                        storyRecorder.coverButton.setAlpha(1.0f);
                    }
                }
                StoryRecorder$$ExternalSyntheticLambda9 storyRecorder$$ExternalSyntheticLambda9 = storyRecorder.whenOpenDone;
                if (storyRecorder$$ExternalSyntheticLambda9 != null) {
                    storyRecorder$$ExternalSyntheticLambda9.run();
                    storyRecorder.whenOpenDone = null;
                } else {
                    storyRecorder.onResumeInternal();
                }
                StoryEntry storyEntry7 = storyRecorder.outputEntry;
                if (storyEntry7 != null && storyEntry7.isRepost) {
                    storyRecorder.createPhotoPaintView();
                    storyRecorder.hidePhotoPaintView();
                    storyRecorder.createFilterPhotoView();
                    break;
                } else if (storyEntry7 != null && storyEntry7.isRepostMessage) {
                    if (storyEntry7.isVideo) {
                        storyRecorder.previewView.setupVideoPlayer(storyEntry7, null, 0L);
                    }
                    storyRecorder.createFilterPhotoView();
                    break;
                }
                break;
            case 11:
                if (storyRecorder.currentPage == 1) {
                    storyRecorder.switchToEditMode(2, false, true);
                    break;
                }
                break;
            case 12:
                StoryRecorder.AnonymousClass11 anonymousClass11 = storyRecorder.storiesSelector;
                if (anonymousClass11 != null) {
                    int i6 = -(AndroidUtilities.dp(24.0f) + storyRecorder.captionEdit.getEditTextHeight());
                    TimelineView timelineView = storyRecorder.timelineView;
                    anonymousClass11.setTranslationY(i6 - (timelineView != null ? timelineView.getContentHeight() - AndroidUtilities.dp(5.0f) : 0));
                }
                break;
            case 13:
                StoryRecorder.AnonymousClass6 anonymousClass12 = storyRecorder.collageLayoutView;
                if (anonymousClass12 != null) {
                    anonymousClass12.qrDrawer.setQrDetected(storyRecorder.qrLinkView.hasResolved ? storyRecorder.qrScanner.lastDetected : null);
                }
                break;
            case 14:
                storyRecorder.updateActionBarButtons(true);
                break;
            case 15:
                storyRecorder.createFilterPhotoView();
                break;
            case 16:
                StoryRecorder.AnonymousClass8 anonymousClass13 = storyRecorder.captionEdit;
                if (anonymousClass13 != null) {
                    anonymousClass13.invalidateBlur();
                }
                break;
            case 17:
                if (storyRecorder.currentEditMode == -1 && storyRecorder.currentPage == 1) {
                    StoryRecorder.AnonymousClass8 anonymousClass14 = storyRecorder.captionEdit;
                    if (!anonymousClass14.keyboardShown && !anonymousClass14.recording) {
                        TimelineView timelineView2 = storyRecorder.timelineView;
                        if (!timelineView2.audioSelected) {
                            StoryRecorder.AnonymousClass11 anonymousClass15 = storyRecorder.storiesSelector;
                            if (anonymousClass15.listShown) {
                                anonymousClass15.showList(false, true);
                            } else {
                                storyRecorder.switchToEditMode(0, false, true);
                                StoryRecorder.AnonymousClass24 anonymousClass26 = storyRecorder.paintView;
                                if (anonymousClass26 != null) {
                                    anonymousClass26.switchTab$1(2);
                                    anonymousClass26.forceChanges = true;
                                    anonymousClass26.createText$1(true);
                                    storyRecorder.paintView.enteredThroughText = true;
                                }
                            }
                            break;
                        } else {
                            timelineView2.audioSelected = false;
                            if (timelineView2.hasRound && timelineView2.videoTrack == null) {
                                timelineView2.roundSelected = true;
                                TimelineView.TimelineDelegate timelineDelegate = timelineView2.delegate;
                                if (timelineDelegate != null) {
                                    timelineDelegate.onRoundSelectChange(true);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 18:
                storyRecorder.videoError = true;
                storyRecorder.previewButtons.setShareEnabled(false);
                DownloadButton downloadButton = storyRecorder.downloadButton;
                downloadButton.getClass();
                downloadButton.showToast(R.raw.error, LocaleController.getString("VideoConvertFail"));
                break;
            case 19:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
                if (storyPrivacyBottomSheet != null) {
                    storyPrivacyBottomSheet.lambda$showGiftOfferSheet$15();
                }
                storyRecorder.navigateTo(2, true);
                break;
            case 20:
                storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                break;
            case 21:
                StoryRecorder.WindowView windowView3 = storyRecorder.windowView;
                DarkThemeResourceProvider darkThemeResourceProvider = storyRecorder.resourcesProvider;
                new BulletinFactory(windowView3, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), Theme.key_chat_messageLinkIn, 0, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder, 25), darkThemeResourceProvider)).show(true);
                break;
            case 22:
                storyRecorder.switchToEditMode(-1, false, true);
                break;
            case 23:
                storyRecorder.switchToEditMode(-1, false, true);
                break;
            case 24:
                if (!storyRecorder.outputEntry.isEditingCover && storyRecorder.privacySheet != null && (anonymousClass7 = storyRecorder.previewView) != null) {
                    anonymousClass7.getCoverBitmap(new StoryRecorder$$ExternalSyntheticLambda19(storyRecorder, i2), anonymousClass7, storyRecorder.paintViewRenderView, storyRecorder.paintViewEntitiesView);
                }
                storyRecorder.navigateTo(1, true);
                break;
            case 25:
                storyRecorder.openPremium$1();
                break;
            case 26:
                storyRecorder.showZoomControls$1(false);
                storyRecorder.zoomControlHideRunnable = null;
                break;
            case 27:
                storyRecorder.showZoomControls$1(false);
                storyRecorder.zoomControlHideRunnable = null;
                break;
            default:
                WindowManager windowManager = storyRecorder.windowManager;
                if (windowManager != null && (windowView = storyRecorder.windowView) != null && windowView.getParent() != null) {
                    windowManager.removeView(storyRecorder.windowView);
                    break;
                }
                break;
        }
    }
}
