package org.telegram.ui.Stories;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda2;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PeerStoriesView$$ExternalSyntheticLambda56 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PeerStoriesView$$ExternalSyntheticLambda56(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        DialogStoriesCell.StoryCell storyCell;
        INavigationLayout parentLayout;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                final Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                if (bool.booleanValue()) {
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    BaseFragment baseFragment = storyViewer.fragment;
                    DialogStoriesCell dialogStoriesCell = null;
                    if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
                        storyCell = null;
                    } else {
                        List<BaseFragment> fragmentStack = ((ActionBarLayout) parentLayout).getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        int size = fragmentStack.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                BaseFragment baseFragment2 = fragmentStack.get(size);
                                if (baseFragment2 instanceof DialogsActivity) {
                                    DialogsActivity dialogsActivity = (DialogsActivity) baseFragment2;
                                    dialogsActivity.closeSearching();
                                    DialogStoriesCell dialogStoriesCell2 = dialogsActivity.dialogStoriesCell;
                                    DialogStoriesCell.StoryCell storyCellFindStoryCell = dialogStoriesCell2 != null ? dialogStoriesCell2.findStoryCell(l2.longValue()) : null;
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        ((ActionBarLayout) parentLayout).removeFragmentFromStack((BaseFragment) arrayList.get(i), false);
                                    }
                                    storyCell = storyCellFindStoryCell;
                                    dialogStoriesCell = dialogStoriesCell2;
                                } else {
                                    arrayList.add(baseFragment2);
                                    size--;
                                }
                            } else {
                                storyCell = null;
                            }
                        }
                    }
                    BaseFragment baseFragment3 = storyViewer.fragment;
                    if (baseFragment3 != null) {
                        baseFragment3.clearSheets();
                    }
                    storyViewer.instantClose();
                    peerStoriesView.editOpened = false;
                    StoryRecorder storyRecorder = (StoryRecorder) this.f$1;
                    if (dialogStoriesCell == null || !dialogStoriesCell.scrollTo(l2.longValue())) {
                        storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCell));
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                    } else {
                        dialogStoriesCell.afterNextLayout(new SendGiftSheet$$ExternalSyntheticLambda16(storyCell, dialogStoriesCell, l2, storyRecorder, runnable, 18));
                    }
                } else {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
                    if (videoPlayerSharedScope == null || videoPlayerSharedScope.player != null) {
                        StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
                        videoPlayerHolder.firstFrameRendered = false;
                        videoPlayerSharedScope.firstFrameRendered = false;
                        final int i2 = 0;
                        videoPlayerHolder.setOnReadyListener(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        Runnable runnable2 = runnable;
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis)));
                                        break;
                                    case 1:
                                        Runnable runnable3 = runnable;
                                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                                        AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis)));
                                        break;
                                    default:
                                        Runnable runnable4 = runnable;
                                        AndroidUtilities.cancelRunOnUIThread(runnable4);
                                        AndroidUtilities.runOnUIThread(runnable4, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis)));
                                        break;
                                }
                            }
                        });
                        ((StoryViewer.AnonymousClass5) peerStoriesView.delegate).setPopupIsVisible(false);
                        RLottieImageView rLottieImageView = peerStoriesView.muteIconView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setAnimation(peerStoriesView.sharedResources.muteDrawable);
                        }
                        if (peerStoriesView.videoDuration > 0 && l.longValue() > peerStoriesView.videoDuration - 1400) {
                            l = 0L;
                        }
                        peerStoriesView.setActive(l.longValue(), true);
                        peerStoriesView.editOpened = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            peerStoriesView.updatePosition(false);
                        }
                    } else {
                        ((StoryViewer.AnonymousClass5) peerStoriesView.delegate).setPopupIsVisible(false);
                        peerStoriesView.setActive(true);
                        peerStoriesView.editOpened = false;
                        peerStoriesView.onImageReceiverThumbLoaded = new ConnectionsManager$$ExternalSyntheticLambda2(1, runnable);
                        if (bool.booleanValue()) {
                            peerStoriesView.updatePosition(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                    }
                }
                break;
            case 1:
                Long l3 = (Long) obj;
                final Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = anonymousClass1.playerSharedScope;
                StoryViewer.VideoPlayerHolder videoPlayerHolder2 = videoPlayerSharedScope2.player;
                if (videoPlayerHolder2 == null) {
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setPopupIsVisible(false);
                    anonymousClass1.setActive(true);
                    anonymousClass1.editOpened = false;
                    anonymousClass1.onImageReceiverThumbLoaded = new ConnectionsManager$$ExternalSyntheticLambda2(2, runnable2);
                    if (bool2.booleanValue()) {
                        anonymousClass1.updatePosition(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                } else {
                    videoPlayerHolder2.firstFrameRendered = false;
                    videoPlayerSharedScope2.firstFrameRendered = false;
                    final int i3 = 1;
                    videoPlayerHolder2.setOnReadyListener(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    Runnable runnable3 = runnable2;
                                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                                    AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis2)));
                                    break;
                                case 1:
                                    Runnable runnable4 = runnable2;
                                    AndroidUtilities.cancelRunOnUIThread(runnable4);
                                    AndroidUtilities.runOnUIThread(runnable4, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis2)));
                                    break;
                                default:
                                    Runnable runnable5 = runnable2;
                                    AndroidUtilities.cancelRunOnUIThread(runnable5);
                                    AndroidUtilities.runOnUIThread(runnable5, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis2)));
                                    break;
                            }
                        }
                    });
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setPopupIsVisible(false);
                    RLottieImageView rLottieImageView2 = anonymousClass1.muteIconView;
                    if (rLottieImageView2 != null) {
                        rLottieImageView2.setAnimation(((PeerStoriesView.SharedResources) this.f$1).muteDrawable);
                    }
                    if (anonymousClass1.videoDuration > 0 && l3.longValue() > anonymousClass1.videoDuration - 1400) {
                        l3 = 0L;
                    }
                    anonymousClass1.setActive(l3.longValue(), true);
                    anonymousClass1.editOpened = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        anonymousClass1.updatePosition(false);
                    }
                }
                break;
            default:
                Long l4 = (Long) obj;
                final Runnable runnable3 = (Runnable) obj2;
                Boolean bool3 = (Boolean) obj3;
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                final long jCurrentTimeMillis3 = System.currentTimeMillis();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope3 = anonymousClass2.playerSharedScope;
                StoryViewer.VideoPlayerHolder videoPlayerHolder3 = videoPlayerSharedScope3.player;
                if (videoPlayerHolder3 == null) {
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass2).delegate).setPopupIsVisible(false);
                    anonymousClass2.setActive(true);
                    anonymousClass2.editOpened = false;
                    anonymousClass2.onImageReceiverThumbLoaded = new ConnectionsManager$$ExternalSyntheticLambda2(3, runnable3);
                    if (bool3.booleanValue()) {
                        anonymousClass2.updatePosition(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable3, 400L);
                } else {
                    videoPlayerHolder3.firstFrameRendered = false;
                    videoPlayerSharedScope3.firstFrameRendered = false;
                    final int i4 = 2;
                    videoPlayerHolder3.setOnReadyListener(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    Runnable runnable4 = runnable3;
                                    AndroidUtilities.cancelRunOnUIThread(runnable4);
                                    AndroidUtilities.runOnUIThread(runnable4, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis3)));
                                    break;
                                case 1:
                                    Runnable runnable5 = runnable3;
                                    AndroidUtilities.cancelRunOnUIThread(runnable5);
                                    AndroidUtilities.runOnUIThread(runnable5, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis3)));
                                    break;
                                default:
                                    Runnable runnable6 = runnable3;
                                    AndroidUtilities.cancelRunOnUIThread(runnable6);
                                    AndroidUtilities.runOnUIThread(runnable6, Math.max(0L, 32 - (System.currentTimeMillis() - jCurrentTimeMillis3)));
                                    break;
                            }
                        }
                    });
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass2).delegate).setPopupIsVisible(false);
                    RLottieImageView rLottieImageView3 = anonymousClass2.muteIconView;
                    if (rLottieImageView3 != null) {
                        rLottieImageView3.setAnimation(((PeerStoriesView.SharedResources) this.f$1).muteDrawable);
                    }
                    if (anonymousClass2.videoDuration > 0 && l4.longValue() > anonymousClass2.videoDuration - 1400) {
                        l4 = 0L;
                    }
                    anonymousClass2.setActive(l4.longValue(), true);
                    anonymousClass2.editOpened = false;
                    AndroidUtilities.runOnUIThread(runnable3, 400L);
                    if (bool3.booleanValue()) {
                        anonymousClass2.updatePosition(false);
                    }
                }
                break;
        }
    }
}
