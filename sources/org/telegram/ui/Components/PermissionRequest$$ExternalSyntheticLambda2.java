package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

public final class PermissionRequest$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final String[] f$0;
    public final Activity f$1;
    public final Utilities.Callback f$2;

    public PermissionRequest$$ExternalSyntheticLambda2(String[] strArr, Activity activity, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = strArr;
        this.f$1 = activity;
        this.f$2 = callback;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = (int[]) obj;
        switch (this.$r8$classId) {
            case 0:
                PermissionRequest.lambda$ensureAllPermissions$3(this.f$0, this.f$1, this.f$2, iArr);
                break;
            default:
                PermissionRequest.lambda$ensureEitherPermission$1(this.f$0, this.f$1, this.f$2, iArr);
                break;
        }
    }
}
