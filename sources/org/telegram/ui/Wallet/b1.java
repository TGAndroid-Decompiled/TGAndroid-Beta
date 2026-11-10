package org.telegram.ui.Wallet;
public final class b1 implements Runnable {
    public final int f42164a;
    public final s f42165b;
    public final String f42166c;

    public b1(s sVar, String str, int i7) {
        this.f42164a = i7;
        this.f42165b = sVar;
        this.f42166c = str;
    }

    @Override
    public final void run() {
        switch (this.f42164a) {
            case 0:
                this.f42165b.a(this.f42166c);
                return;
            default:
                this.f42165b.a(this.f42166c);
                return;
        }
    }
}
