package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe0 implements Runnable {
    public final int f37316a = 0;
    public final je0 f37317b;
    public final TLRPC.TL_error f37318c;
    public final Bundle d;
    public final TLObject e;

    public fe0(je0 je0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f37317b = je0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f37318c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37316a) {
            case 0:
                je0 je0Var = this.f37317b;
                ig0 ig0Var = je0Var.f38540a0;
                je0Var.M = false;
                je0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    je0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    je0Var.T = tL_auth_sentCode;
                    ig0Var.k1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f37318c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            je0Var.c(true);
                            ig0Var.y1(0, true, null, true);
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            ig0Var.p1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                je0 je0Var2 = this.f37317b;
                ig0 ig0Var2 = je0Var2.f38540a0;
                je0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f37318c;
                if (tL_error2 == null) {
                    ig0Var2.k1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                je0Var2.c(true);
                                ig0Var2.y1(0, true, null, true);
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                ig0Var2.p1(string2, sb3.toString());
                            }
                        } else {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                ig0Var2.o1(false, true);
                return;
        }
    }

    public fe0(je0 je0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f37317b = je0Var;
        this.f37318c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
