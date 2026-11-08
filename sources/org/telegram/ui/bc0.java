package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements Runnable {
    public final int f44248a = 0;
    public final ec0 f44249b;
    public final TLRPC.TL_error f44250c;
    public final Bundle d;
    public final TLObject f44251e;

    public bc0(ec0 ec0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f44249b = ec0Var;
        this.f44251e = tLObject;
        this.d = bundle;
        this.f44250c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f44248a;
        TLObject tLObject = this.f44251e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f44250c;
        ec0 ec0Var = this.f44249b;
        switch (i7) {
            case 0:
                ce0 ce0Var = ec0Var.f45263a0;
                ec0Var.M = false;
                ec0Var.f45271w.invalidate();
                if (tLObject != null) {
                    ec0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ec0Var.T = tL_auth_sentCode;
                    ce0Var.y1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ec0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.id.M0(2131746074, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            ce0Var.D1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                ce0 ce0Var2 = ec0Var.f45263a0;
                ec0Var.R = false;
                if (tL_error == null) {
                    ce0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                ec0Var.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.id.M0(2131746074, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                                sb3.append(tL_error.text);
                                ce0Var2.D1(M02, sb3.toString());
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, null));
                        }
                    }
                }
                ce0Var2.C1(false, true);
                return;
        }
    }

    public bc0(ec0 ec0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f44249b = ec0Var;
        this.f44250c = tL_error;
        this.d = bundle;
        this.f44251e = tLObject;
    }
}
