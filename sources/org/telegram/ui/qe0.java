package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f36724a = 0;
    public final ue0 f36725b;
    public final TLRPC.TL_error f36726c;
    public final Bundle d;
    public final TLObject e;

    public qe0(ue0 ue0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f36725b = ue0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f36726c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36724a) {
            case 0:
                ue0 ue0Var = this.f36725b;
                tg0 tg0Var = ue0Var.f38229a0;
                ue0Var.M = false;
                ue0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    ue0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ue0Var.T = tL_auth_sentCode;
                    tg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f36726c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ue0Var.c(true);
                            tg0Var.u1(0, true, null, true);
                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            tg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                ue0 ue0Var2 = this.f36725b;
                tg0 tg0Var2 = ue0Var2.f38229a0;
                ue0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f36726c;
                if (tL_error2 == null) {
                    tg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ue0Var2.c(true);
                                tg0Var2.u1(0, true, null, true);
                                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                tg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                tg0Var2.k1(false, true);
                return;
        }
    }

    public qe0(ue0 ue0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f36725b = ue0Var;
        this.f36726c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
