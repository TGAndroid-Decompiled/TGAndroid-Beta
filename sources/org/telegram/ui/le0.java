package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class le0 implements Runnable {
    public final int f36069a = 0;
    public final pe0 f36070b;
    public final TLRPC.TL_error f36071c;
    public final Bundle d;
    public final TLObject e;

    public le0(pe0 pe0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f36070b = pe0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f36071c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36069a) {
            case 0:
                pe0 pe0Var = this.f36070b;
                ng0 ng0Var = pe0Var.U;
                pe0Var.J = false;
                pe0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    pe0Var.P = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    pe0Var.Q = tL_auth_sentCode;
                    ng0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f36071c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            pe0Var.c(true);
                            ng0Var.u1(0, true, null, true);
                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb = new StringBuilder();
                            b.i(R.string.ErrorOccurred, "\n", sb);
                            sb.append(tL_error.text);
                            ng0Var.l1(string, sb.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                pe0 pe0Var2 = this.f36070b;
                ng0 ng0Var2 = pe0Var2.U;
                pe0Var2.O = false;
                TLRPC.TL_error tL_error2 = this.f36071c;
                if (tL_error2 == null) {
                    ng0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                pe0Var2.c(true);
                                ng0Var2.u1(0, true, null, true);
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb2 = new StringBuilder();
                                b.i(R.string.ErrorOccurred, "\n", sb2);
                                sb2.append(tL_error2.text);
                                ng0Var2.l1(string2, sb2.toString());
                            }
                        } else {
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                ng0Var2.k1(false, true);
                return;
        }
    }

    public le0(pe0 pe0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f36070b = pe0Var;
        this.f36071c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
