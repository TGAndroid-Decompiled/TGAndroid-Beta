package org.telegram.ui.Components;
public final class nk implements Runnable {
    public final int f36362a;
    public final wk f36363b;
    public final org.telegram.messenger.za f36364c;

    public nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f36362a = i7;
        this.f36363b = wkVar;
        this.f36364c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f36362a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f36364c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.f36363b, zaVar, 1));
                return;
            default:
                wk.R(this.f36363b, this.f36364c);
                return;
        }
    }
}
