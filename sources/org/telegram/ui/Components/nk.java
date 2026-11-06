package org.telegram.ui.Components;
public final class nk implements Runnable {
    public final int f36323a;
    public final wk f36324b;
    public final org.telegram.messenger.za f36325c;

    public nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f36323a = i7;
        this.f36324b = wkVar;
        this.f36325c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f36323a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f36325c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.f36324b, zaVar, 1));
                return;
            default:
                wk.R(this.f36324b, this.f36325c);
                return;
        }
    }
}
