package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.PrivacyControlActivity;

public final class UserSelectorBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final UserSelectorBottomSheet f$0;

    public UserSelectorBottomSheet$$ExternalSyntheticLambda0(UserSelectorBottomSheet userSelectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = userSelectorBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$23();
                break;
            case 1:
                UserSelectorBottomSheet userSelectorBottomSheet = this.f$0;
                userSelectorBottomSheet.checkEditTextHint();
                userSelectorBottomSheet.updateList(true, false);
                break;
            case 2:
                this.f$0.buttonContainer.setVisibility(8);
                break;
            case 3:
                UserSelectorBottomSheet userSelectorBottomSheet2 = this.f$0;
                userSelectorBottomSheet2.checkEditTextHint();
                userSelectorBottomSheet2.updateList(true, false);
                break;
            case 4:
                UserSelectorBottomSheet userSelectorBottomSheet3 = this.f$0;
                userSelectorBottomSheet3.getClass();
                userSelectorBottomSheet3.searchField.editText.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                UserSelectorBottomSheet userSelectorBottomSheet4 = this.f$0;
                userSelectorBottomSheet4.getClass();
                userSelectorBottomSheet4.searchField.editText.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 6:
                this.f$0.lambda$didReceivedNotification$24();
                break;
            case 7:
                UserSelectorBottomSheet userSelectorBottomSheet5 = this.f$0;
                userSelectorBottomSheet5.checkEditTextHint();
                userSelectorBottomSheet5.updateList(true, false);
                break;
            case 8:
                this.f$0.buttonContainer.setVisibility(8);
                break;
            case 9:
                UserSelectorBottomSheet userSelectorBottomSheet6 = this.f$0;
                userSelectorBottomSheet6.checkEditTextHint();
                userSelectorBottomSheet6.updateList(true, false);
                break;
            case 10:
                BaseFragment baseFragment = this.f$0.baseFragment;
                if (baseFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    baseFragment.showAsSheet(new PrivacyControlActivity(11, false), bottomSheetParams);
                    break;
                }
                break;
            case 11:
                this.f$0.updateItems(true, true);
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
