package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o90 implements Runnable {
    public final int f29109a;
    public final q90 f29110b;
    public final boolean f29111c;

    public o90(q90 q90Var, boolean z10, int i10) {
        this.f29109a = i10;
        this.f29110b = q90Var;
        this.f29111c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29109a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o90(this.f29110b, this.f29111c, 1));
                return;
            default:
                this.f29110b.setJoinRequest(this.f29111c);
                return;
        }
    }
}
