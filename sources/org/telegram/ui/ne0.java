package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ne0 implements Runnable {
    public final int f36488a = 0;
    public final re0 f36489b;
    public final TLRPC.TL_error f36490c;
    public final Bundle d;
    public final TLObject e;

    public ne0(re0 re0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f36489b = re0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f36490c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36488a) {
            case 0:
                re0 re0Var = this.f36489b;
                pg0 pg0Var = re0Var.U;
                re0Var.J = false;
                re0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    re0Var.P = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    re0Var.Q = tL_auth_sentCode;
                    pg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f36490c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            re0Var.c(true);
                            pg0Var.u1(0, true, null, true);
                            pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb = new StringBuilder();
                            b.i(R.string.ErrorOccurred, "\n", sb);
                            sb.append(tL_error.text);
                            pg0Var.l1(string, sb.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                re0 re0Var2 = this.f36489b;
                pg0 pg0Var2 = re0Var2.U;
                re0Var2.O = false;
                TLRPC.TL_error tL_error2 = this.f36490c;
                if (tL_error2 == null) {
                    pg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                re0Var2.c(true);
                                pg0Var2.u1(0, true, null, true);
                                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb2 = new StringBuilder();
                                b.i(R.string.ErrorOccurred, "\n", sb2);
                                sb2.append(tL_error2.text);
                                pg0Var2.l1(string2, sb2.toString());
                            }
                        } else {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                pg0Var2.k1(false, true);
                return;
        }
    }

    public ne0(re0 re0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f36489b = re0Var;
        this.f36490c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
