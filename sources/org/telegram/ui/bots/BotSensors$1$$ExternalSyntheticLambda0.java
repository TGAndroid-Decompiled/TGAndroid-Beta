package org.telegram.ui.bots;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.appcompat.widget.TooltipPopup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.StoriesIntro;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.StoryMediaAreasView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.RichAIComposeSheet;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichEditor;

public final class BotSensors$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public BotSensors$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        boolean z = false;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((BotSensors.AnonymousClass1) obj).post();
                break;
            case 1:
                DraftsController draftsController = (DraftsController) obj;
                draftsController.delete(draftsController.drafts);
                draftsController.loaded = false;
                break;
            case 2:
                ((StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) obj).run();
                break;
            case 3:
                StoriesIntro storiesIntro = (StoriesIntro) obj;
                int i = storiesIntro.current + 1;
                storiesIntro.current = i;
                ArrayList arrayList = storiesIntro.items;
                if (i >= arrayList.size()) {
                    storiesIntro.current = 0;
                }
                int i2 = storiesIntro.prev + 1;
                storiesIntro.prev = i2;
                if (i2 >= arrayList.size()) {
                    storiesIntro.prev = 0;
                }
                storiesIntro.startAnimation(true);
                break;
            case 4:
                ((StoriesController$$ExternalSyntheticLambda2) obj).accept(null);
                break;
            case 5:
                ((StoriesUtilities.AnonymousClass2) obj).onDetachedFromWindow();
                break;
            case 6:
                StoriesViewPager.PageLayout pageLayout = (StoriesViewPager.PageLayout) obj;
                ArrayList arrayList2 = pageLayout.day;
                if (arrayList2 != null) {
                    pageLayout.peerStoryView.day = arrayList2;
                }
                PeerStoriesView peerStoriesView = pageLayout.peerStoryView;
                long j = pageLayout.dialogId;
                if (peerStoriesView.dialogId != j || peerStoriesView.day != null) {
                    peerStoriesView.dialogId = j;
                    peerStoriesView.updateStoryItems();
                    peerStoriesView.updateSelectedPosition();
                    peerStoriesView.updatePosition(true);
                    TL_stories.PeerStories peerStories = peerStoriesView.storyViewer.overrideUserStories;
                    if (peerStories == null) {
                        StoriesController storiesController = peerStoriesView.storiesController;
                        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
                        if (storiesFromFullPeer == null) {
                            storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
                            z = true;
                        }
                        storiesController.loadSkippedStories(storiesFromFullPeer, z);
                    } else {
                        peerStoriesView.storiesController.loadSkippedStories(peerStories, true);
                    }
                }
                break;
            case 7:
                ((LinkSpanDrawable.LinkCollector) obj).clear();
                break;
            case 8:
                ((StoryContainsEmojiButton) obj).requestLayout();
                break;
            case 9:
                StoryMediaAreasView storyMediaAreasView = (StoryMediaAreasView) obj;
                HintView2 hintView2 = storyMediaAreasView.hintView;
                if (hintView2 != null) {
                    hintView2.hide();
                    storyMediaAreasView.hintView = null;
                }
                storyMediaAreasView.onHintVisible(false);
                break;
            case 10:
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
            case 11:
                StoryViewer storyViewer = ((StoryViewer.AnonymousClass8) obj).this$0;
                try {
                    StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer.windowView;
                    if (anonymousClass2 != null) {
                        if (storyViewer.ATTACH_TO_FRAGMENT) {
                            AndroidUtilities.removeFromParent(anonymousClass2);
                        } else {
                            storyViewer.windowManager.removeView(anonymousClass2);
                        }
                        storyViewer.windowView = null;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 12:
                StoryViewer.this.setInTouchMode(true);
                break;
            case 13:
                ((ViewsForPeerStoriesRequester) obj).lambda$new$0();
                break;
            case 14:
                ((ChatAttachAlert) obj).hide();
                break;
            case 15:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) obj;
                StoriesController.BotPreviewsList botPreviewsList = botPreviewsEditLangContainer.list;
                BotPreviewsEditContainer.this.createStory(botPreviewsList == null ? "" : botPreviewsList.lang_code);
                break;
            case 16:
                TONIntroActivity.NestedFrameLayout nestedFrameLayout = (TONIntroActivity.NestedFrameLayout) obj;
                nestedFrameLayout.getClass();
                try {
                    RecyclerListView currentListView = TONIntroActivity.this.transactionsLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 17:
                ((BotDownloads.DownloadBulletin.BackgroundDrawable) obj).invalidateSelf();
                break;
            case 18:
                ((BotDownloads.DownloadBulletin.StatusDrawable) obj).invalidateSelf();
                break;
            case 19:
                ((BotDownloads.FileDownload) obj).updateProgress();
                break;
            case 20:
                ((BotSensors.AnonymousClass1) obj).post();
                break;
            case 21:
                ((BotSensors.AnonymousClass3) obj).post();
                break;
            case 22:
                ((BotSensors.AnonymousClass4) obj).post();
                break;
            case 23:
                ((BotWebViewSheet.WindowView) obj).invalidate();
                break;
            case 24:
                ((AnimationNotificationsLocker) obj).unlock();
                break;
            case 25:
                ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).updateDrawn();
                break;
            case 26:
                AndroidUtilities.showKeyboard(((RichAIComposeSheet) obj).promptCell.editText);
                break;
            case 27:
                ((RichButtonRowCell.ButtonView) obj).invalidate();
                break;
            case 28:
                TooltipPopup tooltipPopup = (TooltipPopup) obj;
                tooltipPopup.mMessageView = null;
                tooltipPopup.mLayoutParams = null;
                tooltipPopup.mTmpDisplayFrame = null;
                tooltipPopup.mTmpAnchorPos = null;
                tooltipPopup.setBackgroundCell(null);
                break;
            default:
                ((RichEditor.DraggingDrawable) obj).invalidateSelf();
                break;
        }
    }
}
