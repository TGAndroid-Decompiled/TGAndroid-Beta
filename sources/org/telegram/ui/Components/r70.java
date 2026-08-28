package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r70 implements Runnable {
    public final int f32103a;
    public final t70 f32104b;
    public final boolean f32105c;

    public r70(t70 t70Var, boolean z10, int i9) {
        this.f32103a = i9;
        this.f32104b = t70Var;
        this.f32105c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32103a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r70(this.f32104b, this.f32105c, 1));
                return;
            default:
                this.f32104b.setJoinRequest(this.f32105c);
                return;
        }
    }
}
