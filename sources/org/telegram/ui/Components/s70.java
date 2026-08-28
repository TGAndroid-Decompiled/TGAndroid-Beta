package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s70 implements Runnable {
    public final int f32387a;
    public final t70 f32388b;
    public final boolean f32389c;
    public final boolean d;

    public s70(t70 t70Var, boolean z10, boolean z11, int i9) {
        this.f32387a = i9;
        this.f32388b = t70Var;
        this.f32389c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32387a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s70(this.f32388b, this.f32389c, this.d, 1));
                return;
            default:
                t70 t70Var = this.f32388b;
                t70Var.setJoinRequest(this.f32389c);
                t70Var.setJoinToSend(this.d);
                return;
        }
    }
}
