package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId = 0;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final TLRPC.TL_error f$1;
    public final String f$2;
    public final TLObject f$3;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = tL_error;
        this.f$2 = str;
        this.f$3 = tLObject;
    }

    @Override
    public final void run() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.needHideProgress(false, true);
                String str = this.f$2;
                TLRPC.TL_error tL_error = this.f$1;
                if (tL_error == null) {
                    loginActivityEmailCodeView.nextPressed = false;
                    loginActivity.showDoneButton(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", loginActivityEmailCodeView.phone);
                    bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                    bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                    bundle.putString("phoneHash", loginActivityEmailCodeView.phoneHash);
                    bundle.putString("code", str);
                    TLObject tLObject = this.f$3;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            loginActivity.currentTermsOfService = tL_help_termsOfService;
                        }
                        final int i2 = 0;
                        loginActivityEmailCodeView.animateSuccess$1(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        LoginActivity.this.setPage(5, true, bundle, false);
                                        break;
                                    default:
                                        LoginActivity.this.setPage(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        loginActivityEmailCodeView.animateSuccess$1(new LinkManager$$ExternalSyntheticLambda21(loginActivityEmailCodeView, tLObject, bundle, 12));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0(loginActivityEmailCodeView, str, 1), 10);
                } else {
                    loginActivityEmailCodeView.nextPressed = false;
                    loginActivity.showDoneButton(false, true);
                    boolean zContains = tL_error.text.contains("EMAIL_ADDRESS_INVALID");
                    PasscodeActivity.AnonymousClass8 anonymousClass8 = loginActivityEmailCodeView.codeFieldContainer;
                    if (zContains) {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        try {
                            anonymousClass8.performHapticFeedback(3, 2);
                            while (true) {
                                CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
                                if (i < codeNumberFieldArr.length) {
                                    codeNumberFieldArr[i].setText("");
                                    CodeNumberField.animateSpring(anonymousClass8.codeField[i].errorSpringAnimation, 100.0f);
                                    i++;
                                } else {
                                    LoginActivity.LoginActivitySmsView.AnonymousClass4 anonymousClass4 = loginActivityEmailCodeView.errorViewSwitcher;
                                    if (anonymousClass4.getCurrentView() == loginActivityEmailCodeView.resendFrameLayout) {
                                        anonymousClass4.showNext();
                                        AndroidUtilities.updateViewVisibilityAnimated(loginActivityEmailCodeView.cantAccessEmailFrameLayout, false, 1.0f, true);
                                    }
                                    anonymousClass8.codeField[0].requestFocus();
                                    AndroidUtilities.shakeViewSpring(anonymousClass8, 10.0f, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(loginActivityEmailCodeView, 4));
                                    LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 = loginActivityEmailCodeView.errorColorTimeout;
                                    loginActivityEmailCodeView.removeCallbacks(loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2);
                                    loginActivityEmailCodeView.postDelayed(loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2, 5000L);
                                    loginActivityEmailCodeView.postedErrorColorTimeout = true;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        i = 0;
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        loginActivity.setPage(0, true, null, true);
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (anonymousClass8.codeField != null) {
                        int i3 = 0;
                        while (true) {
                            CodeNumberField[] codeNumberFieldArr2 = anonymousClass8.codeField;
                            if (i3 < codeNumberFieldArr2.length) {
                                codeNumberFieldArr2[i3].setText("");
                                i3++;
                            } else {
                                codeNumberFieldArr2[0].requestFocus();
                            }
                        }
                    }
                    anonymousClass8.isFocusSuppressed = false;
                }
                loginActivityEmailCodeView.googleAccount = null;
                break;
            default:
                final LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                loginActivityEmailCodeView2.nextPressed = false;
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.showDoneButton(false, true);
                TLRPC.TL_error tL_error2 = this.f$1;
                if (tL_error2 != null) {
                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                } else {
                    TL_account.Password password = (TL_account.Password) this.f$3;
                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                        AlertsCreator.showUpdateAppAlert(loginActivity2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", loginActivityEmailCodeView2.requestPhone);
                        bundle2.putString("phoneHash", loginActivityEmailCodeView2.phoneHash);
                        bundle2.putString("code", this.f$2);
                        final int i4 = 1;
                        loginActivityEmailCodeView2.animateSuccess$1(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        LoginActivity.this.setPage(5, true, bundle2, false);
                                        break;
                                    default:
                                        LoginActivity.this.setPage(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                    }
                }
                break;
        }
    }

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = tL_error;
        this.f$3 = tLObject;
        this.f$2 = str;
    }
}
