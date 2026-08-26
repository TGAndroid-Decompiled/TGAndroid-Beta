package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class SharedMediaLayout$$ExternalSyntheticLambda35 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final int f$0;
    public final int f$1;

    public SharedMediaLayout$$ExternalSyntheticLambda35(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.lambda$new$18(this.f$0, this.f$1, dialogInterface);
                break;
            default:
                SharedMediaLayout.lambda$new$24(this.f$0, this.f$1, dialogInterface);
                break;
        }
    }
}
