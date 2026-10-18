package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34076a;
    public final x f34077b;
    public final String f34078c;

    public d1(x xVar, String str, int i10) {
        this.f34076a = i10;
        this.f34077b = xVar;
        this.f34078c = str;
    }

    @Override
    public final void run() {
        switch (this.f34076a) {
            case 0:
                this.f34077b.run(this.f34078c);
                return;
            default:
                this.f34077b.run(this.f34078c);
                return;
        }
    }
}
