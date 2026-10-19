package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34084a;
    public final x f34085b;
    public final String f34086c;

    public d1(x xVar, String str, int i10) {
        this.f34084a = i10;
        this.f34085b = xVar;
        this.f34086c = str;
    }

    @Override
    public final void run() {
        switch (this.f34084a) {
            case 0:
                this.f34085b.run(this.f34086c);
                return;
            default:
                this.f34085b.run(this.f34086c);
                return;
        }
    }
}
