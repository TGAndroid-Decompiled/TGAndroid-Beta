package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee0 implements Runnable {
    public final int f36891a = 0;
    public final ie0 f36892b;
    public final TLRPC.TL_error f36893c;
    public final Bundle d;
    public final TLObject e;

    public ee0(ie0 ie0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f36892b = ie0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f36893c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36891a) {
            case 0:
                ie0 ie0Var = this.f36892b;
                hg0 hg0Var = ie0Var.f38266a0;
                ie0Var.M = false;
                ie0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    ie0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ie0Var.T = tL_auth_sentCode;
                    hg0Var.k1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f36893c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ie0Var.c(true);
                            hg0Var.y1(0, true, null, true);
                            hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            hg0Var.p1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                ie0 ie0Var2 = this.f36892b;
                hg0 hg0Var2 = ie0Var2.f38266a0;
                ie0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f36893c;
                if (tL_error2 == null) {
                    hg0Var2.k1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ie0Var2.c(true);
                                hg0Var2.y1(0, true, null, true);
                                hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                hg0Var2.p1(string2, sb3.toString());
                            }
                        } else {
                            hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                hg0Var2.o1(false, true);
                return;
        }
    }

    public ee0(ie0 ie0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f36892b = ie0Var;
        this.f36893c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
