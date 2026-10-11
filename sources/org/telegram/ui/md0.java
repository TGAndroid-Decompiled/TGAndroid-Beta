package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md0 implements RequestDelegate {
    public final int f39909a;
    public final vg0 f39910b;
    public final TLRPC.auth_SentCode f39911c;
    public final Bundle d;
    public final boolean f39912e;

    public md0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, vg0 vg0Var, boolean z10) {
        this.f39909a = i10;
        this.f39910b = vg0Var;
        this.f39911c = auth_sentcode;
        this.d = bundle;
        this.f39912e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39909a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final vg0 vg0Var = this.f39910b;
                final TLRPC.auth_SentCode auth_sentcode = this.f39911c;
                final Bundle bundle = this.d;
                if (z10) {
                    vg0Var.k1(false, true);
                    vg0Var.f43030o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f39912e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    vg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    vg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                vg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final vg0 vg0Var2 = this.f39910b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f39911c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    vg0Var2.k1(false, true);
                    vg0Var2.f43030o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f39912e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    vg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    vg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                vg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
