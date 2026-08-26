package org.telegram.ui;

import android.os.Bundle;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final Bundle f$1;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(LoginActivity.LoginActivitySmsView loginActivitySmsView, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
        this.f$1 = bundle;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$32(this.f$1);
                break;
            default:
                this.f$0.lambda$onNextPressed$30(this.f$1);
                break;
        }
    }
}
