package org.telegram.ui;

import android.os.Bundle;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final Bundle f$1;
    public final TLRPC.TL_auth_resetLoginEmail f$2;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda10(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = bundle;
        this.f$2 = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                loginActivityEmailCodeView.getClass();
                final Bundle bundle = this.f$1;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.f$2;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        String str2;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = loginActivityEmailCodeView;
                        switch (i) {
                            case 0:
                                LoginActivity loginActivity = LoginActivity.this;
                                if (loginActivity.getParentActivity() != null) {
                                    loginActivityEmailCodeView2.requestingEmailReset = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        loginActivity.fillNextCodeParams(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog.Builder builder = new AlertDialog.Builder(loginActivityEmailCodeView2.getContext(), 0, null);
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            AlertDialog alertDialog = builder.alertDialog;
                                            alertDialog.title = string;
                                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + loginActivityEmailCodeView2.requestPhone))));
                                            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            AlertsCreator.processError(((BaseFragment) loginActivity).currentAccount, tL_error2, loginActivity, tL_auth_resetLoginEmail2, new Object[0]);
                                        } else {
                                            loginActivity.setPage(0, true, null, true);
                                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                loginActivityEmailCodeView2.getClass();
                                boolean z = tLObject2 instanceof TLRPC.TL_auth_sentCode;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                if (z) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = loginActivityEmailCodeView2.currentParams.getString("emailPattern");
                                        loginActivityEmailCodeView2.resetRequestPending = true;
                                    }
                                    loginActivity2.fillNextCodeParams(bundle2, tL_auth_sentCode, true);
                                    break;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        AlertsCreator.processError(((BaseFragment) loginActivity2).currentAccount, tL_error2, loginActivity2, tL_auth_resetLoginEmail2, new Object[0]);
                                    } else {
                                        loginActivity2.setPage(0, true, null, true);
                                        loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                loginActivityEmailCodeView2.getClass();
                final Bundle bundle2 = this.f$1;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.f$2;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        String str2;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail3 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle3 = bundle2;
                        TLObject tLObject2 = tLObject;
                        LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView3 = loginActivityEmailCodeView2;
                        switch (i2) {
                            case 0:
                                LoginActivity loginActivity = LoginActivity.this;
                                if (loginActivity.getParentActivity() != null) {
                                    loginActivityEmailCodeView3.requestingEmailReset = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        loginActivity.fillNextCodeParams(bundle3, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog.Builder builder = new AlertDialog.Builder(loginActivityEmailCodeView3.getContext(), 0, null);
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            AlertDialog alertDialog = builder.alertDialog;
                                            alertDialog.title = string;
                                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + loginActivityEmailCodeView3.requestPhone))));
                                            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            AlertsCreator.processError(((BaseFragment) loginActivity).currentAccount, tL_error2, loginActivity, tL_auth_resetLoginEmail3, new Object[0]);
                                        } else {
                                            loginActivity.setPage(0, true, null, true);
                                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                loginActivityEmailCodeView3.getClass();
                                boolean z = tLObject2 instanceof TLRPC.TL_auth_sentCode;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                if (z) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = loginActivityEmailCodeView3.currentParams.getString("emailPattern");
                                        loginActivityEmailCodeView3.resetRequestPending = true;
                                    }
                                    loginActivity2.fillNextCodeParams(bundle3, tL_auth_sentCode, true);
                                    break;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        AlertsCreator.processError(((BaseFragment) loginActivity2).currentAccount, tL_error2, loginActivity2, tL_auth_resetLoginEmail3, new Object[0]);
                                    } else {
                                        loginActivity2.setPage(0, true, null, true);
                                        loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
