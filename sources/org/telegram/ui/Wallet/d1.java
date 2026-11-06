package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f42323a;
    public final t f42324b;
    public final String f42325c;

    public d1(t tVar, String str, int i7) {
        this.f42323a = i7;
        this.f42324b = tVar;
        this.f42325c = str;
    }

    @Override
    public final void run() {
        switch (this.f42323a) {
            case 0:
                this.f42324b.a(this.f42325c);
                return;
            default:
                this.f42324b.a(this.f42325c);
                return;
        }
    }
}
