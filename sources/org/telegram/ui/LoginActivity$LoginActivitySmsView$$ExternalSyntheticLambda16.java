package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
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

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final TLRPC.TL_auth_signIn f$1;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16(LoginActivity.LoginActivitySmsView loginActivitySmsView, TLRPC.TL_auth_signIn tL_auth_signIn, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
        this.f$1 = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                loginActivitySmsView.getClass();
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f$1;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i2;
                        int i3;
                        int i4;
                        switch (i) {
                            case 0:
                                final LoginActivity.LoginActivitySmsView loginActivitySmsView2 = loginActivitySmsView;
                                loginActivitySmsView2.tryHideProgress(false);
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                LoginActivity loginActivity = LoginActivity.this;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i5 = loginActivitySmsView2.currentType;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    loginActivitySmsView2.lastError = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        loginActivitySmsView2.nextPressed = false;
                                        loginActivity.showDoneButton(false, true);
                                        if ((i5 == 3 && ((i4 = loginActivitySmsView2.nextType) == 4 || i4 == 2 || i4 == 17 || i4 == 16)) || ((i5 == 2 && ((i3 = loginActivitySmsView2.nextType) == 4 || i3 == 3)) || (i5 == 4 && ((i2 = loginActivitySmsView2.nextType) == 2 || i2 == 17 || i2 == 16)))) {
                                            loginActivitySmsView2.createTimer();
                                        }
                                        if (i5 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i5 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i5 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(20));
                                        }
                                        loginActivitySmsView2.waitingForEvent = true;
                                        if (i5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                loginActivitySmsView2.shakeWrongCode();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                loginActivitySmsView2.onBackPressed(true);
                                                loginActivity.setPage(0, true, null, true);
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i6 = 0;
                                            while (true) {
                                                CodeFieldContainer codeFieldContainer = loginActivitySmsView2.codeFieldContainer;
                                                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                                                if (i6 >= codeNumberFieldArr.length) {
                                                    codeFieldContainer.isFocusSuppressed = false;
                                                    codeNumberFieldArr[0].requestFocus();
                                                } else {
                                                    codeNumberFieldArr[i6].setText("");
                                                    i6++;
                                                }
                                            }
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16(loginActivitySmsView2, tL_auth_signIn2, 1), 10);
                                        loginActivitySmsView2.destroyTimer();
                                        loginActivitySmsView2.destroyCodeTimer();
                                    }
                                    break;
                                } else {
                                    loginActivitySmsView2.nextPressed = false;
                                    loginActivity.showDoneButton(false, true);
                                    loginActivitySmsView2.destroyTimer();
                                    loginActivitySmsView2.destroyCodeTimer();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            loginActivity.currentTermsOfService = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", loginActivitySmsView2.requestPhone);
                                        bundle.putString("phoneHash", loginActivitySmsView2.phoneHash);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        final int i7 = 0;
                                        loginActivitySmsView2.animateSuccess(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i7) {
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
                                        loginActivitySmsView2.animateSuccess(new LinkManager$$ExternalSyntheticLambda2(14, loginActivitySmsView2, tLObject2));
                                    }
                                }
                                if (i5 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                final LoginActivity.LoginActivitySmsView loginActivitySmsView3 = loginActivitySmsView;
                                loginActivitySmsView3.nextPressed = false;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", loginActivitySmsView3.requestPhone);
                                        bundle2.putString("phoneHash", loginActivitySmsView3.phoneHash);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        final int i8 = 1;
                                        loginActivitySmsView3.animateSuccess(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i8) {
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
                });
                break;
            default:
                final LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                loginActivitySmsView2.getClass();
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f$1;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i4;
                        int i5;
                        switch (i2) {
                            case 0:
                                final LoginActivity.LoginActivitySmsView loginActivitySmsView3 = loginActivitySmsView2;
                                loginActivitySmsView3.tryHideProgress(false);
                                TLRPC.TL_auth_signIn tL_auth_signIn3 = tL_auth_signIn2;
                                LoginActivity loginActivity = LoginActivity.this;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i6 = loginActivitySmsView3.currentType;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    loginActivitySmsView3.lastError = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        loginActivitySmsView3.nextPressed = false;
                                        loginActivity.showDoneButton(false, true);
                                        if ((i6 == 3 && ((i5 = loginActivitySmsView3.nextType) == 4 || i5 == 2 || i5 == 17 || i5 == 16)) || ((i6 == 2 && ((i4 = loginActivitySmsView3.nextType) == 4 || i4 == 3)) || (i6 == 4 && ((i3 = loginActivitySmsView3.nextType) == 2 || i3 == 17 || i3 == 16)))) {
                                            loginActivitySmsView3.createTimer();
                                        }
                                        if (i6 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView3, NotificationCenter.didReceiveSmsCode);
                                        } else if (i6 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView3, NotificationCenter.didReceiveSmsCode);
                                        } else if (i6 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView3, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(20));
                                        }
                                        loginActivitySmsView3.waitingForEvent = true;
                                        if (i6 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                loginActivitySmsView3.shakeWrongCode();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                loginActivitySmsView3.onBackPressed(true);
                                                loginActivity.setPage(0, true, null, true);
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i7 = 0;
                                            while (true) {
                                                CodeFieldContainer codeFieldContainer = loginActivitySmsView3.codeFieldContainer;
                                                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                                                if (i7 >= codeNumberFieldArr.length) {
                                                    codeFieldContainer.isFocusSuppressed = false;
                                                    codeNumberFieldArr[0].requestFocus();
                                                } else {
                                                    codeNumberFieldArr[i7].setText("");
                                                    i7++;
                                                }
                                            }
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda16(loginActivitySmsView3, tL_auth_signIn3, 1), 10);
                                        loginActivitySmsView3.destroyTimer();
                                        loginActivitySmsView3.destroyCodeTimer();
                                    }
                                    break;
                                } else {
                                    loginActivitySmsView3.nextPressed = false;
                                    loginActivity.showDoneButton(false, true);
                                    loginActivitySmsView3.destroyTimer();
                                    loginActivitySmsView3.destroyCodeTimer();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            loginActivity.currentTermsOfService = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", loginActivitySmsView3.requestPhone);
                                        bundle.putString("phoneHash", loginActivitySmsView3.phoneHash);
                                        bundle.putString("code", tL_auth_signIn3.phone_code);
                                        final int i8 = 0;
                                        loginActivitySmsView3.animateSuccess(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i8) {
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
                                        loginActivitySmsView3.animateSuccess(new LinkManager$$ExternalSyntheticLambda2(14, loginActivitySmsView3, tLObject2));
                                    }
                                }
                                if (i6 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                final LoginActivity.LoginActivitySmsView loginActivitySmsView4 = loginActivitySmsView2;
                                loginActivitySmsView4.nextPressed = false;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", loginActivitySmsView4.requestPhone);
                                        bundle2.putString("phoneHash", loginActivitySmsView4.phoneHash);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        final int i9 = 1;
                                        loginActivitySmsView4.animateSuccess(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i9) {
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
                });
                break;
        }
    }
}
