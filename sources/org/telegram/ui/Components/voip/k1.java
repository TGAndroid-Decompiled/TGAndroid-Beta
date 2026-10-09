package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class k1 implements Runnable {
    public final int f32028a;
    public final o1 f32029b;
    public final fk0 f32030c;

    public k1(o1 o1Var, fk0 fk0Var, int i10) {
        this.f32028a = i10;
        this.f32029b = o1Var;
        this.f32030c = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f32028a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f32029b, this.f32030c, 1));
                return;
            default:
                this.f32029b.removeView(this.f32030c);
                return;
        }
    }
}
