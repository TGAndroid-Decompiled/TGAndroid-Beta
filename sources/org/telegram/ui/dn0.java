package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends TimerTask {
    public final en0 f32688a;

    public dn0(en0 en0Var) {
        this.f32688a = en0Var;
    }

    @Override
    public final void run() {
        en0 en0Var = this.f32688a;
        if (en0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        en0Var.f32989y = (int) (en0Var.f32989y - (currentTimeMillis - en0Var.F));
        en0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new jl0(this, 6));
    }
}
