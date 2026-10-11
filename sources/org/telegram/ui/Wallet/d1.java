package org.telegram.ui.Wallet;

import org.telegram.ui.et;
public final class d1 implements Runnable {
    public final int f34832a;
    public final et f34833b;
    public final String f34834c;

    public d1(et etVar, String str, int i10) {
        this.f34832a = i10;
        this.f34833b = etVar;
        this.f34834c = str;
    }

    @Override
    public final void run() {
        switch (this.f34832a) {
            case 0:
                this.f34833b.run(this.f34834c);
                return;
            default:
                this.f34833b.run(this.f34834c);
                return;
        }
    }
}
