package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f42322a;
    public final t f42323b;
    public final String f42324c;

    public d1(t tVar, String str, int i7) {
        this.f42322a = i7;
        this.f42323b = tVar;
        this.f42324c = str;
    }

    @Override
    public final void run() {
        switch (this.f42322a) {
            case 0:
                this.f42323b.a(this.f42324c);
                return;
            default:
                this.f42323b.a(this.f42324c);
                return;
        }
    }
}
