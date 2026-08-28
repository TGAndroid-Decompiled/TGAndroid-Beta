package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce0 implements Runnable {
    public final int f37181a = 0;
    public final ge0 f37182b;
    public final TLRPC.TL_error f37183c;
    public final Bundle d;
    public final TLObject f37184e;

    public ce0(ge0 ge0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f37182b = ge0Var;
        this.f37184e = tLObject;
        this.d = bundle;
        this.f37183c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37181a) {
            case 0:
                ge0 ge0Var = this.f37182b;
                fg0 fg0Var = ge0Var.T;
                ge0Var.I = false;
                ge0Var.v.invalidate();
                TLObject tLObject = this.f37184e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    ge0Var.O = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ge0Var.P = tL_auth_sentCode;
                    fg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f37183c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ge0Var.c(true);
                            fg0Var.u1(0, true, null, true);
                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            fg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                ge0 ge0Var2 = this.f37182b;
                fg0 fg0Var2 = ge0Var2.T;
                ge0Var2.N = false;
                TLRPC.TL_error tL_error2 = this.f37183c;
                if (tL_error2 == null) {
                    fg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.f37184e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ge0Var2.c(true);
                                fg0Var2.u1(0, true, null, true);
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                fg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                fg0Var2.k1(false, true);
                return;
        }
    }

    public ce0(ge0 ge0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f37182b = ge0Var;
        this.f37183c = tL_error;
        this.d = bundle;
        this.f37184e = tLObject;
    }
}
