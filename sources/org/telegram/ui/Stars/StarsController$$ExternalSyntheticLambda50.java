package org.telegram.ui.Stars;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda50 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final StarsController f$0;
    public final Utilities.Callback f$1;
    public final boolean[] f$2;
    public final boolean[] f$3;
    public final Object f$4;

    public StarsController$$ExternalSyntheticLambda50(StarsController starsController, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
        this.f$1 = callback;
        this.f$2 = zArr;
        this.f$3 = zArr2;
        this.f$4 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Utilities.Callback callback;
        Utilities.Callback2 callback2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getClass();
                Utilities.Callback callback3 = this.f$1;
                if (callback3 != null && !this.f$2[0]) {
                    callback3.run(Boolean.FALSE);
                    boolean[] zArr = this.f$3;
                    if (!zArr[0] && (callback = (Utilities.Callback) this.f$4) != null) {
                        callback.run("cancelled");
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            default:
                this.f$0.getClass();
                Utilities.Callback callback4 = this.f$1;
                if (callback4 != null && !this.f$2[0]) {
                    callback4.run(Boolean.FALSE);
                    boolean[] zArr2 = this.f$3;
                    if (!zArr2[0] && (callback2 = (Utilities.Callback2) this.f$4) != null) {
                        callback2.run("cancelled", 0L);
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
        }
    }
}
