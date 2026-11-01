package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ec0 implements RequestDelegate {
    public final int f36792a;
    public final gf0 f36793b;
    public final TLRPC.auth_SentCode f36794c;
    public final Bundle d;
    public final boolean e;

    public ec0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, gf0 gf0Var, boolean z10) {
        this.f36792a = i10;
        this.f36793b = gf0Var;
        this.f36794c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36792a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final gf0 gf0Var = this.f36793b;
                final TLRPC.auth_SentCode auth_sentcode = this.f36794c;
                final Bundle bundle = this.d;
                if (z10) {
                    gf0Var.t1(false, true);
                    gf0Var.f37490p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    gf0Var.p1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    gf0Var.p1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.f8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                gf0Var.B1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final gf0 gf0Var2 = this.f36793b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f36794c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    gf0Var2.t1(false, true);
                    gf0Var2.f37490p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    gf0Var2.p1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    gf0Var2.p1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.f8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                gf0Var2.B1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
