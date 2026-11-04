package org.telegram.ui.Components;
public final class lk implements Runnable {
    public final int f35782a;
    public final uk f35783b;
    public final org.telegram.messenger.sa f35784c;

    public lk(uk ukVar, org.telegram.messenger.sa saVar, int i3) {
        this.f35782a = i3;
        this.f35783b = ukVar;
        this.f35784c = saVar;
    }

    @Override
    public final void run() {
        switch (this.f35782a) {
            case 0:
                org.telegram.messenger.sa saVar = this.f35784c;
                try {
                    ((b8.ke) saVar).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new lk(this.f35783b, saVar, 1));
                return;
            default:
                uk.R(this.f35783b, this.f35784c);
                return;
        }
    }
}
