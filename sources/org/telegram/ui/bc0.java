package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements Runnable {
    public final int f45814a = 0;
    public final ec0 f45815b;
    public final TLRPC.TL_error f45816c;
    public final Bundle d;
    public final TLObject f45817e;

    public bc0(ec0 ec0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f45815b = ec0Var;
        this.f45817e = tLObject;
        this.d = bundle;
        this.f45816c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f45814a;
        TLObject tLObject = this.f45817e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f45816c;
        ec0 ec0Var = this.f45815b;
        switch (i7) {
            case 0:
                de0 de0Var = ec0Var.f47204b0;
                ec0Var.N = false;
                ec0Var.f47211w.invalidate();
                if (tLObject != null) {
                    ec0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ec0Var.U = tL_auth_sentCode;
                    de0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ec0Var.c(true);
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                            sb2.append(tL_error.text);
                            de0Var.D1(N0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                de0 de0Var2 = ec0Var.f47204b0;
                ec0Var.S = false;
                if (tL_error == null) {
                    de0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                ec0Var.c(true);
                                de0Var2.M1(0, true, null, true);
                                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, null));
                            } else if (tL_error.code != -1000) {
                                String N02 = org.telegram.messenger.hd.N0(2131745875, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                                sb3.append(tL_error.text);
                                de0Var2.D1(N02, sb3.toString());
                            }
                        } else {
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, null));
                        }
                    }
                }
                de0Var2.C1(false, true);
                return;
        }
    }

    public bc0(ec0 ec0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f45815b = ec0Var;
        this.f45816c = tL_error;
        this.d = bundle;
        this.f45817e = tLObject;
    }
}
