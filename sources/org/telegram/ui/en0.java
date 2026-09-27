package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class en0 extends TimerTask {
    public final fn0 f33294a;

    public en0(fn0 fn0Var) {
        this.f33294a = fn0Var;
    }

    @Override
    public final void run() {
        fn0 fn0Var = this.f33294a;
        if (fn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        fn0Var.f33597y = (int) (fn0Var.f33597y - (currentTimeMillis - fn0Var.F));
        fn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ml0(this, 6));
    }
}
