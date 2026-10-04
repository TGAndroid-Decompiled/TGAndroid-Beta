package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f32481a;
    public final y80 f32482b;
    public final boolean f32483c;

    public w80(y80 y80Var, boolean z10, int i10) {
        this.f32481a = i10;
        this.f32482b = y80Var;
        this.f32483c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32481a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f32482b, this.f32483c, 1));
                return;
            default:
                this.f32482b.setJoinRequest(this.f32483c);
                return;
        }
    }
}
