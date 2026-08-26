package org.telegram.ui.Components;

import java.util.ArrayList;

public final class AlertsCreator$$ExternalSyntheticLambda156 implements Runnable {
    public final int $r8$classId;
    public final ArrayList f$0;

    public AlertsCreator$$ExternalSyntheticLambda156(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBirthdayPickerDialog$148(this.f$0);
                break;
            default:
                ThanosEffect.DrawingThread.Animation.lambda$new$0(this.f$0);
                break;
        }
    }
}
