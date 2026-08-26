package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public final class ThemeSetUrlActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ThemeSetUrlActivity$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ThemeSetUrlActivity themeSetUrlActivity = (ThemeSetUrlActivity) this.f$0;
                themeSetUrlActivity.getClass();
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(themeSetUrlActivity, tL_error, (TL_account.updateTheme) this.f$1, 19));
                } else {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(12, themeSetUrlActivity, (TLRPC.TL_theme) tLObject));
                }
                break;
            case 1:
                ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) this.f$0;
                viewsForPeerStoriesRequester.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(viewsForPeerStoriesRequester, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f$1, 8));
                break;
            case 2:
                EmojiBottomSheet.Page.Adapter adapter = (EmojiBottomSheet.Page.Adapter) this.f$0;
                adapter.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(adapter, (String) this.f$1, tLObject, 9));
                break;
            case 3:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(searchAdapter, tLObject, (MessagesController) this.f$1, 12));
                break;
            case 4:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(page, tLObject, (MessagesController) this.f$1, 15));
                break;
            case 5:
                ThemeSetUrlActivity themeSetUrlActivity2 = (ThemeSetUrlActivity) this.f$0;
                themeSetUrlActivity2.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(themeSetUrlActivity2, (String) this.f$1, tL_error, 18));
                break;
            case 6:
                TopicsFragment.MessagesSearchContainer messagesSearchContainer = (TopicsFragment.MessagesSearchContainer) this.f$0;
                messagesSearchContainer.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(messagesSearchContainer, (String) this.f$1, tLObject, 22));
                break;
            case 7:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.f$0;
                twoStepVerificationSetupActivity.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(twoStepVerificationSetupActivity, tLObject, (String) this.f$1, tL_error, 26));
                break;
            case 8:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = (TwoStepVerificationSetupActivity) this.f$0;
                twoStepVerificationSetupActivity2.getClass();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28(twoStepVerificationSetupActivity2, tL_error, 3));
                } else {
                    AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda19(twoStepVerificationSetupActivity2, (byte[]) this.f$1, 1));
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(25, (WallpapersListActivity.AnonymousClass2) this.f$0, (int[]) this.f$1));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8((boolean[]) this.f$0, tLObject, (BotVerifySheet$$ExternalSyntheticLambda1) this.f$1, 25));
                break;
            default:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(channelAffiliateProgramsFragment, tLObject, (AlertDialog) this.f$1, 28));
                break;
        }
    }
}
