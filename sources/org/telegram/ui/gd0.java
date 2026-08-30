package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd0 implements RequestDelegate {
    public final int f34575a;
    public final ng0 f34576b;
    public final TLRPC.auth_SentCode f34577c;
    public final Bundle d;
    public final boolean e;

    public gd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ng0 ng0Var, boolean z4) {
        this.f34575a = i10;
        this.f34576b = ng0Var;
        this.f34577c = auth_sentcode;
        this.d = bundle;
        this.e = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34575a) {
            case 0:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                final ng0 ng0Var = this.f34576b;
                final TLRPC.auth_SentCode auth_sentcode = this.f34577c;
                final Bundle bundle = this.d;
                if (z4) {
                    ng0Var.k1(false, true);
                    ng0Var.f36637l0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ng0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    ng0Var.g1(bundle, auth_sentcode, z10);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ng0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final ng0 ng0Var2 = this.f34576b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f34577c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    ng0Var2.k1(false, true);
                    ng0Var2.f36637l0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ng0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    ng0Var2.g1(bundle2, auth_sentcode2, z12);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ng0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
