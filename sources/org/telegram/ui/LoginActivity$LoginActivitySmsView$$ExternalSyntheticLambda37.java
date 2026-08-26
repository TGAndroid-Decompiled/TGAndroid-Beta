package org.telegram.ui;

import android.content.DialogInterface;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda37 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda37(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$26(dialogInterface);
                break;
            default:
                this.f$0.lambda$onNextPressed$22(dialogInterface);
                break;
        }
    }
}
