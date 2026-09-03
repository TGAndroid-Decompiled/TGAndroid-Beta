package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class j61 implements Runnable {
    public final int f37851a;
    public final eh.b f37852b;

    public j61(eh.b bVar, int i10) {
        this.f37851a = i10;
        this.f37852b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f37851a) {
            case 0:
                AndroidUtilities.showKeyboard(((n51) this.f37852b.d).h);
                return;
            default:
                this.f37852b.requestFocus();
                return;
        }
    }
}
