package org.telegram.ui.Wallet;
public final class b1 implements Runnable {
    public final int f42207a;
    public final s f42208b;
    public final String f42209c;

    public b1(s sVar, String str, int i7) {
        this.f42207a = i7;
        this.f42208b = sVar;
        this.f42209c = str;
    }

    @Override
    public final void run() {
        switch (this.f42207a) {
            case 0:
                this.f42208b.a(this.f42209c);
                return;
            default:
                this.f42208b.a(this.f42209c);
                return;
        }
    }
}
