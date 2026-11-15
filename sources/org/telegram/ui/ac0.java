package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac0 implements Runnable {
    public final int f44990a = 0;
    public final dc0 f44991b;
    public final TLRPC.TL_error f44992c;
    public final Bundle d;
    public final TLObject f44993e;

    public ac0(dc0 dc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f44991b = dc0Var;
        this.f44993e = tLObject;
        this.d = bundle;
        this.f44992c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f44990a;
        TLObject tLObject = this.f44993e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f44992c;
        dc0 dc0Var = this.f44991b;
        switch (i7) {
            case 0:
                ce0 ce0Var = dc0Var.f46329b0;
                dc0Var.N = false;
                dc0Var.f46336w.invalidate();
                if (tLObject != null) {
                    dc0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    dc0Var.U = tL_auth_sentCode;
                    ce0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            dc0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            ce0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                ce0 ce0Var2 = dc0Var.f46329b0;
                dc0Var.S = false;
                if (tL_error == null) {
                    ce0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                dc0Var.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.hd.M0(2131746071, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.y0.r(null, 2131751105, sb3, "\n");
                                sb3.append(tL_error.text);
                                ce0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                        }
                    }
                }
                ce0Var2.C1(false, true);
                return;
        }
    }

    public ac0(dc0 dc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f44991b = dc0Var;
        this.f44992c = tL_error;
        this.d = bundle;
        this.f44993e = tLObject;
    }
}
