package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f36414a;
    public final s f36415b;
    public final String f36416c;

    public c1(s sVar, String str, int i10) {
        this.f36414a = i10;
        this.f36415b = sVar;
        this.f36416c = str;
    }

    @Override
    public final void run() {
        switch (this.f36414a) {
            case 0:
                this.f36415b.run(this.f36416c);
                return;
            default:
                this.f36415b.run(this.f36416c);
                return;
        }
    }
}
