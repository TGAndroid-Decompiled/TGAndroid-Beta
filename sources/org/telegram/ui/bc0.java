package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements Runnable {
    public final int f45830a = 0;
    public final ec0 f45831b;
    public final TLRPC.TL_error f45832c;
    public final Bundle d;
    public final TLObject f45833e;

    public bc0(ec0 ec0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f45831b = ec0Var;
        this.f45833e = tLObject;
        this.d = bundle;
        this.f45832c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f45830a;
        TLObject tLObject = this.f45833e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f45832c;
        ec0 ec0Var = this.f45831b;
        switch (i7) {
            case 0:
                ee0 ee0Var = ec0Var.f47162b0;
                ec0Var.N = false;
                ec0Var.f47169w.invalidate();
                if (tLObject != null) {
                    ec0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ec0Var.U = tL_auth_sentCode;
                    ee0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ec0Var.c(true);
                            ee0Var.M1(0, true, null, true);
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                            sb2.append(tL_error.text);
                            ee0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                ee0 ee0Var2 = ec0Var.f47162b0;
                ec0Var.S = false;
                if (tL_error == null) {
                    ee0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                ec0Var.c(true);
                                ee0Var2.M1(0, true, null, true);
                                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.gd.M0(2131745876, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                                sb3.append(tL_error.text);
                                ee0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                        }
                    }
                }
                ee0Var2.C1(false, true);
                return;
        }
    }

    public bc0(ec0 ec0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f45831b = ec0Var;
        this.f45832c = tL_error;
        this.d = bundle;
        this.f45833e = tLObject;
    }
}
