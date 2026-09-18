package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r80 implements Runnable {
    public final int f27847a;
    public final t80 f27848b;
    public final boolean f27849c;

    public r80(t80 t80Var, boolean z10, int i10) {
        this.f27847a = i10;
        this.f27848b = t80Var;
        this.f27849c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27847a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r80(this.f27848b, this.f27849c, 1));
                return;
            default:
                this.f27848b.setJoinRequest(this.f27849c);
                return;
        }
    }
}
