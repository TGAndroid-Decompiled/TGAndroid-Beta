package org.telegram.ui.Stories;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;

public final class PeerStoriesView$8$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;
    public final StoryViewer f$1;
    public final DarkThemeResourceProvider f$2;

    public PeerStoriesView$8$$ExternalSyntheticLambda3(PeerStoriesView.AnonymousClass8 anonymousClass8, DarkThemeResourceProvider darkThemeResourceProvider, StoryViewer storyViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$2 = darkThemeResourceProvider;
        this.f$1 = storyViewer;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = this.f$0;
                StoryViewer storyViewer = this.f$1;
                if (storyViewer != null) {
                    storyViewer.isOverlayVisible = true;
                    storyViewer.updatePlayingMode();
                }
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                int i = anonymousClass1.currentAccount;
                Context context = anonymousClass1.getContext();
                TL_stories.StoryItem storyItem = anonymousClass1.currentStory.storyItem;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = anonymousClass1.storyContainer;
                DarkThemeResourceProvider darkThemeResourceProvider = this.f$2;
                ReportBottomSheet.openStory(i, context, storyItem, BulletinFactory.of(anonymousClass4, darkThemeResourceProvider), darkThemeResourceProvider, new RichEditor$$ExternalSyntheticLambda53(storyViewer, 5));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                }
                break;
            case 1:
                PeerStoriesView.AnonymousClass8 anonymousClass10 = this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass10.this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass11 = anonymousClass2.popupMenu;
                if (anonymousClass11 != null) {
                    anonymousClass11.dismiss();
                }
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = new StoryPrivacyBottomSheet(anonymousClass2.getContext(), 86400, this.f$2);
                storyPrivacyBottomSheet.isLive = true;
                View[] viewPages = storyPrivacyBottomSheet.viewPager.getViewPages();
                View view2 = viewPages[0];
                if (view2 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) view2;
                    page.bind(page.pageType);
                }
                View view3 = viewPages[1];
                if (view3 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) view3;
                    page2.bind(page2.pageType);
                }
                storyPrivacyBottomSheet.setPeer(MessagesController.getInstance(anonymousClass2.currentAccount).getInputPeer(anonymousClass2.dialogId));
                storyPrivacyBottomSheet.liveSettings = true;
                View[] viewPages2 = storyPrivacyBottomSheet.viewPager.getViewPages();
                View view4 = viewPages2[0];
                if (view4 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page3 = (StoryPrivacyBottomSheet.Page) view4;
                    page3.bind(page3.pageType);
                }
                View view5 = viewPages2[1];
                if (view5 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page4 = (StoryPrivacyBottomSheet.Page) view5;
                    page4.bind(page4.pageType);
                }
                storyPrivacyBottomSheet.allowCover(false);
                storyPrivacyBottomSheet.setCount(1);
                storyPrivacyBottomSheet.isEdit(false);
                StoryViewer storyViewer2 = this.f$1;
                LivePlayer livePlayer = storyViewer2.livePlayer;
                if (livePlayer == null) {
                    z = false;
                } else {
                    TLRPC.GroupCall groupCall = livePlayer.call;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass2.currentStory;
                boolean zAllowScreenshots = storyItemHolder.allowScreenshots();
                TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                boolean z2 = storyItem2 != null && storyItem2.pinned;
                LivePlayer livePlayer2 = storyViewer2.livePlayer;
                int sendPaidMessagesStars = livePlayer2 == null ? 0 : (int) livePlayer2.getSendPaidMessagesStars();
                storyPrivacyBottomSheet.allowComments = z;
                storyPrivacyBottomSheet.allowScreenshots = zAllowScreenshots;
                storyPrivacyBottomSheet.keepOnMyPage = z2;
                storyPrivacyBottomSheet.commentsPrice = sendPaidMessagesStars;
                View[] viewPages3 = storyPrivacyBottomSheet.viewPager.getViewPages();
                View view6 = viewPages3[0];
                if (view6 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page5 = (StoryPrivacyBottomSheet.Page) view6;
                    page5.bind(page5.pageType);
                }
                View view7 = viewPages3[1];
                if (view7 instanceof StoryPrivacyBottomSheet.Page) {
                    StoryPrivacyBottomSheet.Page page6 = (StoryPrivacyBottomSheet.Page) view7;
                    page6.bind(page6.pageType);
                }
                storyPrivacyBottomSheet.onDone = new RateCallLayout$$ExternalSyntheticLambda1(20, anonymousClass10, storyPrivacyBottomSheet);
                storyPrivacyBottomSheet.show();
                break;
            default:
                PeerStoriesView.AnonymousClass8 anonymousClass12 = this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass12.this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass13 = anonymousClass3.popupMenu;
                if (anonymousClass13 != null) {
                    anonymousClass13.dismiss();
                }
                new AlertDialog.Builder(anonymousClass3.getContext(), 0, this.f$2).setTitle(LocaleController.getString(R.string.LiveStoryEndAlertTitle)).setMessage(LocaleController.getString(R.string.LiveStoryEndAlertText)).setPositiveButton(LocaleController.getString(R.string.LiveStoryEndAlertButton), new RateCallLayout$$ExternalSyntheticLambda1(21, anonymousClass12, this.f$1)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
                break;
        }
    }

    public PeerStoriesView$8$$ExternalSyntheticLambda3(PeerStoriesView.AnonymousClass8 anonymousClass8, StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass8;
        this.f$1 = storyViewer;
        this.f$2 = darkThemeResourceProvider;
    }
}
