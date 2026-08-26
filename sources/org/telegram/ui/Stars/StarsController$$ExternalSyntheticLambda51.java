package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda51 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final StarsController f$0;
    public final int f$1;
    public final Utilities.Callback f$2;
    public final boolean[] f$3;
    public final Utilities.Callback f$4;

    public StarsController$$ExternalSyntheticLambda51(StarsController starsController, int i, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f$0 = starsController;
        this.f$1 = i;
        this.f$2 = callback;
        this.f$3 = zArr;
        this.f$4 = callback2;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = this.f$0;
                if (this.f$1 > 0) {
                    starsController.invalidateSubscriptions();
                } else {
                    starsController.getClass();
                }
                Utilities.Callback callback = this.f$2;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f$3[0] = true;
                Utilities.Callback callback2 = this.f$4;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed");
                }
                break;
            default:
                StarsController starsController2 = this.f$0;
                starsController2.getClass();
                this.f$3[0] = true;
                if (this.f$1 > 0) {
                    starsController2.invalidateSubscriptions();
                }
                Utilities.Callback callback3 = this.f$2;
                if (callback3 != null) {
                    callback3.run(bool.booleanValue() ? "paid" : "failed");
                }
                Utilities.Callback callback4 = this.f$4;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda51(StarsController starsController, boolean[] zArr, int i, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f$0 = starsController;
        this.f$3 = zArr;
        this.f$1 = i;
        this.f$2 = callback;
        this.f$4 = callback2;
    }
}
