package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c61 implements Runnable {
    public final int f33207a;
    public final dh.b f33208b;

    public c61(dh.b bVar, int i10) {
        this.f33207a = i10;
        this.f33208b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f33207a) {
            case 0:
                AndroidUtilities.showKeyboard(((g51) this.f33208b.d).h);
                return;
            default:
                this.f33208b.requestFocus();
                return;
        }
    }
}
