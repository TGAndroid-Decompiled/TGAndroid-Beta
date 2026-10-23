package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f34353a;
    public final w f34354b;
    public final String f34355c;

    public c1(w wVar, String str, int i10) {
        this.f34353a = i10;
        this.f34354b = wVar;
        this.f34355c = str;
    }

    @Override
    public final void run() {
        switch (this.f34353a) {
            case 0:
                this.f34354b.run(this.f34355c);
                return;
            default:
                this.f34354b.run(this.f34355c);
                return;
        }
    }
}
