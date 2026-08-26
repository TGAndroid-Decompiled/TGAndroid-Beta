package org.telegram.ui.Stories;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class PeerStoriesView$8$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;
    public final StoryViewer f$1;
    public final DarkThemeResourceProvider f$2;

    public PeerStoriesView$8$$ExternalSyntheticLambda4(PeerStoriesView.AnonymousClass8 anonymousClass8, DarkThemeResourceProvider darkThemeResourceProvider, StoryViewer storyViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$2 = darkThemeResourceProvider;
        this.f$1 = storyViewer;
    }

    @Override
    public final void onClick(View view) {
        ActionBarPopupWindow actionBarPopupWindow;
        boolean z;
        ActionBarPopupWindow actionBarPopupWindow2;
        ActionBarPopupWindow actionBarPopupWindow3;
        DarkThemeResourceProvider darkThemeResourceProvider = this.f$2;
        StoryViewer storyViewer = this.f$1;
        PeerStoriesView.AnonymousClass8 anonymousClass8 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (storyViewer != null) {
                    anonymousClass8.getClass();
                    storyViewer.isOverlayVisible = true;
                    storyViewer.updatePlayingMode();
                }
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                int i = anonymousClass1.currentAccount;
                Context context = anonymousClass1.getContext();
                TL_stories.StoryItem storyItem = anonymousClass1.currentStory.storyItem;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = anonymousClass1.storyContainer;
                DarkThemeResourceProvider darkThemeResourceProvider2 = this.f$2;
                BulletinFactory bulletinFactory = new BulletinFactory(anonymousClass4, darkThemeResourceProvider2);
                VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(storyViewer, 8);
                int i2 = ReportBottomSheet.$r8$clinit;
                ReportBottomSheet.open(i, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), bulletinFactory, darkThemeResourceProvider2, new byte[0], null, voIPFragment$$ExternalSyntheticLambda7);
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            case 1:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass2.popupMenu;
                if (anonymousClass10 != null && (actionBarPopupWindow2 = anonymousClass10.popupWindow) != null) {
                    actionBarPopupWindow2.dismiss(true);
                }
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = new StoryPrivacyBottomSheet(anonymousClass2.getContext(), 86400, darkThemeResourceProvider);
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
                LivePlayer livePlayer = storyViewer.livePlayer;
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
                LivePlayer livePlayer2 = storyViewer.livePlayer;
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
                storyPrivacyBottomSheet.onDone = new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(22, anonymousClass8, storyPrivacyBottomSheet);
                storyPrivacyBottomSheet.show();
                break;
            default:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass8.this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass11 = anonymousClass3.popupMenu;
                if (anonymousClass11 != null && (actionBarPopupWindow3 = anonymousClass11.popupWindow) != null) {
                    actionBarPopupWindow3.dismiss(true);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(anonymousClass3.getContext(), 0, darkThemeResourceProvider);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.LiveStoryEndAlertText);
                builder.setPositiveButton(LocaleController.getString(R.string.LiveStoryEndAlertButton), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(23, anonymousClass8, storyViewer));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.makeRed(-1);
                builder.show();
                break;
        }
    }

    public PeerStoriesView$8$$ExternalSyntheticLambda4(PeerStoriesView.AnonymousClass8 anonymousClass8, StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass8;
        this.f$1 = storyViewer;
        this.f$2 = darkThemeResourceProvider;
    }
}
