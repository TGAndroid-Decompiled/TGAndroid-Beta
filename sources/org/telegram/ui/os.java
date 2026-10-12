package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class os implements Runnable {
    public final int f39033a;
    public final ws f39034b;

    public os(ws wsVar, int i10) {
        this.f39033a = i10;
        this.f39034b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f39033a) {
            case 0:
                ws wsVar = this.f39034b;
                if (wsVar.J) {
                    wsVar.d.f21368b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.f21368b);
                    return;
                }
                return;
            case 1:
                ws.Z(this.f39034b);
                return;
            default:
                ws wsVar2 = this.f39034b;
                wsVar2.presentFragment(fo.W9(wsVar2.H), true);
                return;
        }
    }
}
