package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId = 0;
    public final LoginActivity.LoginActivityPhraseView f$0;
    public final TLObject f$1;
    public final Bundle f$2;
    public final TLRPC.TL_error f$3;

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f$0 = loginActivityPhraseView;
        this.f$1 = tLObject;
        this.f$2 = bundle;
        this.f$3 = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                loginActivityPhraseView.isResendingCode = false;
                loginActivityPhraseView.timeText.invalidate();
                LoginActivity loginActivity = LoginActivity.this;
                TLObject tLObject = this.f$1;
                if (tLObject != null) {
                    Bundle bundle = this.f$2;
                    loginActivityPhraseView.nextCodeParams = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    loginActivityPhraseView.nextCodeAuth = tL_auth_sentCode;
                    loginActivity.fillNextCodeParams(bundle, tL_auth_sentCode, true);
                    break;
                } else {
                    TLRPC.TL_error tL_error = this.f$3;
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (str.contains("PHONE_NUMBER_INVALID")) {
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivityPhraseView.onBackPressed(true);
                            loginActivity.setPage(0, true, null, true);
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb = new StringBuilder();
                            zzlf.m(R.string.ErrorOccurred, "\n", sb);
                            sb.append(tL_error.text);
                            loginActivity.needShowAlert(string, sb.toString());
                        }
                        break;
                    }
                }
                break;
            default:
                LoginActivity.LoginActivityPhraseView loginActivityPhraseView2 = this.f$0;
                loginActivityPhraseView2.nextPressed = false;
                LoginActivity loginActivity2 = LoginActivity.this;
                TLRPC.TL_error tL_error2 = this.f$3;
                if (tL_error2 == null) {
                    loginActivity2.fillNextCodeParams(this.f$2, (TLRPC.TL_auth_sentCode) this.f$1, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivityPhraseView2.onBackPressed(true);
                            loginActivity2.setPage(0, true, null, true);
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            zzlf.m(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error2.text);
                            loginActivity2.needShowAlert(string2, sb2.toString());
                        }
                    }
                }
                loginActivity2.needHideProgress(false, true);
                break;
        }
    }

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda13(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f$0 = loginActivityPhraseView;
        this.f$3 = tL_error;
        this.f$2 = bundle;
        this.f$1 = tLObject;
    }
}
