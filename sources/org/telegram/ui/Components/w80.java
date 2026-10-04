package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f32487a;
    public final y80 f32488b;
    public final boolean f32489c;

    public w80(y80 y80Var, boolean z10, int i10) {
        this.f32487a = i10;
        this.f32488b = y80Var;
        this.f32489c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32487a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f32488b, this.f32489c, 1));
                return;
            default:
                this.f32488b.setJoinRequest(this.f32489c);
                return;
        }
    }
}
