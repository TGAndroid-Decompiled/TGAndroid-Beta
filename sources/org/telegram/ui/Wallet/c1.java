package org.telegram.ui.Wallet;

import org.telegram.ui.ft;
public final class c1 implements Runnable {
    public final int f34769a;
    public final ft f34770b;
    public final String f34771c;

    public c1(ft ftVar, String str, int i10) {
        this.f34769a = i10;
        this.f34770b = ftVar;
        this.f34771c = str;
    }

    @Override
    public final void run() {
        switch (this.f34769a) {
            case 0:
                this.f34770b.run(this.f34771c);
                return;
            default:
                this.f34770b.run(this.f34771c);
                return;
        }
    }
}
