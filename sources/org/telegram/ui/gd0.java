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
public final class gd0 implements Runnable {
    public final int f39615a = 0;
    public final od0 f39616b;
    public final TLRPC.TL_error f39617c;
    public final TLObject d;
    public final String e;

    public gd0(od0 od0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f39616b = od0Var;
        this.f39617c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39615a) {
            case 0:
                final od0 od0Var = this.f39616b;
                ld0 ld0Var = od0Var.f42154a;
                gg0 gg0Var = od0Var.W;
                gg0Var.p1(false, true);
                TLRPC.TL_error tL_error = this.f39617c;
                String str = this.e;
                if (tL_error == null) {
                    od0Var.E = false;
                    gg0Var.A1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", od0Var.I);
                    bundle.putString("ephone", od0Var.J);
                    bundle.putString("phoneFormated", od0Var.L);
                    bundle.putString("phoneHash", od0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            gg0Var.f39670p0 = tL_help_termsOfService;
                        }
                        od0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        od0Var.W.z1(5, true, bundle, false);
                                        return;
                                    default:
                                        od0Var.W.z1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        od0Var.n(new nq(od0Var, tLObject, bundle, 28));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ed0(od0Var, str, 1), 10);
                } else {
                    od0Var.E = false;
                    gg0Var.A1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            gg0Var.z1(0, true, null, true);
                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        hd0 hd0Var = od0Var.S;
                        nd0 nd0Var = od0Var.Q;
                        try {
                            ld0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            xr[] xrVarArr = ld0Var.f44897f;
                            if (i11 < xrVarArr.length) {
                                xrVarArr[i11].setText("");
                                ld0Var.f44897f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (nd0Var.getCurrentView() == od0Var.e) {
                                    nd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(od0Var.h, false, 1.0f, true);
                                }
                                ld0Var.f44897f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ld0Var, 10.0f, new hd0(od0Var, 3));
                                od0Var.removeCallbacks(hd0Var);
                                od0Var.postDelayed(hd0Var, 5000L);
                                od0Var.R = true;
                            }
                        }
                    }
                    if (ld0Var.f44897f != null) {
                        int i12 = 0;
                        while (true) {
                            xr[] xrVarArr2 = ld0Var.f44897f;
                            if (i12 < xrVarArr2.length) {
                                xrVarArr2[i12].setText("");
                                i12++;
                            } else {
                                xrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ld0Var.e = false;
                }
                od0Var.F = null;
                return;
            default:
                final od0 od0Var2 = this.f39616b;
                od0Var2.E = false;
                gg0 gg0Var2 = od0Var2.W;
                gg0Var2.A1(false, true);
                TLRPC.TL_error tL_error2 = this.f39617c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.j0(password, true)) {
                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", od0Var2.L);
                    bundle2.putString("phoneHash", od0Var2.M);
                    bundle2.putString("code", this.e);
                    od0Var2.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    od0Var2.W.z1(5, true, bundle2, false);
                                    return;
                                default:
                                    od0Var2.W.z1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public gd0(od0 od0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f39616b = od0Var;
        this.f39617c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
