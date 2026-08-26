package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class BotWebViewSheet$3$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewSheet.AnonymousClass3 f$0;

    public BotWebViewSheet$3$$ExternalSyntheticLambda0(BotWebViewSheet.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewSheet.AnonymousClass3 anonymousClass3 = this.f$0;
                anonymousClass3.getClass();
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputUser(botWebViewSheet.botId);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(botWebViewSheet.currentAccount).sendRequest(toggleuseremojistatuspermission, new BotWebViewSheet$3$$ExternalSyntheticLambda2(anonymousClass3, 1));
                break;
            case 1:
                BotWebViewSheet botWebViewSheet2 = BotWebViewSheet.this;
                BotLocation.get(botWebViewSheet2.getContext(), botWebViewSheet2.currentAccount, botWebViewSheet2.botId).setGranted(false, null);
                break;
            default:
                BotWebViewSheet.AnonymousClass3 anonymousClass4 = this.f$0;
                anonymousClass4.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null && safeLastFragment.getParentLayout() != null) {
                    INavigationLayout parentLayout = safeLastFragment.getParentLayout();
                    BotWebViewSheet botWebViewSheet3 = BotWebViewSheet.this;
                    safeLastFragment.presentFragment(ProfileActivity.of(botWebViewSheet3.botId));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    botWebViewSheet3.dismiss$1(true);
                    break;
                }
                break;
        }
    }
}
