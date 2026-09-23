package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 implements Runnable {
    public final int f35851a = 0;
    public final se0 f35852b;
    public final TLRPC.TL_error f35853c;
    public final Bundle d;
    public final TLObject e;

    public oe0(se0 se0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f35852b = se0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f35853c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35851a) {
            case 0:
                se0 se0Var = this.f35852b;
                rg0 rg0Var = se0Var.f37253a0;
                se0Var.M = false;
                se0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    se0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    se0Var.T = tL_auth_sentCode;
                    rg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f35853c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            se0Var.c(true);
                            rg0Var.u1(0, true, null, true);
                            rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.ul.m(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            rg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                se0 se0Var2 = this.f35852b;
                rg0 rg0Var2 = se0Var2.f37253a0;
                se0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f35853c;
                if (tL_error2 == null) {
                    rg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                se0Var2.c(true);
                                rg0Var2.u1(0, true, null, true);
                                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.ul.m(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                rg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                rg0Var2.k1(false, true);
                return;
        }
    }

    public oe0(se0 se0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f35852b = se0Var;
        this.f35853c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
