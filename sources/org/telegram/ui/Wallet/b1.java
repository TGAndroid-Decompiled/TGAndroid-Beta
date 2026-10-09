package org.telegram.ui.Wallet;

import org.telegram.ui.ft;
public final class b1 implements Runnable {
    public final int f34641a;
    public final ft f34642b;
    public final String f34643c;

    public b1(ft ftVar, String str, int i10) {
        this.f34641a = i10;
        this.f34642b = ftVar;
        this.f34643c = str;
    }

    @Override
    public final void run() {
        switch (this.f34641a) {
            case 0:
                this.f34642b.run(this.f34643c);
                return;
            default:
                this.f34642b.run(this.f34643c);
                return;
        }
    }
}
