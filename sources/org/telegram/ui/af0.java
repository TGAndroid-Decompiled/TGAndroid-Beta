package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class af0 extends TimerTask {
    public final bf0 f33893a;

    public af0(bf0 bf0Var) {
        this.f33893a = bf0Var;
    }

    @Override
    public final void run() {
        if (this.f33893a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zz(this, 23));
    }
}
