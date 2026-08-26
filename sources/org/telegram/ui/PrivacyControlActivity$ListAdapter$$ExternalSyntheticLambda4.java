package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;
    public final PrivacyControlActivity.ListAdapter f$0;

    public PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4(PrivacyControlActivity.ListAdapter listAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                PrivacyControlActivity.ListAdapter listAdapter = this.f$0;
                listAdapter.getClass();
                long jIntValue = ((Integer) obj).intValue();
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                privacyControlActivity.currentStars = jIntValue;
                AndroidUtilities.updateVisibleRow(privacyControlActivity.listView, privacyControlActivity.priceInfoRow);
                privacyControlActivity.updateDoneButton();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                PrivacyControlActivity.ListAdapter listAdapter2 = this.f$0;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                TLRPC.UserFull userFull = privacyControlActivity2.getMessagesController().getUserFull(privacyControlActivity2.getUserConfig().getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                privacyControlActivity2.getMessagesController().invalidateContentSettings();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new LinkManager$$ExternalSyntheticLambda0(listAdapter2, userFull, tL_birthday2, 20), 1024);
                MessagesController.getInstance(((BaseFragment) privacyControlActivity2).currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(((BaseFragment) privacyControlActivity2).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.updateRows$6(true);
                break;
        }
    }
}
