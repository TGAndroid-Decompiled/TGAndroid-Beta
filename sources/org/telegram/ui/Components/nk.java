package org.telegram.ui.Components;
public final class nk implements Runnable {
    public final int f36388a;
    public final wk f36389b;
    public final org.telegram.messenger.za f36390c;

    public nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f36388a = i7;
        this.f36389b = wkVar;
        this.f36390c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f36388a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f36390c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.f36389b, zaVar, 1));
                return;
            default:
                wk.R(this.f36389b, this.f36390c);
                return;
        }
    }
}
