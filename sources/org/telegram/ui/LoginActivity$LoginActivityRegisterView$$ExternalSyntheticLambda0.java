package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRegisterView f$0;

    public LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityRegisterView loginActivityRegisterView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityRegisterView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                loginActivityRegisterView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                loginActivityRegisterView.privacyView.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
                break;
            case 1:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = this.f$0;
                LoginActivity.this.currentTermsOfService.popup = false;
                loginActivityRegisterView2.onNextPressed(null);
                break;
            case 2:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView3 = this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                AlertDialog alertDialog2 = builder.alertDialog;
                alertDialog2.title = string;
                alertDialog2.message = LocaleController.getString("TosDecline", R.string.TosDecline);
                builder.setPositiveButton(LocaleController.getString("SignUp", R.string.SignUp), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(loginActivityRegisterView3, 3));
                builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(loginActivityRegisterView3, 4));
                loginActivity.showDialog(alertDialog2);
                break;
            case 3:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView4 = this.f$0;
                LoginActivity.this.currentTermsOfService.popup = false;
                loginActivityRegisterView4.onNextPressed(null);
                break;
            default:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView5 = this.f$0;
                loginActivityRegisterView5.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                break;
        }
    }
}
