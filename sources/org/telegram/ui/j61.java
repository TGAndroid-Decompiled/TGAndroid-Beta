package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class j61 implements Runnable {
    public final int f35099a;
    public final dh.b f35100b;

    public j61(dh.b bVar, int i10) {
        this.f35099a = i10;
        this.f35100b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f35099a) {
            case 0:
                AndroidUtilities.showKeyboard(((n51) this.f35100b.d).h);
                return;
            default:
                this.f35100b.requestFocus();
                return;
        }
    }
}
