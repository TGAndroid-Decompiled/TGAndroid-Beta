package org.telegram.ui;

import android.os.Bundle;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final Bundle f$1;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = bundle;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$19(this.f$1);
                break;
            default:
                this.f$0.lambda$onNextPressed$17(this.f$1);
                break;
        }
    }
}
