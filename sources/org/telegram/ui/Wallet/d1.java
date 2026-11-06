package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f42298a;
    public final t f42299b;
    public final String f42300c;

    public d1(t tVar, String str, int i7) {
        this.f42298a = i7;
        this.f42299b = tVar;
        this.f42300c = str;
    }

    @Override
    public final void run() {
        switch (this.f42298a) {
            case 0:
                this.f42299b.a(this.f42300c);
                return;
            default:
                this.f42299b.a(this.f42300c);
                return;
        }
    }
}
