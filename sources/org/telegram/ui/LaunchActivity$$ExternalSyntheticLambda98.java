package org.telegram.ui;

import android.content.DialogInterface;

public final class LaunchActivity$$ExternalSyntheticLambda98 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final int f$0;
    public final int[] f$1;

    public LaunchActivity$$ExternalSyntheticLambda98(int i, int i2, int[] iArr) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$runImportRequest$36(this.f$0, this.f$1, null, dialogInterface);
                break;
            default:
                ExternalActionActivity.lambda$handleIntent$5(this.f$0, this.f$1, dialogInterface);
                break;
        }
    }
}
