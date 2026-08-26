package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final Bundle f$1;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda23(LoginActivity.LoginActivitySmsView loginActivitySmsView, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
        this.f$1 = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                loginActivitySmsView.getClass();
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(13, loginActivitySmsView, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginActivitySmsView, this.f$1, tLObject, false, 17));
                    break;
                }
                break;
            default:
                LoginActivity.LoginActivitySmsView loginActivitySmsView2 = this.f$0;
                loginActivitySmsView2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(loginActivitySmsView2, tL_error, this.f$1, tLObject, 12));
                break;
        }
    }
}
