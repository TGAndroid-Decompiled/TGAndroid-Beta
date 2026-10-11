package org.telegram.ui.Wallet;

import org.telegram.ui.et;
public final class d1 implements Runnable {
    public final int f34798a;
    public final et f34799b;
    public final String f34800c;

    public d1(et etVar, String str, int i10) {
        this.f34798a = i10;
        this.f34799b = etVar;
        this.f34800c = str;
    }

    @Override
    public final void run() {
        switch (this.f34798a) {
            case 0:
                this.f34799b.run(this.f34800c);
                return;
            default:
                this.f34799b.run(this.f34800c);
                return;
        }
    }
}
