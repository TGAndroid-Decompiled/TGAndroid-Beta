package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ec0 implements Runnable {
    public final int f45229a = 0;
    public final hc0 f45230b;
    public final TLRPC.TL_error f45231c;
    public final Bundle d;
    public final TLObject f45232e;

    public ec0(hc0 hc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f45230b = hc0Var;
        this.f45232e = tLObject;
        this.d = bundle;
        this.f45231c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f45229a;
        TLObject tLObject = this.f45232e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f45231c;
        hc0 hc0Var = this.f45230b;
        switch (i7) {
            case 0:
                fe0 fe0Var = hc0Var.f46307a0;
                hc0Var.M = false;
                hc0Var.f46315w.invalidate();
                if (tLObject != null) {
                    hc0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    hc0Var.T = tL_auth_sentCode;
                    fe0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            hc0Var.c(true);
                            fe0Var.M1(0, true, null, true);
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.id.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            fe0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                fe0 fe0Var2 = hc0Var.f46307a0;
                hc0Var.R = false;
                if (tL_error == null) {
                    fe0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                hc0Var.c(true);
                                fe0Var2.M1(0, true, null, true);
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.id.M0(2131746071, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                                sb3.append(tL_error.text);
                                fe0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                        }
                    }
                }
                fe0Var2.C1(false, true);
                return;
        }
    }

    public ec0(hc0 hc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f45230b = hc0Var;
        this.f45231c = tL_error;
        this.d = bundle;
        this.f45232e = tLObject;
    }
}
