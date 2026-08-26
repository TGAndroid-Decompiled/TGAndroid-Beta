package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.Utilities;

public final class PermissionRequest$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;
    public final String[] f$0;
    public final Activity f$1;
    public final Utilities.Callback f$2;

    public PermissionRequest$$ExternalSyntheticLambda4(String[] strArr, Activity activity, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = strArr;
        this.f$1 = activity;
        this.f$2 = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = false;
                for (String str : this.f$0) {
                    if (this.f$1.checkSelfPermission(str) == 0) {
                        z = true;
                        this.f$2.run(Boolean.valueOf(z));
                    }
                    break;
                }
                this.f$2.run(Boolean.valueOf(z));
                break;
            default:
                boolean z2 = false;
                for (String str2 : this.f$0) {
                    if (this.f$1.checkSelfPermission(str2) != 0) {
                        this.f$2.run(Boolean.valueOf(z2));
                    }
                    break;
                }
                z2 = true;
                this.f$2.run(Boolean.valueOf(z2));
                break;
        }
    }
}
