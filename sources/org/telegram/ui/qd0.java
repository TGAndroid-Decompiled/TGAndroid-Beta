package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements RequestDelegate {
    public final int f36887a;
    public final yg0 f36888b;
    public final TLRPC.auth_SentCode f36889c;
    public final Bundle d;
    public final boolean e;

    public qd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, yg0 yg0Var, boolean z10) {
        this.f36887a = i10;
        this.f36888b = yg0Var;
        this.f36889c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36887a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final yg0 yg0Var = this.f36888b;
                final TLRPC.auth_SentCode auth_sentcode = this.f36889c;
                final Bundle bundle = this.d;
                if (z10) {
                    yg0Var.k1(false, true);
                    yg0Var.f39927o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    yg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    yg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                yg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final yg0 yg0Var2 = this.f36888b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f36889c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    yg0Var2.k1(false, true);
                    yg0Var2.f39927o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    yg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    yg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                yg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
