package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;
public final class q0 implements Runnable {
    public final int f22479a;
    public final xi0 f22480b;

    public q0(xi0 xi0Var, int i10) {
        this.f22479a = i10;
        this.f22480b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f22479a) {
            case 0:
                this.f22480b.F(false);
                return;
            default:
                this.f22480b.start();
                return;
        }
    }
}
