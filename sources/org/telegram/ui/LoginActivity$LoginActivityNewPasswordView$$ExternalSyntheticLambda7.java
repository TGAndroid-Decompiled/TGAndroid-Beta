package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId = 0;
    public final LoginActivity.LoginActivityNewPasswordView f$0;
    public final TLRPC.TL_error f$1;
    public final String f$2;
    public final String f$3;
    public final TLObject f$4;

    public LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f$0 = loginActivityNewPasswordView;
        this.f$1 = tL_error;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run() {
        String str = this.f$3;
        String str2 = this.f$2;
        TLObject tLObject = this.f$4;
        TLRPC.TL_error tL_error = this.f$1;
        LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                LoginActivity loginActivity = LoginActivity.this;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6(loginActivityNewPasswordView, str2, str, i), 8);
                } else {
                    loginActivity.needHideProgress(false, true);
                    if (tLObject instanceof TLRPC.auth_Authorization) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda89(24, loginActivityNewPasswordView, tLObject));
                        boolean zIsEmpty = TextUtils.isEmpty(str2);
                        AlertDialog alertDialog = builder.alertDialog;
                        if (zIsEmpty) {
                            alertDialog.message = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            alertDialog.message = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        alertDialog.title = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog dialogShowDialog = loginActivity.showDialog(alertDialog);
                        if (dialogShowDialog != null) {
                            dialogShowDialog.setCanceledOnTouchOutside(false);
                            dialogShowDialog.setCancelable(false);
                        }
                    } else if (tL_error != null) {
                        loginActivityNewPasswordView.nextPressed = false;
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                        } else {
                            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        }
                    }
                }
                break;
            default:
                loginActivityNewPasswordView.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    loginActivityNewPasswordView.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    loginActivityNewPasswordView.recoverPassword(str2, str);
                }
                break;
        }
    }

    public LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f$0 = loginActivityNewPasswordView;
        this.f$1 = tL_error;
        this.f$4 = tLObject;
        this.f$2 = str;
        this.f$3 = str2;
    }
}
