package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LoginActivity$LoginPayView$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginPayView f$0;

    public LoginActivity$LoginPayView$$ExternalSyntheticLambda4(LoginActivity.LoginPayView loginPayView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginPayView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.button.setLoading(false);
                break;
            case 1:
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.setPage(0, true, null, true);
                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.setPage(0, true, null, true);
                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 3:
                this.f$0.poll$1();
                break;
            default:
                LoginActivity.LoginPayView loginPayView = this.f$0;
                loginPayView.getClass();
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                LoginActivity loginActivity3 = LoginActivity.this;
                premiumPreviewFragment.setCurrentAccount(((BaseFragment) loginActivity3).currentAccount);
                loginActivity3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
