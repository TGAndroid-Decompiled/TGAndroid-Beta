package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;

public final class LocationActivity$$ExternalSyntheticLambda12 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final int $r8$classId;
    public final LocationActivity f$0;
    public final TLRPC.TL_messageMediaVenue f$1;

    public LocationActivity$$ExternalSyntheticLambda12(LocationActivity locationActivity, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
        this.f$1 = tL_messageMediaVenue;
    }

    @Override
    public final void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$27(this.f$1, z, i, i2);
                break;
            default:
                this.f$0.lambda$createView$17(this.f$1, z, i, i2);
                break;
        }
    }
}
