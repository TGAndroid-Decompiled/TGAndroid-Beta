package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class e61 implements Runnable {
    public final int f36410a;
    public final eh.b f36411b;

    public e61(eh.b bVar, int i10) {
        this.f36410a = i10;
        this.f36411b = bVar;
    }

    @Override
    public final void run() {
        switch (this.f36410a) {
            case 0:
                AndroidUtilities.showKeyboard(((i51) this.f36411b.d).h);
                return;
            default:
                this.f36411b.requestFocus();
                return;
        }
    }
}
