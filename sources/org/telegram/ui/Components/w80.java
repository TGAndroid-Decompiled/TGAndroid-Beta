package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f32560a;
    public final y80 f32561b;
    public final boolean f32562c;

    public w80(y80 y80Var, boolean z10, int i10) {
        this.f32560a = i10;
        this.f32561b = y80Var;
        this.f32562c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32560a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f32561b, this.f32562c, 1));
                return;
            default:
                this.f32561b.setJoinRequest(this.f32562c);
                return;
        }
    }
}
