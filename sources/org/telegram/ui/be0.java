package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be0 implements Runnable {
    public final int f35643a = 0;
    public final fe0 f35644b;
    public final TLRPC.TL_error f35645c;
    public final Bundle d;
    public final TLObject e;

    public be0(fe0 fe0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f35644b = fe0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f35645c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35643a) {
            case 0:
                fe0 fe0Var = this.f35644b;
                eg0 eg0Var = fe0Var.f36888a0;
                fe0Var.M = false;
                fe0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    fe0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    fe0Var.T = tL_auth_sentCode;
                    eg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f35645c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            fe0Var.c(true);
                            eg0Var.u1(0, true, null, true);
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            eg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                fe0 fe0Var2 = this.f35644b;
                eg0 eg0Var2 = fe0Var2.f36888a0;
                fe0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f35645c;
                if (tL_error2 == null) {
                    eg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                fe0Var2.c(true);
                                eg0Var2.u1(0, true, null, true);
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                eg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                eg0Var2.k1(false, true);
                return;
        }
    }

    public be0(fe0 fe0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f35644b = fe0Var;
        this.f35645c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
