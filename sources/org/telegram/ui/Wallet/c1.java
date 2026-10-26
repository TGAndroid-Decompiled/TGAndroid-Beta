package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f36417a;
    public final s f36418b;
    public final String f36419c;

    public c1(s sVar, String str, int i10) {
        this.f36417a = i10;
        this.f36418b = sVar;
        this.f36419c = str;
    }

    @Override
    public final void run() {
        switch (this.f36417a) {
            case 0:
                this.f36418b.run(this.f36419c);
                return;
            default:
                this.f36418b.run(this.f36419c);
                return;
        }
    }
}
