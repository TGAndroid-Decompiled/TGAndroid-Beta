package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class BoostRepository$$ExternalSyntheticLambda47 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public BoostRepository$$ExternalSyntheticLambda47(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda47(2, this.f$0));
                break;
            case 1:
                this.f$0.run(null);
                break;
            default:
                this.f$0.run(null);
                break;
        }
    }
}
