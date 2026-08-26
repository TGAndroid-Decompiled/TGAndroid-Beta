package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;

public final class StarsController$$ExternalSyntheticLambda69 implements Utilities.Callback2 {
    public final int $r8$classId = 0;
    public final Utilities.Callback f$0;
    public final boolean[] f$1;
    public final Utilities.Callback2 f$2;

    public StarsController$$ExternalSyntheticLambda69(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f$0 = callback;
        this.f$1 = zArr;
        this.f$2 = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$0;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f$1[0] = true;
                Utilities.Callback2 callback2 = this.f$2;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed", l);
                }
                break;
            default:
                this.f$1[0] = true;
                Utilities.Callback2 callback3 = this.f$2;
                if (callback3 != null) {
                    callback3.run(bool.booleanValue() ? "paid" : "failed", l);
                }
                Utilities.Callback callback4 = this.f$0;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda69(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f$1 = zArr;
        this.f$2 = callback2;
        this.f$0 = callback;
    }
}
