package org.telegram.ui.Stars;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda118 implements DialogInterface.OnDismissListener {
    public final int $r8$classId = 0;
    public final Utilities.Callback f$0;
    public final boolean[] f$1;

    public StarsController$$ExternalSyntheticLambda118(Utilities.Callback callback, boolean[] zArr) {
        this.f$0 = callback;
        this.f$1 = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$0;
                if (callback != null && !this.f$1[0]) {
                    callback.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr = this.f$1;
                if (!zArr[0]) {
                    this.f$0.run(Boolean.FALSE);
                    zArr[0] = true;
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda118(boolean[] zArr, Utilities.Callback callback) {
        this.f$1 = zArr;
        this.f$0 = callback;
    }
}
