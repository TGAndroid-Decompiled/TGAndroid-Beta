package org.telegram.ui.Stories;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda2;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;

public final class PeerStoriesView$$ExternalSyntheticLambda51 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PeerStoriesView$$ExternalSyntheticLambda51(int i, Object obj, Object obj2) {
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
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                if (bool.booleanValue()) {
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    BaseFragment baseFragment = storyViewer.fragment;
                    DialogsActivity.AnonymousClass25 anonymousClass25 = null;
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
                                    DialogsActivity.AnonymousClass25 anonymousClass26 = dialogsActivity.dialogStoriesCell;
                                    DialogStoriesCell.StoryCell storyCellFindStoryCell = anonymousClass26 != null ? anonymousClass26.findStoryCell(l2.longValue()) : null;
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        ((ActionBarLayout) parentLayout).removeFragmentFromStack((BaseFragment) arrayList.get(i), false);
                                    }
                                    storyCell = storyCellFindStoryCell;
                                    anonymousClass25 = anonymousClass26;
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
                    if (anonymousClass25 == null || !anonymousClass25.scrollTo(l2.longValue())) {
                        storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCell));
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                    } else {
                        anonymousClass25.afterNextLayout.add(new WebInstantView$4$$ExternalSyntheticLambda0(storyCell, anonymousClass25, l2, storyRecorder, runnable, 2));
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
                    if (videoPlayerSharedScope == null || videoPlayerSharedScope.player != null) {
                        StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
                        videoPlayerHolder.firstFrameRendered = false;
                        videoPlayerSharedScope.firstFrameRendered = false;
                        videoPlayerHolder.setOnReadyListener(new PeerStoriesView$$ExternalSyntheticLambda58(0, jCurrentTimeMillis, runnable));
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
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                SharedMediaLayout.SavedMessagesSearchAdapter savedMessagesSearchAdapter = (SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0;
                int i2 = savedMessagesSearchAdapter.currentAccount;
                MessagesController.getInstance(i2).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i2).putChats((ArrayList) obj3, true);
                AnimatedEmojiDrawable.getDocumentFetcher(i2).processDocuments((ArrayList) obj4);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i3);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(savedMessagesSearchAdapter.lastQuery);
                    savedMessagesSearchAdapter.cachedMessages.add(messageObject);
                }
                savedMessagesSearchAdapter.updateMessages(true);
                AndroidUtilities.runOnUIThread((PollItemMenu$$ExternalSyntheticLambda17) this.f$1, 540L);
                break;
        }
    }
}
