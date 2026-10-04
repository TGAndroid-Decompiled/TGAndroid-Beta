package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md0 implements RequestDelegate {
    public final int f38537a;
    public final ug0 f38538b;
    public final TLRPC.auth_SentCode f38539c;
    public final Bundle d;
    public final boolean f38540e;

    public md0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ug0 ug0Var, boolean z10) {
        this.f38537a = i10;
        this.f38538b = ug0Var;
        this.f38539c = auth_sentcode;
        this.d = bundle;
        this.f38540e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38537a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ug0 ug0Var = this.f38538b;
                final TLRPC.auth_SentCode auth_sentcode = this.f38539c;
                final Bundle bundle = this.d;
                if (z10) {
                    ug0Var.k1(false, true);
                    ug0Var.f41211o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f38540e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ug0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ug0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ug0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ug0 ug0Var2 = this.f38538b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f38539c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ug0Var2.k1(false, true);
                    ug0Var2.f41211o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f38540e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ug0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ug0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ug0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
