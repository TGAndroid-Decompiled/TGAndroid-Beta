package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id0 implements Runnable {
    public final int f38241a = 0;
    public final ld0 f38242b;
    public final TLRPC.TL_error f38243c;
    public final Bundle d;
    public final TLObject e;

    public id0(ld0 ld0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f38242b = ld0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f38243c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f38241a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f38243c;
        ld0 ld0Var = this.f38242b;
        switch (i10) {
            case 0:
                hf0 hf0Var = ld0Var.f39177a0;
                ld0Var.M = false;
                ld0Var.f39184w.invalidate();
                if (tLObject != null) {
                    ld0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ld0Var.T = tL_auth_sentCode;
                    hf0Var.o1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ld0Var.c(true);
                            hf0Var.C1(0, true, null, true);
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            hf0Var.t1(L0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                hf0 hf0Var2 = ld0Var.f39177a0;
                ld0Var.R = false;
                if (tL_error == null) {
                    hf0Var2.o1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                ld0Var.c(true);
                                hf0Var2.C1(0, true, null, true);
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, null));
                            } else if (tL_error.code != -1000) {
                                String L02 = org.telegram.messenger.cd.L0(2131746088, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                                sb3.append(tL_error.text);
                                hf0Var2.t1(L02, sb3.toString());
                            }
                        } else {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, null));
                        }
                    }
                }
                hf0Var2.s1(false, true);
                return;
        }
    }

    public id0(ld0 ld0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f38242b = ld0Var;
        this.f38243c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
