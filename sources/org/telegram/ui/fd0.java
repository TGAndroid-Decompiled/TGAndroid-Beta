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
public final class fd0 implements Runnable {
    public final int f36876a = 0;
    public final od0 f36877b;
    public final TLRPC.TL_error f36878c;
    public final TLObject d;
    public final String e;

    public fd0(od0 od0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f36877b = od0Var;
        this.f36878c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36876a) {
            case 0:
                final od0 od0Var = this.f36877b;
                kd0 kd0Var = od0Var.f39755a;
                eg0 eg0Var = od0Var.W;
                eg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f36878c;
                String str = this.e;
                if (tL_error == null) {
                    od0Var.E = false;
                    eg0Var.v1(false, true);
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
                            eg0Var.f36508p0 = tL_help_termsOfService;
                        }
                        od0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        od0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        od0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        od0Var.o(new lq(od0Var, tLObject, bundle, 27));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new dd0(od0Var, str, 1), 10);
                } else {
                    od0Var.E = false;
                    eg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            eg0Var.u1(0, true, null, true);
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        gd0 gd0Var = od0Var.S;
                        nd0 nd0Var = od0Var.Q;
                        try {
                            kd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            vr[] vrVarArr = kd0Var.f41477f;
                            if (i11 < vrVarArr.length) {
                                vrVarArr[i11].setText("");
                                kd0Var.f41477f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (nd0Var.getCurrentView() == od0Var.e) {
                                    nd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(od0Var.h, false, 1.0f, true);
                                }
                                kd0Var.f41477f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(kd0Var, 10.0f, new gd0(od0Var, 3));
                                od0Var.removeCallbacks(gd0Var);
                                od0Var.postDelayed(gd0Var, 5000L);
                                od0Var.R = true;
                            }
                        }
                    }
                    if (kd0Var.f41477f != null) {
                        int i12 = 0;
                        while (true) {
                            vr[] vrVarArr2 = kd0Var.f41477f;
                            if (i12 < vrVarArr2.length) {
                                vrVarArr2[i12].setText("");
                                i12++;
                            } else {
                                vrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    kd0Var.e = false;
                }
                od0Var.F = null;
                return;
            default:
                final od0 od0Var2 = this.f36877b;
                od0Var2.E = false;
                eg0 eg0Var2 = od0Var2.W;
                eg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f36878c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.f5.w0(eg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", od0Var2.L);
                    bundle2.putString("phoneHash", od0Var2.M);
                    bundle2.putString("code", this.e);
                    od0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    od0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    od0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public fd0(od0 od0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f36877b = od0Var;
        this.f36878c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
