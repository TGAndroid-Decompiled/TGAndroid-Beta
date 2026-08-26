package org.telegram.ui.ActionBar;

import android.content.DialogInterface;

public final class BottomSheet$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public BottomSheet$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((Runnable) this.f$0).run();
                break;
            default:
                ((AlertDialog) this.f$0).cancelDialog = null;
                break;
        }
    }
}
