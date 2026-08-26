package org.telegram.ui.Stars;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Utilities.Callback2 f$0;
    public final boolean[] f$1;

    public StarsController$$ExternalSyntheticLambda5(Utilities.Callback2 callback2, boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = callback2;
        this.f$1 = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback2 callback2 = this.f$0;
                if (callback2 != null && !this.f$1[0]) {
                    callback2.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback3 = this.f$0;
                if (callback3 != null && !this.f$1[0]) {
                    callback3.run(0L, Boolean.FALSE);
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback4 = this.f$0;
                if (callback4 != null && !this.f$1[0]) {
                    callback4.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
