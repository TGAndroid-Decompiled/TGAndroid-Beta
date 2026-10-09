package org.telegram.ui.Wallet;

import org.telegram.ui.ft;
public final class b1 implements Runnable {
    public final int f34669a;
    public final ft f34670b;
    public final String f34671c;

    public b1(ft ftVar, String str, int i10) {
        this.f34669a = i10;
        this.f34670b = ftVar;
        this.f34671c = str;
    }

    @Override
    public final void run() {
        switch (this.f34669a) {
            case 0:
                this.f34670b.run(this.f34671c);
                return;
            default:
                this.f34670b.run(this.f34671c);
                return;
        }
    }
}
