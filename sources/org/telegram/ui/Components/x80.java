package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class x80 implements Runnable {
    public final int f32733a;
    public final y80 f32734b;
    public final boolean f32735c;
    public final boolean d;

    public x80(y80 y80Var, boolean z10, boolean z11, int i10) {
        this.f32733a = i10;
        this.f32734b = y80Var;
        this.f32735c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32733a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x80(this.f32734b, this.f32735c, this.d, 1));
                return;
            default:
                y80 y80Var = this.f32734b;
                y80Var.setJoinRequest(this.f32735c);
                y80Var.setJoinToSend(this.d);
                return;
        }
    }
}
