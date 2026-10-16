package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class os implements Runnable {
    public final int f38742a;
    public final ws f38743b;

    public os(ws wsVar, int i10) {
        this.f38742a = i10;
        this.f38743b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f38742a) {
            case 0:
                ws wsVar = this.f38743b;
                if (wsVar.J) {
                    wsVar.d.f21083b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.f21083b);
                    return;
                }
                return;
            case 1:
                ws.Z(this.f38743b);
                return;
            default:
                ws wsVar2 = this.f38743b;
                wsVar2.presentFragment(fo.W9(wsVar2.H), true);
                return;
        }
    }
}
