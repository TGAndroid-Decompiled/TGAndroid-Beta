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
public final class be0 implements Runnable {
    public final int f34305a = 0;
    public final je0 f34306b;
    public final TLRPC.TL_error f34307c;
    public final TLObject d;
    public final String e;

    public be0(je0 je0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f34306b = je0Var;
        this.f34307c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34305a) {
            case 0:
                final je0 je0Var = this.f34306b;
                ge0 ge0Var = je0Var.f37030a;
                ah0 ah0Var = je0Var.W;
                ah0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f34307c;
                String str = this.e;
                if (tL_error == null) {
                    je0Var.E = false;
                    ah0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", je0Var.I);
                    bundle.putString("ephone", je0Var.J);
                    bundle.putString("phoneFormated", je0Var.L);
                    bundle.putString("phoneHash", je0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ah0Var.f33924p0 = tL_help_termsOfService;
                        }
                        je0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        je0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        je0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        je0Var.o(new br(je0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zd0(je0Var, str, 1), 10);
                } else {
                    je0Var.E = false;
                    ah0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ah0Var.u1(0, true, null, true);
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        ce0 ce0Var = je0Var.S;
                        ie0 ie0Var = je0Var.Q;
                        try {
                            ge0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            ks[] ksVarArr = ge0Var.f36645f;
                            if (i11 < ksVarArr.length) {
                                ksVarArr[i11].setText("");
                                ge0Var.f36645f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (ie0Var.getCurrentView() == je0Var.e) {
                                    ie0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(je0Var.h, false, 1.0f, true);
                                }
                                ge0Var.f36645f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ge0Var, 10.0f, new ce0(je0Var, 3));
                                je0Var.removeCallbacks(ce0Var);
                                je0Var.postDelayed(ce0Var, 5000L);
                                je0Var.R = true;
                            }
                        }
                    }
                    if (ge0Var.f36645f != null) {
                        int i12 = 0;
                        while (true) {
                            ks[] ksVarArr2 = ge0Var.f36645f;
                            if (i12 < ksVarArr2.length) {
                                ksVarArr2[i12].setText("");
                                i12++;
                            } else {
                                ksVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ge0Var.e = false;
                }
                je0Var.F = null;
                return;
            default:
                final je0 je0Var2 = this.f34306b;
                je0Var2.E = false;
                ah0 ah0Var2 = je0Var2.W;
                ah0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f34307c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", je0Var2.L);
                    bundle2.putString("phoneHash", je0Var2.M);
                    bundle2.putString("code", this.e);
                    je0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    je0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    je0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public be0(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f34306b = je0Var;
        this.f34307c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
