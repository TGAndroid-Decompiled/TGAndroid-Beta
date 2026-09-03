package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id0 implements RequestDelegate {
    public final int f34904a;
    public final pg0 f34905b;
    public final TLRPC.auth_SentCode f34906c;
    public final Bundle d;
    public final boolean e;

    public id0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, pg0 pg0Var, boolean z4) {
        this.f34904a = i10;
        this.f34905b = pg0Var;
        this.f34906c = auth_sentcode;
        this.d = bundle;
        this.e = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34904a) {
            case 0:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                final pg0 pg0Var = this.f34905b;
                final TLRPC.auth_SentCode auth_sentcode = this.f34906c;
                final Bundle bundle = this.d;
                if (z4) {
                    pg0Var.k1(false, true);
                    pg0Var.f37141l0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    pg0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    pg0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                pg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final pg0 pg0Var2 = this.f34905b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f34906c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    pg0Var2.k1(false, true);
                    pg0Var2.f37141l0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    pg0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    pg0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                pg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
