package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dc0 implements Runnable {
    public final int f44910a = 0;
    public final gc0 f44911b;
    public final TLRPC.TL_error f44912c;
    public final Bundle d;
    public final TLObject f44913e;

    public dc0(gc0 gc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f44911b = gc0Var;
        this.f44913e = tLObject;
        this.d = bundle;
        this.f44912c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f44910a;
        TLObject tLObject = this.f44913e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f44912c;
        gc0 gc0Var = this.f44911b;
        switch (i7) {
            case 0:
                ee0 ee0Var = gc0Var.f45963a0;
                gc0Var.M = false;
                gc0Var.f45971w.invalidate();
                if (tLObject != null) {
                    gc0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    gc0Var.T = tL_auth_sentCode;
                    ee0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            gc0Var.c(true);
                            ee0Var.M1(0, true, null, true);
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.id.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            ee0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                ee0 ee0Var2 = gc0Var.f45963a0;
                gc0Var.R = false;
                if (tL_error == null) {
                    ee0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                gc0Var.c(true);
                                ee0Var2.M1(0, true, null, true);
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.id.M0(2131746071, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                                sb3.append(tL_error.text);
                                ee0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                        }
                    }
                }
                ee0Var2.C1(false, true);
                return;
        }
    }

    public dc0(gc0 gc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f44911b = gc0Var;
        this.f44912c = tL_error;
        this.d = bundle;
        this.f44913e = tLObject;
    }
}
