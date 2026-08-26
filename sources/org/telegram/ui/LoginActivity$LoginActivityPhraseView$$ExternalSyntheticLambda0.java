package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPhraseView f$0;
    public final TLRPC.TL_auth_signIn f$1;

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_auth_signIn tL_auth_signIn, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPhraseView;
        this.f$1 = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                loginActivityPhraseView.getClass();
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f$1;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = loginActivityPhraseView;
                                LoginActivity loginActivity = LoginActivity.this;
                                loginActivity.needHideProgress(false, true);
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i2 = loginActivityPhraseView2.currentType;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        loginActivityPhraseView2.nextPressed = false;
                                        if (i2 != 3) {
                                            boolean zContains = tL_error2.text.contains("PHONE_NUMBER_INVALID");
                                            UsersSelectActivity.AnonymousClass4 anonymousClass4 = loginActivityPhraseView2.codeField;
                                            if (zContains) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                loginActivityPhraseView2.onInputError(false);
                                                anonymousClass4.post(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(loginActivityPhraseView2, 1));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                loginActivityPhraseView2.onBackPressed(true);
                                                loginActivity.setPage(0, true, null, true);
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            anonymousClass4.setText("");
                                            anonymousClass4.requestFocus();
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(loginActivityPhraseView2, tL_auth_signIn2, 1), 10);
                                        loginActivityPhraseView2.destroyTimer$2();
                                    }
                                    break;
                                } else {
                                    loginActivityPhraseView2.nextPressed = false;
                                    loginActivity.showDoneButton(false, true);
                                    loginActivityPhraseView2.destroyTimer$2();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            loginActivity.currentTermsOfService = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", loginActivityPhraseView2.requestPhone);
                                        bundle.putString("phoneHash", loginActivityPhraseView2.phoneHash);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        loginActivity.setPage(5, true, bundle, false);
                                    } else {
                                        loginActivity.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i2 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView;
                                loginActivityPhraseView3.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                loginActivity2.showDoneButton(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                                        AlertsCreator.showUpdateAppAlert(loginActivity2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", loginActivityPhraseView3.requestPhone);
                                        bundle2.putString("phoneHash", loginActivityPhraseView3.phoneHash);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        loginActivity2.setPage(6, true, bundle2, false);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = this.f$0;
                loginActivityPhraseView2.getClass();
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f$1;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                LoginActivity.LoginActivityPhraseView loginActivityPhraseView3 = loginActivityPhraseView2;
                                LoginActivity loginActivity = LoginActivity.this;
                                loginActivity.needHideProgress(false, true);
                                TLRPC.TL_auth_signIn tL_auth_signIn3 = tL_auth_signIn2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i3 = loginActivityPhraseView3.currentType;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        loginActivityPhraseView3.nextPressed = false;
                                        if (i3 != 3) {
                                            boolean zContains = tL_error2.text.contains("PHONE_NUMBER_INVALID");
                                            UsersSelectActivity.AnonymousClass4 anonymousClass4 = loginActivityPhraseView3.codeField;
                                            if (zContains) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                loginActivityPhraseView3.onInputError(false);
                                                anonymousClass4.post(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(loginActivityPhraseView3, 1));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                loginActivityPhraseView3.onBackPressed(true);
                                                loginActivity.setPage(0, true, null, true);
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            anonymousClass4.setText("");
                                            anonymousClass4.requestFocus();
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(loginActivityPhraseView3, tL_auth_signIn3, 1), 10);
                                        loginActivityPhraseView3.destroyTimer$2();
                                    }
                                    break;
                                } else {
                                    loginActivityPhraseView3.nextPressed = false;
                                    loginActivity.showDoneButton(false, true);
                                    loginActivityPhraseView3.destroyTimer$2();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            loginActivity.currentTermsOfService = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", loginActivityPhraseView3.requestPhone);
                                        bundle.putString("phoneHash", loginActivityPhraseView3.phoneHash);
                                        bundle.putString("code", tL_auth_signIn3.phone_code);
                                        loginActivity.setPage(5, true, bundle, false);
                                    } else {
                                        loginActivity.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i3 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                LoginActivity.LoginActivityPhraseView loginActivityPhraseView4 = loginActivityPhraseView2;
                                loginActivityPhraseView4.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                loginActivity2.showDoneButton(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                                        AlertsCreator.showUpdateAppAlert(loginActivity2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", loginActivityPhraseView4.requestPhone);
                                        bundle2.putString("phoneHash", loginActivityPhraseView4.phoneHash);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        loginActivity2.setPage(6, true, bundle2, false);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
