package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class JoinGroupAlert$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final JoinGroupAlert f$0;
    public final boolean f$1;

    public JoinGroupAlert$$ExternalSyntheticLambda4(JoinGroupAlert joinGroupAlert, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = joinGroupAlert;
        this.f$1 = z;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$2(this.f$1, dialogInterface);
                break;
            default:
                this.f$0.lambda$new$5(this.f$1, dialogInterface);
                break;
        }
    }
}
