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
public final class ae0 implements Runnable {
    public final int f32062a = 0;
    public final ie0 f32063b;
    public final TLRPC.TL_error f32064c;
    public final TLObject d;
    public final String e;

    public ae0(ie0 ie0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f32063b = ie0Var;
        this.f32064c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f32062a) {
            case 0:
                final ie0 ie0Var = this.f32063b;
                fe0 fe0Var = ie0Var.f34559a;
                yg0 yg0Var = ie0Var.W;
                yg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f32064c;
                String str = this.e;
                if (tL_error == null) {
                    ie0Var.E = false;
                    yg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ie0Var.I);
                    bundle.putString("ephone", ie0Var.J);
                    bundle.putString("phoneFormated", ie0Var.L);
                    bundle.putString("phoneHash", ie0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            yg0Var.f39948p0 = tL_help_termsOfService;
                        }
                        ie0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ie0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        ie0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ie0Var.o(new vq(ie0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yd0(ie0Var, str, 1), 10);
                } else {
                    ie0Var.E = false;
                    yg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            yg0Var.u1(0, true, null, true);
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            yg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        be0 be0Var = ie0Var.S;
                        he0 he0Var = ie0Var.Q;
                        try {
                            fe0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            gs[] gsVarArr = fe0Var.f33145f;
                            if (i11 < gsVarArr.length) {
                                gsVarArr[i11].setText("");
                                fe0Var.f33145f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (he0Var.getCurrentView() == ie0Var.e) {
                                    he0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ie0Var.h, false, 1.0f, true);
                                }
                                fe0Var.f33145f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(fe0Var, 10.0f, new be0(ie0Var, 3));
                                ie0Var.removeCallbacks(be0Var);
                                ie0Var.postDelayed(be0Var, 5000L);
                                ie0Var.R = true;
                            }
                        }
                    }
                    if (fe0Var.f33145f != null) {
                        int i12 = 0;
                        while (true) {
                            gs[] gsVarArr2 = fe0Var.f33145f;
                            if (i12 < gsVarArr2.length) {
                                gsVarArr2[i12].setText("");
                                i12++;
                            } else {
                                gsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    fe0Var.e = false;
                }
                ie0Var.F = null;
                return;
            default:
                final ie0 ie0Var2 = this.f32063b;
                ie0Var2.E = false;
                yg0 yg0Var2 = ie0Var2.W;
                yg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f32064c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.d5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ie0Var2.L);
                    bundle2.putString("phoneHash", ie0Var2.M);
                    bundle2.putString("code", this.e);
                    ie0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ie0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    ie0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public ae0(ie0 ie0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f32063b = ie0Var;
        this.f32064c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
