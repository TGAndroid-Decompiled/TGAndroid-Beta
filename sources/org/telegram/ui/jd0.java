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
public final class jd0 implements Runnable {
    public final int f38529a = 0;
    public final rd0 f38530b;
    public final TLRPC.TL_error f38531c;
    public final TLObject d;
    public final String e;

    public jd0(rd0 rd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f38530b = rd0Var;
        this.f38531c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38529a) {
            case 0:
                final rd0 rd0Var = this.f38530b;
                od0 od0Var = rd0Var.f41094a;
                ig0 ig0Var = rd0Var.W;
                ig0Var.o1(false, true);
                TLRPC.TL_error tL_error = this.f38531c;
                String str = this.e;
                if (tL_error == null) {
                    rd0Var.E = false;
                    ig0Var.z1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", rd0Var.I);
                    bundle.putString("ephone", rd0Var.J);
                    bundle.putString("phoneFormated", rd0Var.L);
                    bundle.putString("phoneHash", rd0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var.f38211p0 = tL_help_termsOfService;
                        }
                        rd0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        rd0Var.W.y1(5, true, bundle, false);
                                        return;
                                    default:
                                        rd0Var.W.y1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        rd0Var.n(new lq(rd0Var, tLObject, bundle, 28));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new hd0(rd0Var, str, 1), 10);
                } else {
                    rd0Var.E = false;
                    ig0Var.z1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ig0Var.y1(0, true, null, true);
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        kd0 kd0Var = rd0Var.S;
                        qd0 qd0Var = rd0Var.Q;
                        try {
                            od0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            vr[] vrVarArr = od0Var.f41793f;
                            if (i11 < vrVarArr.length) {
                                vrVarArr[i11].setText("");
                                od0Var.f41793f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (qd0Var.getCurrentView() == rd0Var.e) {
                                    qd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(rd0Var.h, false, 1.0f, true);
                                }
                                od0Var.f41793f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(od0Var, 10.0f, new kd0(rd0Var, 3));
                                rd0Var.removeCallbacks(kd0Var);
                                rd0Var.postDelayed(kd0Var, 5000L);
                                rd0Var.R = true;
                            }
                        }
                    }
                    if (od0Var.f41793f != null) {
                        int i12 = 0;
                        while (true) {
                            vr[] vrVarArr2 = od0Var.f41793f;
                            if (i12 < vrVarArr2.length) {
                                vrVarArr2[i12].setText("");
                                i12++;
                            } else {
                                vrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    od0Var.e = false;
                }
                rd0Var.F = null;
                return;
            default:
                final rd0 rd0Var2 = this.f38530b;
                rd0Var2.E = false;
                ig0 ig0Var2 = rd0Var2.W;
                ig0Var2.z1(false, true);
                TLRPC.TL_error tL_error2 = this.f38531c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.f5.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", rd0Var2.L);
                    bundle2.putString("phoneHash", rd0Var2.M);
                    bundle2.putString("code", this.e);
                    rd0Var2.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    rd0Var2.W.y1(5, true, bundle2, false);
                                    return;
                                default:
                                    rd0Var2.W.y1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public jd0(rd0 rd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f38530b = rd0Var;
        this.f38531c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
