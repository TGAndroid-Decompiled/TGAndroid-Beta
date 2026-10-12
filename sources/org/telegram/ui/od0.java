package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od0 implements RequestDelegate {
    public final int f40649a;
    public final xg0 f40650b;
    public final TLRPC.auth_SentCode f40651c;
    public final Bundle d;
    public final boolean f40652e;

    public od0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, xg0 xg0Var, boolean z10) {
        this.f40649a = i10;
        this.f40650b = xg0Var;
        this.f40651c = auth_sentcode;
        this.d = bundle;
        this.f40652e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40649a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final xg0 xg0Var = this.f40650b;
                final TLRPC.auth_SentCode auth_sentcode = this.f40651c;
                final Bundle bundle = this.d;
                if (z10) {
                    xg0Var.k1(false, true);
                    xg0Var.f43951o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f40652e;
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
                final xg0 xg0Var2 = this.f40650b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f40651c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    xg0Var2.k1(false, true);
                    xg0Var2.f43951o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f40652e;
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
