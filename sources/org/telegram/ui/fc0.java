package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc0 implements RequestDelegate {
    public final int f37225a;
    public final hf0 f37226b;
    public final TLRPC.auth_SentCode f37227c;
    public final Bundle d;
    public final boolean e;

    public fc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, hf0 hf0Var, boolean z10) {
        this.f37225a = i10;
        this.f37226b = hf0Var;
        this.f37227c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37225a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final hf0 hf0Var = this.f37226b;
                final TLRPC.auth_SentCode auth_sentcode = this.f37227c;
                final Bundle bundle = this.d;
                if (z10) {
                    hf0Var.s1(false, true);
                    hf0Var.f37937p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    hf0Var.o1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    hf0Var.o1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.f8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final hf0 hf0Var2 = this.f37226b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f37227c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    hf0Var2.s1(false, true);
                    hf0Var2.f37937p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    hf0Var2.o1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    hf0Var2.o1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.f8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                hf0Var2.A1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
