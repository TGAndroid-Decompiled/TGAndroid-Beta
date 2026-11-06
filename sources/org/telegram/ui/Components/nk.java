package org.telegram.ui.Components;
public final class nk implements Runnable {
    public final int f36429a;
    public final wk f36430b;
    public final org.telegram.messenger.za f36431c;

    public nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f36429a = i7;
        this.f36430b = wkVar;
        this.f36431c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f36429a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f36431c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.f36430b, zaVar, 1));
                return;
            default:
                wk.R(this.f36430b, this.f36431c);
                return;
        }
    }
}
