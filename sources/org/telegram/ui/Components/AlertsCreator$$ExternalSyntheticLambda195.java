package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda195 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final HashMap f$1;

    public AlertsCreator$$ExternalSyntheticLambda195(Utilities.Callback callback, HashMap map, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = map;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            default:
                this.f$0.run(this.f$1);
                break;
        }
    }
}
