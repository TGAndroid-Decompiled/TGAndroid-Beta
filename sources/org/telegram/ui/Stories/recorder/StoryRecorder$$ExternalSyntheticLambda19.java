package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController.UploadingStory;

public final class StoryRecorder$$ExternalSyntheticLambda19 implements Utilities.Callback {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda19(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void run(Object obj) {
        ArrayList arrayList;
        boolean z;
        Bulletin.Layout layout;
        TimelineView timelineView;
        StoryRecorder.AnonymousClass11 anonymousClass11;
        Bulletin.Layout layout2;
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                StoryEntry storyEntry = this.f$0.outputEntry;
                if (storyEntry != null) {
                    storyEntry.period = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                }
                break;
            case 1:
                FlashViews flashViews = this.f$0.flashViews;
                float fFloatValue = ((Float) obj).floatValue();
                flashViews.warmth = fFloatValue;
                flashViews.color = FlashViews.getColor(fFloatValue);
                flashViews.invalidateGradient();
                break;
            case 2:
                FlashViews flashViews2 = this.f$0.flashViews;
                flashViews2.intensity = ((Float) obj).floatValue();
                flashViews2.update();
                break;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                StoryRecorder storyRecorder = this.f$0;
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                if (storyEntry2 != null) {
                    AndroidUtilities.recycleBitmap(storyEntry2.coverBitmap);
                    storyRecorder.outputEntry.coverBitmap = bitmap;
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
                    if (storyPrivacyBottomSheet != null) {
                        storyPrivacyBottomSheet.setCover(bitmap);
                        break;
                    }
                }
                break;
            case 4:
                StoryEntry storyEntry3 = (StoryEntry) obj;
                StoryRecorder storyRecorder2 = this.f$0;
                storyRecorder2.prepareThumb(false, storyEntry3);
                int i = storyRecorder2.currentAccount;
                StoriesController storiesController = MessagesController.getInstance(i).getStoriesController();
                storiesController.getClass();
                StoriesController.UploadingStory uploadingStory = storiesController.new UploadingStory(storyEntry3);
                boolean z2 = storyEntry3.isEdit;
                long j = uploadingStory.dialogId;
                if (z2) {
                    LongSparseArray longSparseArray = storiesController.editingStories;
                    HashMap map = (HashMap) longSparseArray.get(j);
                    if (map == null) {
                        map = new HashMap();
                        longSparseArray.put(map, j);
                    }
                    map.put(Integer.valueOf(storyEntry3.editStoryId), uploadingStory);
                } else {
                    storiesController.addUploadingStoryToList(j, uploadingStory, storiesController.uploadingStoriesByDialogId, false);
                }
                storiesController.addUploadingStoryToList(j, uploadingStory, storiesController.uploadingAndEditingStories, true);
                int i2 = storiesController.currentAccount;
                if (j != UserConfig.getInstance(i2).clientUserId) {
                    int i3 = 0;
                    while (true) {
                        arrayList = storiesController.dialogListStories;
                        if (i3 >= arrayList.size()) {
                            z = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i3)).peer) == j) {
                            arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i3));
                            z = true;
                        } else {
                            i3++;
                        }
                    }
                    if (!z) {
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList2 = storiesController.hiddenListStories;
                            if (i4 < arrayList2.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i4)).peer) == j) {
                                    arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i4));
                                    z = true;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    if (!z) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i2).getPeer(j);
                        storiesController.putToAllStories(j, tL_peerStories);
                        arrayList.add(0, tL_peerStories);
                        storiesController.loadAllStoriesForDialog(j);
                    }
                }
                uploadingStory.start();
                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (storyEntry3.isDraft && !storyEntry3.isEdit) {
                    DraftsController draftsController = MessagesController.getInstance(i).getStoriesController().draftsController;
                    draftsController.getClass();
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(storyEntry3);
                    draftsController.delete(arrayList3);
                }
                if (storyEntry3.checkStickersReqId != 0) {
                    ConnectionsManager.getInstance(storyEntry3.currentAccount).cancelRequest(storyEntry3.checkStickersReqId, true);
                }
                break;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                StoryRecorder storyRecorder3 = this.f$0;
                storyRecorder3.getClass();
                int i5 = iIntValue / 3600;
                Bulletin.BulletinWindow.BulletinWindowLayout bulletinWindowLayout = new Bulletin.BulletinWindow(storyRecorder3.activity, new LaunchActivity.AnonymousClass7(13)).container;
                WindowManager.LayoutParams layout3 = bulletinWindowLayout.getLayout();
                if (layout3 != null) {
                    layout3.height = -2;
                    layout3.width = storyRecorder3.containerView.getWidth();
                    layout3.y = (int) (storyRecorder3.containerView.getY() + AndroidUtilities.dp(56.0f));
                    Bulletin.BulletinWindow bulletinWindow = Bulletin.BulletinWindow.this;
                    bulletinWindow.getWindow().setAttributes(bulletinWindow.params);
                }
                bulletinWindowLayout.setTouchable(true);
                DarkThemeResourceProvider darkThemeResourceProvider = storyRecorder3.resourcesProvider;
                new BulletinFactory(bulletinWindowLayout, darkThemeResourceProvider).createSimpleBulletin(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", i5, new Object[0]), Theme.key_chat_messageLinkIn, 0, new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder3, 25), darkThemeResourceProvider)).show(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                StoryRecorder storyRecorder4 = this.f$0;
                storyRecorder4.getClass();
                if (bool.booleanValue() && (timelineView = storyRecorder4.timelineView) != null && timelineView.audioSelected) {
                    timelineView.audioSelected = false;
                    if (timelineView.hasRound && timelineView.videoTrack == null) {
                        timelineView.roundSelected = true;
                        TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                        if (timelineDelegate != null) {
                            timelineDelegate.onRoundSelectChange(true);
                        }
                    }
                }
                storyRecorder4.previewView.updatePauseReason(2, bool.booleanValue());
                storyRecorder4.videoTimelineContainerView.clearAnimation();
                OKLCH.m(storyRecorder4.videoTimelineContainerView.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null && bulletin.tag == 2 && (layout = bulletin.layout) != null) {
                    layout.updatePosition();
                    break;
                }
                break;
            case 7:
                StoryRecorder storyRecorder5 = this.f$0;
                storyRecorder5.applyPaint();
                storyRecorder5.applyPaintMessage();
                storyRecorder5.applyFilter((Runnable) obj);
                break;
            case 8:
                CollageLayout collageLayout = (CollageLayout) obj;
                StoryRecorder storyRecorder6 = this.f$0;
                StoryRecorder.AnonymousClass6 anonymousClass6 = storyRecorder6.collageLayoutView;
                storyRecorder6.lastCollageLayout = collageLayout;
                anonymousClass6.setLayout(collageLayout);
                storyRecorder6.collageListView.setSelected(collageLayout);
                StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder6.cameraView;
                if (anonymousClass25 != null) {
                    anonymousClass25.recordHevc = !storyRecorder6.collageLayoutView.hasLayout();
                }
                storyRecorder6.collageButton.setDrawable(new MotionPhotoDrawable(collageLayout, false));
                storyRecorder6.setActionBarButtonVisible(storyRecorder6.collageRemoveButton, storyRecorder6.collageListView.visible, true);
                storyRecorder6.recordControl.setCollageProgress(storyRecorder6.collageLayoutView.hasLayout() ? storyRecorder6.collageLayoutView.getFilledProgress() : 0.0f, true);
                StoryRecorder.AnonymousClass19 anonymousClass19 = storyRecorder6.galleryListView;
                if (anonymousClass19 != null) {
                    anonymousClass19.setMultipleOnClick(storyRecorder6.collageLayoutView.hasLayout());
                    storyRecorder6.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder6.collageLayoutView.getFilledCount()));
                }
                break;
            case 9:
                StoryRecorder storyRecorder7 = this.f$0;
                storyRecorder7.fastClose = true;
                storyRecorder7.close(true);
                AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda3(4, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                StoryRecorder storyRecorder8 = this.f$0;
                if (!storyRecorder8.takingPhoto && !storyRecorder8.takingVideo) {
                    int iIntValue2 = num2.intValue();
                    storyRecorder8.mode = iIntValue2;
                    storyRecorder8.livePeerView.setShowing(iIntValue2 == -1, true);
                    storyRecorder8.showVideoTimer(storyRecorder8.mode == 1 && !storyRecorder8.collageListView.visible, true);
                    storyRecorder8.modeSwitcherView.switchMode(num2.intValue());
                    RecordControl recordControl = storyRecorder8.recordControl;
                    boolean z3 = num2.intValue() == 1;
                    recordControl.overrideStartModeIsVideoT = -1.0f;
                    recordControl.startModeIsVideo = z3;
                    recordControl.invalidate();
                    if (num2.intValue() == -1) {
                        StoryRecorder.AnonymousClass25 anonymousClass26 = storyRecorder8.cameraView;
                        if (anonymousClass26 != null && anonymousClass26.isDual()) {
                            storyRecorder8.cameraView.toggleDual();
                        }
                        HintView2 hintView2 = storyRecorder8.dualHint;
                        if (hintView2 != null) {
                            hintView2.hide(true);
                        }
                        HintView2 hintView3 = storyRecorder8.savedDualHint;
                        if (hintView3 != null) {
                            hintView3.hide(true);
                        }
                        HintView2 hintView4 = storyRecorder8.cameraHint;
                        if (hintView4 != null) {
                            hintView4.hide(true);
                        }
                        storyRecorder8.collageLayoutView.setLayout(null);
                        storyRecorder8.collageLayoutView.clear$2();
                        storyRecorder8.collageListView.setSelected((CollageLayout) null);
                        StoryRecorder.AnonymousClass25 anonymousClass27 = storyRecorder8.cameraView;
                        if (anonymousClass27 != null) {
                            anonymousClass27.recordHevc = !storyRecorder8.collageLayoutView.hasLayout();
                        }
                    }
                    storyRecorder8.collageListView.setVisible(false, true);
                    storyRecorder8.updateActionBarButtons(true);
                    break;
                }
                break;
            case 11:
                Float f = (Float) obj;
                StoryRecorder storyRecorder9 = this.f$0;
                RecordControl recordControl2 = storyRecorder9.recordControl;
                recordControl2.overrideStartModeIsVideoT = f.floatValue();
                recordControl2.invalidate();
                storyRecorder9.recordControl.setVisibility(f.floatValue() <= -1.0f ? 8 : 0);
                storyRecorder9.recordControl.setAlpha(Utilities.clamp01(f.floatValue() + 1.0f));
                storyRecorder9.startLiveButton.setVisibility(f.floatValue() < 0.0f ? 0 : 8);
                storyRecorder9.startLiveButton.setAlpha(AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f));
                storyRecorder9.startLiveButton.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
                storyRecorder9.startLiveButton.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
                storyRecorder9.startLiveButton.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
                if (f.floatValue() < 0.0f) {
                    storyRecorder9.animateGalleryListView(false);
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                StoryRecorder storyRecorder10 = this.f$0;
                if (storyRecorder10.outputEntry != null) {
                    StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder10.captionEdit;
                    if (!anonymousClass8.recording) {
                        anonymousClass8.editText.clearFocus();
                        if (num3.intValue() == 5) {
                            storyRecorder10.processDone$11();
                        } else if (num3.intValue() == 0) {
                            storyRecorder10.switchToEditMode(0, false, true);
                            StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder10.paintView;
                            if (anonymousClass24 != null) {
                                anonymousClass24.enteredThroughText = false;
                                anonymousClass24.switchTab$1(0);
                                anonymousClass24.selectEntity$1(null, true);
                            }
                        } else if (num3.intValue() == 1) {
                            storyRecorder10.switchToEditMode(0, false, true);
                            StoryRecorder.AnonymousClass24 anonymousClass28 = storyRecorder10.paintView;
                            if (anonymousClass28 != null) {
                                anonymousClass28.switchTab$1(2);
                                anonymousClass28.forceChanges = true;
                                anonymousClass28.createText$1(true);
                                storyRecorder10.paintView.enteredThroughText = true;
                            }
                        } else if (num3.intValue() == 2) {
                            storyRecorder10.createPhotoPaintView();
                            storyRecorder10.hidePhotoPaintView();
                            StoryRecorder.AnonymousClass24 anonymousClass29 = storyRecorder10.paintView;
                            if (anonymousClass29 != null) {
                                anonymousClass29.switchTab$1(1);
                                anonymousClass29.openStickersView$1();
                            }
                        } else if (num3.intValue() == 4) {
                            storyRecorder10.switchToEditMode(1, false, true);
                        } else if (num3.intValue() == 3) {
                            storyRecorder10.switchToEditMode(3, false, true);
                        }
                        break;
                    }
                }
                break;
            case 13:
                StoryRecorder storyRecorder11 = this.f$0;
                FrameLayout frameLayout = storyRecorder11.videoTimelineContainerView;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(storyRecorder11.currentEditMode == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + storyRecorder11.captionEdit.getEditTextHeight())));
                }
                StoryRecorder.AnonymousClass11 anonymousClass12 = storyRecorder11.storiesSelector;
                if (anonymousClass12 != null) {
                    int i6 = -(AndroidUtilities.dp(24.0f) + storyRecorder11.captionEdit.getEditTextHeight());
                    TimelineView timelineView2 = storyRecorder11.timelineView;
                    anonymousClass12.setTranslationY(i6 - (timelineView2 == null ? 0 : timelineView2.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                Bulletin bulletin2 = Bulletin.visibleBulletin;
                if (bulletin2 != null && bulletin2.tag == 2 && (layout2 = bulletin2.layout) != null) {
                    layout2.updatePosition();
                }
                if (storyRecorder11.captionEdit.keyboardShown && (anonymousClass11 = storyRecorder11.storiesSelector) != null) {
                    anonymousClass11.showList(false, true);
                    break;
                }
                break;
            case 14:
                StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = (StoryPrivacyBottomSheet.StoryPrivacy) obj;
                StoryRecorder storyRecorder12 = this.f$0;
                StoryEntry storyEntry4 = storyRecorder12.outputEntry;
                if (storyEntry4 != null) {
                    storyEntry4.privacy = storyPrivacy;
                }
                ArrayList arrayList4 = storyRecorder12.entries;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList4.get(i7);
                        i7++;
                        ((StoryEntry) obj2).privacy = storyPrivacy;
                    }
                }
                break;
            case 15:
                TLRPC.InputPeer tL_inputPeerSelf = (TLRPC.InputPeer) obj;
                StoryRecorder storyRecorder13 = this.f$0;
                StoryEntry storyEntry5 = storyRecorder13.outputEntry;
                if (storyEntry5 != null) {
                    if (tL_inputPeerSelf == null) {
                        tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                    }
                    storyEntry5.peer = tL_inputPeerSelf;
                    ArrayList arrayList5 = storyRecorder13.entries;
                    if (arrayList5 != null) {
                        int size2 = arrayList5.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj3 = arrayList5.get(i8);
                            i8++;
                            ((StoryEntry) obj3).peer = storyRecorder13.outputEntry.peer;
                        }
                    }
                    break;
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                StoryRecorder storyRecorder14 = this.f$0;
                StoryEntry storyEntry6 = storyRecorder14.outputEntry;
                if (storyEntry6 != null) {
                    storyEntry6.albums = hashSet;
                    ArrayList arrayList6 = storyRecorder14.entries;
                    if (arrayList6 != null) {
                        int size3 = arrayList6.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Object obj4 = arrayList6.get(i9);
                            i9++;
                            ((StoryEntry) obj4).albums = hashSet;
                        }
                    }
                    break;
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                StoryRecorder storyRecorder15 = this.f$0;
                StoryEntry storyEntry7 = storyRecorder15.outputEntry;
                if (storyEntry7 != null) {
                    Bitmap bitmap3 = storyEntry7.coverBitmap;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    storyRecorder15.outputEntry.coverBitmap = bitmap2;
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = storyRecorder15.privacySheet;
                    if (storyPrivacyBottomSheet2 != null) {
                        storyPrivacyBottomSheet2.setCover(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.f$0.livePrivacy = (StoryPrivacyBottomSheet.StoryPrivacy) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                StoryRecorder storyRecorder16 = this.f$0;
                SelectPeerView selectPeerView = storyRecorder16.livePeerView;
                storyRecorder16.livePeer = inputPeer;
                selectPeerView.set(inputPeer);
                break;
            case 20:
                QRScanner.Detected detected = (QRScanner.Detected) obj;
                StoryRecorder storyRecorder17 = this.f$0;
                if (storyRecorder17.qrScanner != null) {
                    storyRecorder17.qrLinkView.setLink(detected == null ? null : detected.link);
                    StoryRecorder.AnonymousClass6 anonymousClass7 = storyRecorder17.collageLayoutView;
                    if (anonymousClass7 != null) {
                        anonymousClass7.qrDrawer.setQrDetected(storyRecorder17.qrLinkView.hasResolved ? storyRecorder17.qrScanner.lastDetected : null);
                    }
                    break;
                }
                break;
            default:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                StoryRecorder storyRecorder18 = this.f$0;
                SelectPeerView selectPeerView2 = storyRecorder18.livePeerView;
                storyRecorder18.livePeer = inputPeer2;
                selectPeerView2.set(inputPeer2);
                break;
        }
    }
}
