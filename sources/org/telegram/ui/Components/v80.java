package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v80 implements Runnable {
    public final int f29013a;
    public final x80 f29014b;
    public final boolean f29015c;

    public v80(x80 x80Var, boolean z10, int i10) {
        this.f29013a = i10;
        this.f29014b = x80Var;
        this.f29015c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29013a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.f29014b, this.f29015c, 1));
                return;
            default:
                this.f29014b.setJoinRequest(this.f29015c);
                return;
        }
    }
}
