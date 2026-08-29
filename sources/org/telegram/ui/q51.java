package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class q51 implements Runnable {
    public final int f41541a;
    public final bh.b f41542b;

    public q51(bh.b bVar, int i10) {
        this.f41541a = i10;
        this.f41542b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f41541a) {
            case 0:
                AndroidUtilities.showKeyboard(((u41) this.f41542b.d).h);
                return;
            default:
                this.f41542b.requestFocus();
                return;
        }
    }
}
