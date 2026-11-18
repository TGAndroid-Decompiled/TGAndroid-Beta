package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac0 implements Runnable {
    public final int f45530a = 0;
    public final dc0 f45531b;
    public final TLRPC.TL_error f45532c;
    public final Bundle d;
    public final TLObject f45533e;

    public ac0(dc0 dc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f45531b = dc0Var;
        this.f45533e = tLObject;
        this.d = bundle;
        this.f45532c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f45530a;
        TLObject tLObject = this.f45533e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f45532c;
        dc0 dc0Var = this.f45531b;
        switch (i7) {
            case 0:
                de0 de0Var = dc0Var.f46915b0;
                dc0Var.N = false;
                dc0Var.f46922w.invalidate();
                if (tLObject != null) {
                    dc0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    dc0Var.U = tL_auth_sentCode;
                    de0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            dc0Var.c(true);
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                            sb2.append(tL_error.text);
                            de0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                de0 de0Var2 = dc0Var.f46915b0;
                dc0Var.S = false;
                if (tL_error == null) {
                    de0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                dc0Var.c(true);
                                de0Var2.M1(0, true, null, true);
                                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.gd.M0(2131745876, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                                sb3.append(tL_error.text);
                                de0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                        }
                    }
                }
                de0Var2.C1(false, true);
                return;
        }
    }

    public ac0(dc0 dc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f45531b = dc0Var;
        this.f45532c = tL_error;
        this.d = bundle;
        this.f45533e = tLObject;
    }
}
