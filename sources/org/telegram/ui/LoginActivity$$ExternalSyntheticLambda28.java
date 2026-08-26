package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$$ExternalSyntheticLambda28 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity f$0;
    public final TLRPC.auth_SentCode f$1;
    public final Bundle f$2;
    public final boolean f$3;

    public LoginActivity$$ExternalSyntheticLambda28(int i, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, LoginActivity loginActivity, boolean z) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
        this.f$1 = auth_sentcode;
        this.f$2 = bundle;
        this.f$3 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity loginActivity = this.f$0;
                loginActivity.getClass();
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                final TLRPC.auth_SentCode auth_sentcode = this.f$1;
                final Bundle bundle = this.f$2;
                if (!z) {
                    FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                } else {
                    loginActivity.needHideProgress(false, true);
                    loginActivity.isRequestingFirebaseSms = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z2 = this.f$3;
                    final int i = 1;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    loginActivity.fillNextCodeParams(bundle, auth_sentcode, z2);
                                    break;
                                default:
                                    loginActivity.fillNextCodeParams(bundle, auth_sentcode, z2);
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                final LoginActivity loginActivity2 = this.f$0;
                loginActivity2.getClass();
                boolean z3 = tLObject instanceof TLRPC.TL_boolTrue;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f$1;
                final Bundle bundle2 = this.f$2;
                if (!z3) {
                    FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    loginActivity2.resendCodeFromSafetyNet(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                } else {
                    loginActivity2.needHideProgress(false, true);
                    loginActivity2.isRequestingFirebaseSms = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z4 = this.f$3;
                    final int i2 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    loginActivity2.fillNextCodeParams(bundle2, auth_sentcode2, z4);
                                    break;
                                default:
                                    loginActivity2.fillNextCodeParams(bundle2, auth_sentcode2, z4);
                                    break;
                            }
                        }
                    });
                }
                break;
        }
    }
}
