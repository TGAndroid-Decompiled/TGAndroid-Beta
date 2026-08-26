package org.telegram.ui.Stories;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class LivePlayer$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public LivePlayer$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        long j = 0;
        boolean z = true;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LivePlayer.this.setEmptyStream(false);
                break;
            case 1:
                ((SellGiftEnterPriceSheet[]) obj)[0].lambda$showGiftOfferSheet$15();
                break;
            case 2:
                TONIntroActivity.NestedFrameLayout nestedFrameLayout = (TONIntroActivity.NestedFrameLayout) obj;
                nestedFrameLayout.getClass();
                try {
                    RecyclerListView currentListView = ((StarsIntroActivity) nestedFrameLayout.this$0).transactionsLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                Browser.openUrl(((StarsIntroActivity.StarsNeededSheet) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 4:
                Browser.openUrl(((StarsIntroActivity.StarsOptionsSheet) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                LiveCommentsView liveCommentsView = (LiveCommentsView) obj;
                LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = liveCommentsView.removeTopSendersRunnable;
                if (livePlayer$1$$ExternalSyntheticLambda0 != null) {
                    AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
                    liveCommentsView.removeTopSendersRunnable = null;
                }
                int currentTime = ConnectionsManager.getInstance(liveCommentsView.currentAccount).getCurrentTime();
                ArrayList arrayList = liveCommentsView.topMessages;
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    LiveCommentsView.TopSender topSender = (LiveCommentsView.TopSender) arrayList.get(size);
                    ArrayList arrayList2 = topSender.messages;
                    int size2 = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size2) {
                            arrayList.remove(size);
                        }
                        Object obj2 = arrayList2.get(i);
                        i++;
                        LiveCommentsView.Message message = (LiveCommentsView.Message) obj2;
                        long j2 = message.stars;
                        if (j2 <= j || currentTime - message.date > HighlightMessageSheet.getTierOption(topSender.currentAccount, (int) j2, 0)) {
                            j = 0;
                        }
                        break;
                        break;
                    }
                    size--;
                    j = 0;
                }
                Collections.sort(arrayList, new TableModel$$ExternalSyntheticLambda0(liveCommentsView, 12));
                liveCommentsView.topAdapter.update(true);
                liveCommentsView.updateTopMessages(true);
                liveCommentsView.scheduleRemovingTopSenders();
                break;
            case 6:
                LivePlayer livePlayer = LivePlayer.this;
                NotificationCenter.getInstance(livePlayer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer.getCallId()));
                break;
            case 7:
                LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) obj;
                liveStoryPipOverlay.isShowingControls = false;
                liveStoryPipOverlay.toggleControls$1(false);
                liveStoryPipOverlay.postedDismissControls = false;
                break;
            case 8:
                LiveStoryPipOverlay liveStoryPipOverlay2 = (LiveStoryPipOverlay) ((PipVideoOverlay.AnonymousClass3) obj).this$0;
                liveStoryPipOverlay2.contentFrameLayout.invalidate();
                if (!liveStoryPipOverlay2.contentFrameLayout.isInLayout()) {
                    liveStoryPipOverlay2.contentFrameLayout.requestLayout();
                    liveStoryPipOverlay2.contentView.requestLayout();
                    liveStoryPipOverlay2.textureView.requestLayout();
                    break;
                }
                break;
            case 9:
                PeerStoriesView.this.openChat$1();
                break;
            case 10:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass4) obj).this$0;
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass1).delegate;
                if (delegate != null) {
                    if (anonymousClass1.isUploading || anonymousClass1.isEditing || anonymousClass1.isFailed) {
                        if (!anonymousClass1.currentStory.isVideo) {
                            anonymousClass1.currentImageTime = 0L;
                        } else {
                            anonymousClass1.playerSharedScope.player.loopBack();
                        }
                        break;
                    } else {
                        StoryViewer storyViewer = StoryViewer.this;
                        if (!storyViewer.storiesViewPager.getCurrentPeerView().switchToNext(true) && !storyViewer.storiesViewPager.switchToNext(true)) {
                            storyViewer.close(true);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 12:
                SelfStoryViewsPage.ListAdapter listAdapter = (SelfStoryViewsPage.ListAdapter) obj;
                listAdapter.getClass();
                new PremiumFeatureBottomSheet(listAdapter.this$0.storyViewer.fragment, 14, false).show();
                break;
            case 13:
                StealthModeAlert stealthModeAlert = (StealthModeAlert) obj;
                if (stealthModeAlert.isShowing()) {
                    stealthModeAlert.updateButton$3(true);
                }
                break;
            case 14:
                ((StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) obj).run();
                break;
            case 15:
                DraftsController draftsController = (DraftsController) obj;
                draftsController.delete(draftsController.drafts);
                draftsController.loaded = false;
                break;
            case 16:
                StoriesIntro storiesIntro = (StoriesIntro) obj;
                int i2 = storiesIntro.current + 1;
                storiesIntro.current = i2;
                ArrayList arrayList3 = storiesIntro.items;
                if (i2 >= arrayList3.size()) {
                    storiesIntro.current = 0;
                }
                int i3 = storiesIntro.prev + 1;
                storiesIntro.prev = i3;
                if (i3 >= arrayList3.size()) {
                    storiesIntro.prev = 0;
                }
                storiesIntro.startAnimation(true);
                break;
            case 17:
                ((StoriesController$$ExternalSyntheticLambda2) obj).accept(null);
                break;
            case 18:
                ((StoriesUtilities.AnonymousClass2) obj).onDetachedFromWindow();
                break;
            case 19:
                StoriesViewPager.PageLayout pageLayout = (StoriesViewPager.PageLayout) obj;
                ArrayList arrayList4 = pageLayout.day;
                if (arrayList4 != null) {
                    pageLayout.peerStoryView.day = arrayList4;
                }
                PeerStoriesView peerStoriesView = pageLayout.peerStoryView;
                long j3 = pageLayout.dialogId;
                if (peerStoriesView.dialogId != j3 || peerStoriesView.day != null) {
                    peerStoriesView.dialogId = j3;
                    peerStoriesView.updateStoryItems();
                    peerStoriesView.updateSelectedPosition();
                    peerStoriesView.updatePosition(true);
                    TL_stories.PeerStories peerStories = peerStoriesView.storyViewer.overrideUserStories;
                    if (peerStories == null) {
                        StoriesController storiesController = peerStoriesView.storiesController;
                        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j3);
                        if (storiesFromFullPeer == null) {
                            storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j3);
                        } else {
                            z = false;
                        }
                        storiesController.loadSkippedStories(storiesFromFullPeer, z);
                    } else {
                        peerStoriesView.storiesController.loadSkippedStories(peerStories, true);
                    }
                }
                break;
            case 20:
                ((LinkSpanDrawable.LinkCollector) obj).clear(true);
                break;
            case 21:
                ((StoryContainsEmojiButton) obj).requestLayout();
                break;
            case 22:
                StoryMediaAreasView storyMediaAreasView = (StoryMediaAreasView) obj;
                HintView2 hintView2 = storyMediaAreasView.hintView;
                if (hintView2 != null) {
                    hintView2.hide(true);
                    storyMediaAreasView.hintView = null;
                }
                storyMediaAreasView.onHintVisible(false);
                break;
            case 23:
                StoryMediaAreasView.AreaView areaView = (StoryMediaAreasView.AreaView) obj;
                if (areaView.supportsShining) {
                    areaView.shining = true;
                    areaView.startTime = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    areaView.gradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    areaView.strokeGradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    areaView.invalidate();
                    break;
                }
                break;
            case 24:
                StoryViewer storyViewer2 = ((StoryViewer.AnonymousClass8) obj).this$0;
                try {
                    StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer2.windowView;
                    if (anonymousClass2 != null) {
                        if (storyViewer2.ATTACH_TO_FRAGMENT) {
                            AndroidUtilities.removeFromParent(anonymousClass2);
                        } else {
                            storyViewer2.windowManager.removeView(anonymousClass2);
                        }
                        storyViewer2.windowView = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 25:
                StoryViewer.this.setInTouchMode(true);
                break;
            case 26:
                ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) obj;
                if (viewsForPeerStoriesRequester.isRunning) {
                    long jCurrentTimeMillis = 10000 - (System.currentTimeMillis() - ViewsForPeerStoriesRequester.lastRequestTime);
                    if (jCurrentTimeMillis > 0) {
                        LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda1 = viewsForPeerStoriesRequester.scheduleRequestRunnable;
                        AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda1, jCurrentTimeMillis);
                    } else if (!viewsForPeerStoriesRequester.requestInternal()) {
                        viewsForPeerStoriesRequester.currentReqId = 0;
                        viewsForPeerStoriesRequester.isRunning = false;
                    }
                    break;
                }
                break;
            case 27:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) obj;
                StoriesController.BotPreviewsList botPreviewsList = botPreviewsEditLangContainer.list;
                botPreviewsEditLangContainer.this$0.createStory(botPreviewsList == null ? "" : botPreviewsList.lang_code);
                break;
            case 28:
                CaptionContainerView.this.waitingForScrollYChange = false;
                break;
            default:
                ((CaptionContainerView.PeriodDrawable) obj).invalidateSelf();
                break;
        }
    }
}
