package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f32480a;
    public final y80 f32481b;
    public final boolean f32482c;

    public w80(y80 y80Var, boolean z10, int i10) {
        this.f32480a = i10;
        this.f32481b = y80Var;
        this.f32482c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32480a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f32481b, this.f32482c, 1));
                return;
            default:
                this.f32481b.setJoinRequest(this.f32482c);
                return;
        }
    }
}
