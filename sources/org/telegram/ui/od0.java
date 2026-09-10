package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od0 implements RequestDelegate {
    public final int f35467a;
    public final xg0 f35468b;
    public final TLRPC.auth_SentCode f35469c;
    public final Bundle d;
    public final boolean e;

    public od0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, xg0 xg0Var, boolean z10) {
        this.f35467a = i10;
        this.f35468b = xg0Var;
        this.f35469c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35467a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final xg0 xg0Var = this.f35468b;
                final TLRPC.auth_SentCode auth_sentcode = this.f35469c;
                final Bundle bundle = this.d;
                if (z10) {
                    xg0Var.k1(false, true);
                    xg0Var.f38735o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    xg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    xg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                xg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final xg0 xg0Var2 = this.f35468b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f35469c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    xg0Var2.k1(false, true);
                    xg0Var2.f38735o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    xg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    xg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                xg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
