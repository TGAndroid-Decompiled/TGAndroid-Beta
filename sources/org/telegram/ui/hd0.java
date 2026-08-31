package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hd0 implements RequestDelegate {
    public final int f37463a;
    public final og0 f37464b;
    public final TLRPC.auth_SentCode f37465c;
    public final Bundle d;
    public final boolean f37466e;

    public hd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, og0 og0Var, boolean z4) {
        this.f37463a = i10;
        this.f37464b = og0Var;
        this.f37465c = auth_sentcode;
        this.d = bundle;
        this.f37466e = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37463a) {
            case 0:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                final og0 og0Var = this.f37464b;
                final TLRPC.auth_SentCode auth_sentcode = this.f37465c;
                final Bundle bundle = this.d;
                if (z4) {
                    og0Var.k1(false, true);
                    og0Var.f39766l0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.f37466e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    og0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    og0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                og0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final og0 og0Var2 = this.f37464b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f37465c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    og0Var2.k1(false, true);
                    og0Var2.f39766l0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.f37466e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    og0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    og0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                og0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
