package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;

public final class JoinCallAlert$$ExternalSyntheticLambda1 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final AccountInstance f$0;
    public final int f$1;

    public JoinCallAlert$$ExternalSyntheticLambda1(AccountInstance accountInstance, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = accountInstance;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                JoinCallAlert.lambda$open$5(this.f$0, this.f$1, dialogInterface);
                break;
            default:
                JoinCallAlert.lambda$checkFewUsers$2(this.f$0, this.f$1, dialogInterface);
                break;
        }
    }
}
