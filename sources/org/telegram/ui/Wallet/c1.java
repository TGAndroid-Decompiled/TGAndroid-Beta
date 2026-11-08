package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f42293a;
    public final t f42294b;
    public final String f42295c;

    public c1(t tVar, String str, int i7) {
        this.f42293a = i7;
        this.f42294b = tVar;
        this.f42295c = str;
    }

    @Override
    public final void run() {
        switch (this.f42293a) {
            case 0:
                this.f42294b.a(this.f42295c);
                return;
            default:
                this.f42294b.a(this.f42295c);
                return;
        }
    }
}
