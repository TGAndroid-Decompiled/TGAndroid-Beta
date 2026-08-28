package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o51 implements Runnable {
    public final int f40990a;
    public final fh.s f40991b;

    public o51(fh.s sVar, int i9) {
        this.f40990a = i9;
        this.f40991b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f40990a) {
            case 0:
                AndroidUtilities.showKeyboard(((s41) this.f40991b.d).h);
                return;
            default:
                this.f40991b.requestFocus();
                return;
        }
    }
}
