package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class fe0 implements Runnable {

    public final int f38106a = 0;

    public final je0 f38107b;

    public final TLRPC.TL_error f38108c;
    public final Bundle d;

    public final TLObject f38109e;

    public fe0(je0 je0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f38107b = je0Var;
        this.f38109e = tLObject;
        this.d = bundle;
        this.f38108c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38106a) {
            case 0:
                je0 je0Var = this.f38107b;
                ig0 ig0Var = je0Var.T;
                je0Var.I = false;
                je0Var.v.invalidate();
                TLObject tLObject = this.f38109e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    je0Var.O = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    je0Var.P = tL_auth_sentCode;
                    ig0Var.g1(bundle, tL_auth_sentCode, true);
                    break;
                } else {
                    TLRPC.TL_error tL_error = this.f38108c;
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (str.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            je0Var.c(true);
                            ig0Var.u1(0, true, null, true);
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            ig0Var.l1(string, sb2.toString());
                        }
                        break;
                    }
                }
                break;
            default:
                je0 je0Var2 = this.f38107b;
                ig0 ig0Var2 = je0Var2.T;
                je0Var2.N = false;
                TLRPC.TL_error tL_error2 = this.f38108c;
                if (tL_error2 == null) {
                    ig0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.f38109e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            je0Var2.c(true);
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb3);
                            sb3.append(tL_error2.text);
                            ig0Var2.l1(string2, sb3.toString());
                        }
                    }
                }
                ig0Var2.k1(false, true);
                break;
        }
    }

    public fe0(je0 je0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f38107b = je0Var;
        this.f38108c = tL_error;
        this.d = bundle;
        this.f38109e = tLObject;
    }
}
