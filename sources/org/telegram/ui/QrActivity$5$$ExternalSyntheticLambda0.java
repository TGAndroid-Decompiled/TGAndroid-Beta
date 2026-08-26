package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class QrActivity$5$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public QrActivity$5$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        String str;
        int i = 8;
        int i2 = 0;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                BaseFragment baseFragment = (BaseFragment) obj2;
                if (!baseFragment.isFinished) {
                    if (l == null || l.longValue() == Long.MAX_VALUE) {
                        AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(24));
                    } else {
                        baseFragment.presentFragment(ProfileActivity.of(l.longValue()), true);
                    }
                    break;
                }
                break;
            case 1:
                ChannelBoostLayout channelBoostLayout = (ChannelBoostLayout) obj2;
                channelBoostLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(i, channelBoostLayout, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj2;
                channelMonetizationLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(14, channelMonetizationLayout, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                MessagePreviewView.Page page = (MessagePreviewView.Page) obj2;
                page.adapter.onViewAttachedToWindow(page.chatListView.getChildViewHolder((View) obj));
                break;
            case 4:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) obj2;
                chatCustomReactionsEditActivity.boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (!chatCustomReactionsEditActivity.selectedEmojisMap.keySet().equals(chatCustomReactionsEditActivity.initialSelectedEmojis.keySet())) {
                    chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
                }
                break;
            case 5:
                UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) obj2;
                universalRecyclerView.adapter.updateReorder(universalRecyclerView.getChildViewHolder((View) obj), universalRecyclerView.reorderingAllowed);
                break;
            case 6:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ((LaunchActivity$$ExternalSyntheticLambda176) obj2).run();
                break;
            case 7:
                View view = (View) obj;
                PeerColorActivity.Page page2 = (PeerColorActivity.Page) obj2;
                page2.getClass();
                boolean z = view instanceof PeerColorActivity.PeerColorGrid;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (z) {
                    view.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((PeerColorActivity.PeerColorGrid) view).updateColors();
                } else if (view instanceof TextCell) {
                    view.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((TextCell) view).updateColors();
                } else if (view instanceof PeerColorActivity.Page.SetReplyIconCell) {
                    int i3 = Theme.key_windowBackgroundWhite;
                    view.setBackgroundColor(peerColorActivity.getThemedColor(i3));
                    PeerColorActivity.Page.SetReplyIconCell setReplyIconCell = (PeerColorActivity.Page.SetReplyIconCell) view;
                    setReplyIconCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(i3));
                    setReplyIconCell.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                } else if (view instanceof HeaderCell) {
                    view.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                } else if (view instanceof PeerColorActivity.GiftCell) {
                    ((PeerColorActivity.GiftCell) view).card.invalidate();
                } else if (view instanceof GiftSheet.Tabs) {
                    view.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((GiftSheet.Tabs) view).updateColors();
                } else if (view instanceof PeerColorActivity.Page.EmptyView) {
                    PeerColorActivity.Page.EmptyView emptyView = (PeerColorActivity.Page.EmptyView) view;
                    emptyView.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    LinkSpanDrawable.LinksTextView linksTextView = emptyView.title;
                    PeerColorActivity.Page page3 = PeerColorActivity.Page.this;
                    linksTextView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                    LinkSpanDrawable.LinksTextView linksTextView2 = emptyView.subtitle;
                    int i4 = Theme.key_chat_messageLinkIn;
                    PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                    linksTextView2.setTextColor(peerColorActivity2.getThemedColor(i4));
                    linksTextView2.setLinkTextColor(peerColorActivity2.getThemedColor(i4));
                }
                break;
            case 8:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                PeerStoriesView peerStoriesView = (PeerStoriesView) obj2;
                if (tL_premium_boostsStatus != null) {
                    peerStoriesView.boostsStatus = tL_premium_boostsStatus;
                    MessagesController.getInstance(peerStoriesView.currentAccount).getBoostsController().userCanBoostChannel(peerStoriesView.dialogId, tL_premium_boostsStatus, new ChatActivity$$ExternalSyntheticLambda335(i, peerStoriesView, tL_premium_boostsStatus));
                } else {
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    if (storyViewer != null) {
                        storyViewer.isOverlayVisible = false;
                        storyViewer.updatePlayingMode();
                    }
                }
                break;
            case 9:
                SelfStoryViewsPage selfStoryViewsPage = (SelfStoryViewsPage) obj;
                while (true) {
                    SelfStoryViewsView selfStoryViewsView = ((SelfStoryViewsView.AnonymousClass4) obj2).this$0;
                    if (i2 < selfStoryViewsView.itemViews.size()) {
                        ArrayList arrayList = selfStoryViewsView.itemViews;
                        if (selfStoryViewsPage != arrayList.get(i2)) {
                            ((SelfStoryViewsPage) arrayList.get(i2)).getClass();
                        }
                        i2++;
                    }
                    break;
                }
                break;
            case 10:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                StoryCaptionView.Panel panel = (StoryCaptionView.Panel) obj2;
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
            case 11:
                View view2 = (View) obj;
                MultipleStoriesSelector multipleStoriesSelector = (MultipleStoriesSelector) obj2;
                multipleStoriesSelector.getClass();
                if (view2 instanceof MultipleStoriesSelector.EntryView) {
                    MultipleStoriesSelector.AnonymousClass1 anonymousClass1 = multipleStoriesSelector.listView;
                    anonymousClass1.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(view2);
                    UItem item = anonymousClass1.adapter.getItem(childAdapterPosition);
                    if (item != null) {
                        MultipleStoriesSelector.EntryView entryView = (MultipleStoriesSelector.EntryView) view2;
                        entryView.setPosition(multipleStoriesSelector.getPositionOf(childAdapterPosition));
                        boolean z2 = multipleStoriesSelector.selectedStory == item.id;
                        if (entryView.selected != z2) {
                            entryView.selected = z2;
                            entryView.invalidate();
                        }
                        boolean zContains = multipleStoriesSelector.selectedStories.contains(Integer.valueOf(item.id));
                        if (entryView.checked != zContains) {
                            entryView.checked = zContains;
                            entryView.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 12:
                View view3 = (View) obj;
                MultipleStoriesSelector.AnonymousClass1 anonymousClass2 = (MultipleStoriesSelector.AnonymousClass1) obj2;
                anonymousClass2.getClass();
                if (view3 instanceof MultipleStoriesSelector.EntryView) {
                    StoryRecorder.AnonymousClass11 anonymousClass11 = anonymousClass2.this$0;
                    anonymousClass11.listView.getClass();
                    ((MultipleStoriesSelector.EntryView) view3).setPosition(anonymousClass11.getPositionOf(RecyclerView.getChildAdapterPosition(view3)));
                    view3.setPressed(false);
                }
                break;
            case 13:
                ((SelectAudioAlert) obj2).lambda$loadGlobalAudio$4((Long) obj);
                break;
            default:
                ((TopicsFragment) obj2).boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
