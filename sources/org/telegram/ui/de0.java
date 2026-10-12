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
public final class de0 implements Runnable {
    public final int f35238a = 0;
    public final le0 f35239b;
    public final TLRPC.TL_error f35240c;
    public final TLObject d;
    public final String e;

    public de0(le0 le0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f35239b = le0Var;
        this.f35240c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35238a) {
            case 0:
                final le0 le0Var = this.f35239b;
                ie0 ie0Var = le0Var.f37930a;
                bh0 bh0Var = le0Var.W;
                bh0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f35240c;
                String str = this.e;
                if (tL_error == null) {
                    le0Var.E = false;
                    bh0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", le0Var.I);
                    bundle.putString("ephone", le0Var.J);
                    bundle.putString("phoneFormated", le0Var.L);
                    bundle.putString("phoneHash", le0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            bh0Var.f34562p0 = tL_help_termsOfService;
                        }
                        le0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        le0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        le0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        le0Var.o(new br(le0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new be0(le0Var, str, 1), 10);
                } else {
                    le0Var.E = false;
                    bh0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            bh0Var.u1(0, true, null, true);
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        ee0 ee0Var = le0Var.S;
                        ke0 ke0Var = le0Var.Q;
                        try {
                            ie0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            ks[] ksVarArr = ie0Var.f36949f;
                            if (i11 < ksVarArr.length) {
                                ksVarArr[i11].setText("");
                                ie0Var.f36949f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (ke0Var.getCurrentView() == le0Var.e) {
                                    ke0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(le0Var.h, false, 1.0f, true);
                                }
                                ie0Var.f36949f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ie0Var, 10.0f, new ee0(le0Var, 3));
                                le0Var.removeCallbacks(ee0Var);
                                le0Var.postDelayed(ee0Var, 5000L);
                                le0Var.R = true;
                            }
                        }
                    }
                    if (ie0Var.f36949f != null) {
                        int i12 = 0;
                        while (true) {
                            ks[] ksVarArr2 = ie0Var.f36949f;
                            if (i12 < ksVarArr2.length) {
                                ksVarArr2[i12].setText("");
                                i12++;
                            } else {
                                ksVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ie0Var.e = false;
                }
                le0Var.F = null;
                return;
            default:
                final le0 le0Var2 = this.f35239b;
                le0Var2.E = false;
                bh0 bh0Var2 = le0Var2.W;
                bh0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f35240c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", le0Var2.L);
                    bundle2.putString("phoneHash", le0Var2.M);
                    bundle2.putString("code", this.e);
                    le0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    le0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    le0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public de0(le0 le0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f35239b = le0Var;
        this.f35240c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
