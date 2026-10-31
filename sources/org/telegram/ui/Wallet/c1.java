package org.telegram.ui.Wallet;

import org.telegram.ui.f11;
public final class c1 implements Runnable {
    public final int f34306a;
    public final f11 f34307b;
    public final String f34308c;

    public c1(f11 f11Var, String str, int i10) {
        this.f34306a = i10;
        this.f34307b = f11Var;
        this.f34308c = str;
    }

    @Override
    public final void run() {
        switch (this.f34306a) {
            case 0:
                this.f34307b.a(this.f34308c);
                return;
            default:
                this.f34307b.a(this.f34308c);
                return;
        }
    }
}
