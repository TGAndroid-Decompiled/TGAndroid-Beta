package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class x80 implements Runnable {
    public final int f32740a;
    public final y80 f32741b;
    public final boolean f32742c;
    public final boolean d;

    public x80(y80 y80Var, boolean z10, boolean z11, int i10) {
        this.f32740a = i10;
        this.f32741b = y80Var;
        this.f32742c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32740a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x80(this.f32741b, this.f32742c, this.d, 1));
                return;
            default:
                y80 y80Var = this.f32741b;
                y80Var.setJoinRequest(this.f32742c);
                y80Var.setJoinToSend(this.d);
                return;
        }
    }
}
