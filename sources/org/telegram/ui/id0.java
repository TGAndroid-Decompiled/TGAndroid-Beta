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
public final class id0 implements Runnable {
    public final int f40113a = 0;
    public final qd0 f40114b;
    public final TLRPC.TL_error f40115c;
    public final TLObject d;
    public final String e;

    public id0(qd0 qd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f40114b = qd0Var;
        this.f40115c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40113a) {
            case 0:
                final qd0 qd0Var = this.f40114b;
                nd0 nd0Var = qd0Var.f42672a;
                ig0 ig0Var = qd0Var.W;
                ig0Var.p1(false, true);
                TLRPC.TL_error tL_error = this.f40115c;
                String str = this.e;
                if (tL_error == null) {
                    qd0Var.E = false;
                    ig0Var.A1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", qd0Var.I);
                    bundle.putString("ephone", qd0Var.J);
                    bundle.putString("phoneFormated", qd0Var.L);
                    bundle.putString("phoneHash", qd0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var.f40160q0 = tL_help_termsOfService;
                        }
                        qd0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        qd0Var.W.z1(5, true, bundle, false);
                                        return;
                                    default:
                                        qd0Var.W.z1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        qd0Var.n(new pq(qd0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new gd0(qd0Var, str, 1), 10);
                } else {
                    qd0Var.E = false;
                    ig0Var.A1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ig0Var.z1(0, true, null, true);
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        jd0 jd0Var = qd0Var.S;
                        pd0 pd0Var = qd0Var.Q;
                        try {
                            nd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            zr[] zrVarArr = nd0Var.f45772f;
                            if (i11 < zrVarArr.length) {
                                zrVarArr[i11].setText("");
                                nd0Var.f45772f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (pd0Var.getCurrentView() == qd0Var.e) {
                                    pd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(qd0Var.h, false, 1.0f, true);
                                }
                                nd0Var.f45772f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(nd0Var, 10.0f, new jd0(qd0Var, 3));
                                qd0Var.removeCallbacks(jd0Var);
                                qd0Var.postDelayed(jd0Var, 5000L);
                                qd0Var.R = true;
                            }
                        }
                    }
                    if (nd0Var.f45772f != null) {
                        int i12 = 0;
                        while (true) {
                            zr[] zrVarArr2 = nd0Var.f45772f;
                            if (i12 < zrVarArr2.length) {
                                zrVarArr2[i12].setText("");
                                i12++;
                            } else {
                                zrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    nd0Var.e = false;
                }
                qd0Var.F = null;
                return;
            default:
                final qd0 qd0Var2 = this.f40114b;
                qd0Var2.E = false;
                ig0 ig0Var2 = qd0Var2.W;
                ig0Var2.A1(false, true);
                TLRPC.TL_error tL_error2 = this.f40115c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.j0(password, true)) {
                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", qd0Var2.L);
                    bundle2.putString("phoneHash", qd0Var2.M);
                    bundle2.putString("code", this.e);
                    qd0Var2.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    qd0Var2.W.z1(5, true, bundle2, false);
                                    return;
                                default:
                                    qd0Var2.W.z1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public id0(qd0 qd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f40114b = qd0Var;
        this.f40115c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
