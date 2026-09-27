package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ag0 implements Runnable {
    public final int f32068a;
    public final u3 f32069b;

    public ag0(u3 u3Var, int i10) {
        this.f32068a = i10;
        this.f32069b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f32068a) {
            case 0:
                this.f32069b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new ag0(this.f32069b, 0));
                return;
        }
    }
}
