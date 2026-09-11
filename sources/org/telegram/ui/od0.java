package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od0 implements RequestDelegate {
    public final int f39220a;
    public final wg0 f39221b;
    public final TLRPC.auth_SentCode f39222c;
    public final Bundle d;
    public final boolean f39223e;

    public od0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, wg0 wg0Var, boolean z10) {
        this.f39220a = i10;
        this.f39221b = wg0Var;
        this.f39222c = auth_sentcode;
        this.d = bundle;
        this.f39223e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39220a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final wg0 wg0Var = this.f39221b;
                final TLRPC.auth_SentCode auth_sentcode = this.f39222c;
                final Bundle bundle = this.d;
                if (z10) {
                    wg0Var.k1(false, true);
                    wg0Var.f42378o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f39223e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    wg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    wg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                wg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final wg0 wg0Var2 = this.f39221b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f39222c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    wg0Var2.k1(false, true);
                    wg0Var2.f42378o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f39223e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    wg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    wg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                wg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
