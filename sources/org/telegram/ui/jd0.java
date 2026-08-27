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

    public final int f39341a = 0;

    public final sd0 f39342b;

    public final TLRPC.TL_error f39343c;
    public final TLObject d;

    public final String f39344e;

    public jd0(sd0 sd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f39342b = sd0Var;
        this.f39343c = tL_error;
        this.f39344e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39341a) {
            case 0:
                final sd0 sd0Var = this.f39342b;
                od0 od0Var = sd0Var.f42580a;
                ig0 ig0Var = sd0Var.S;
                ig0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f39343c;
                String str = this.f39344e;
                if (tL_error == null) {
                    sd0Var.A = false;
                    ig0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", sd0Var.E);
                    bundle.putString("ephone", sd0Var.F);
                    bundle.putString("phoneFormated", sd0Var.H);
                    bundle.putString("phoneHash", sd0Var.I);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var.f39095l0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        sd0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        sd0Var.S.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        sd0Var.S.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        sd0Var.o(new lq(sd0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new hd0(sd0Var, str, 1), 10);
                } else {
                    sd0Var.A = false;
                    ig0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        kd0 kd0Var = sd0Var.O;
                        rd0 rd0Var = sd0Var.M;
                        try {
                            od0Var.performHapticFeedback(3, 2);
                            while (true) {
                                wr[] wrVarArr = od0Var.f43279f;
                                if (i10 < wrVarArr.length) {
                                    wrVarArr[i10].setText("");
                                    od0Var.f43279f[i10].i(1.0f);
                                    i10++;
                                } else {
                                    if (rd0Var.getCurrentView() == sd0Var.f42583e) {
                                        rd0Var.showNext();
                                        AndroidUtilities.updateViewVisibilityAnimated(sd0Var.h, false, 1.0f, true);
                                    }
                                    od0Var.f43279f[0].requestFocus();
                                    AndroidUtilities.shakeViewSpring(od0Var, 10.0f, new kd0(sd0Var, 3));
                                    sd0Var.removeCallbacks(kd0Var);
                                    sd0Var.postDelayed(kd0Var, 5000L);
                                    sd0Var.N = true;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        i10 = 0;
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        ig0Var.u1(0, true, null, true);
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (od0Var.f43279f != null) {
                        int i12 = 0;
                        while (true) {
                            wr[] wrVarArr2 = od0Var.f43279f;
                            if (i12 < wrVarArr2.length) {
                                wrVarArr2[i12].setText("");
                                i12++;
                            } else {
                                wrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    od0Var.f43278e = false;
                }
                sd0Var.B = null;
                break;
            default:
                final sd0 sd0Var2 = this.f39342b;
                sd0Var2.A = false;
                ig0 ig0Var2 = sd0Var2.S;
                ig0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f39343c;
                if (tL_error2 != null) {
                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.y4.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", sd0Var2.H);
                        bundle2.putString("phoneHash", sd0Var2.I);
                        bundle2.putString("code", this.f39344e);
                        final int i13 = 1;
                        sd0Var2.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        sd0Var2.S.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        sd0Var2.S.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                    }
                }
                break;
        }
    }

    public jd0(sd0 sd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f39342b = sd0Var;
        this.f39343c = tL_error;
        this.d = tLObject;
        this.f39344e = str;
    }
}
