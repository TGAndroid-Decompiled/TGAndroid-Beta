package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id0 implements RequestDelegate {
    public final int f34482a;
    public final qg0 f34483b;
    public final TLRPC.auth_SentCode f34484c;
    public final Bundle d;
    public final boolean e;

    public id0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, qg0 qg0Var, boolean z10) {
        this.f34482a = i10;
        this.f34483b = qg0Var;
        this.f34484c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34482a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final qg0 qg0Var = this.f34483b;
                final TLRPC.auth_SentCode auth_sentcode = this.f34484c;
                final Bundle bundle = this.d;
                if (z10) {
                    qg0Var.k1(false, true);
                    qg0Var.f36888o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    qg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    qg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                qg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final qg0 qg0Var2 = this.f34483b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f34484c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    qg0Var2.k1(false, true);
                    qg0Var2.f36888o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    qg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    qg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                qg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
