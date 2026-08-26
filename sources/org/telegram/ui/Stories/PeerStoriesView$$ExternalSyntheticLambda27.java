package org.telegram.ui.Stories;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Gifts.SendGiftSheet;

public final class PeerStoriesView$$ExternalSyntheticLambda27 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public PeerStoriesView$$ExternalSyntheticLambda27(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        switch (this.$r8$classId) {
            case 0:
                final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                final PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                if (tL_premium_boostsStatus != null) {
                    peerStoriesView.boostsStatus = tL_premium_boostsStatus;
                    MessagesController.getInstance(peerStoriesView.currentAccount).getBoostsController().userCanBoostChannel(peerStoriesView.dialogId, tL_premium_boostsStatus, new Consumer() {
                        @Override
                        public final void accept(Object obj2) {
                            ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj2;
                            PeerStoriesView peerStoriesView2 = peerStoriesView;
                            peerStoriesView2.canApplyBoost = canApplyBoost;
                            LimitReachedBottomSheet.openBoostsForRemoveRestrictions(new SendGiftSheet.AnonymousClass8(peerStoriesView2, 4), tL_premium_boostsStatus, canApplyBoost, peerStoriesView2.dialogId, true);
                            StoryViewer storyViewer = peerStoriesView2.storyViewer;
                            if (storyViewer != null) {
                                storyViewer.isOverlayVisible = false;
                                storyViewer.updatePlayingMode();
                            }
                        }
                    });
                } else {
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    if (storyViewer != null) {
                        storyViewer.isOverlayVisible = false;
                        storyViewer.updatePlayingMode();
                    }
                }
                break;
            case 1:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.f$0;
                chatCustomReactionsEditActivity.boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (!chatCustomReactionsEditActivity.selectedEmojisMap.keySet().equals(chatCustomReactionsEditActivity.initialSelectedEmojis.keySet())) {
                    chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
                }
                break;
            case 2:
                SelfStoryViewsPage selfStoryViewsPage = (SelfStoryViewsPage) obj;
                int i = 0;
                while (true) {
                    SelfStoryViewsView selfStoryViewsView = ((SelfStoryViewsView.AnonymousClass4) this.f$0).this$0;
                    if (i < selfStoryViewsView.itemViews.size()) {
                        ArrayList arrayList = selfStoryViewsView.itemViews;
                        if (selfStoryViewsPage != arrayList.get(i)) {
                            ((SelfStoryViewsPage) arrayList.get(i)).getClass();
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                StoryCaptionView.Panel panel = (StoryCaptionView.Panel) this.f$0;
                panel.loaded = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    panel.updateText = true;
                    panel.text = str;
                    panel.small = TextUtils.isEmpty(str);
                    StoryCaptionView.StoryCaptionTextView storyCaptionTextView = panel.view;
                    if (storyCaptionTextView != null) {
                        storyCaptionTextView.invalidate();
                    }
                    Runnable runnable = panel.whenLoaded;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                }
                break;
        }
    }
}
