package org.telegram.ui.Components;
public final class nk implements Runnable {
    public final int f36378a;
    public final wk f36379b;
    public final org.telegram.messenger.za f36380c;

    public nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f36378a = i7;
        this.f36379b = wkVar;
        this.f36380c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f36378a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f36380c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.f36379b, zaVar, 1));
                return;
            default:
                wk.R(this.f36379b, this.f36380c);
                return;
        }
    }
}
