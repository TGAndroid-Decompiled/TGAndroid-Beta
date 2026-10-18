package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34118a;
    public final x f34119b;
    public final String f34120c;

    public d1(x xVar, String str, int i10) {
        this.f34118a = i10;
        this.f34119b = xVar;
        this.f34120c = str;
    }

    @Override
    public final void run() {
        switch (this.f34118a) {
            case 0:
                this.f34119b.run(this.f34120c);
                return;
            default:
                this.f34119b.run(this.f34120c);
                return;
        }
    }
}
