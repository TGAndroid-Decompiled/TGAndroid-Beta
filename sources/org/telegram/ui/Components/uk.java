package org.telegram.ui.Components;
public final class uk implements Runnable {
    public final int f40092a;
    public final dl f40093b;
    public final org.telegram.messenger.ya f40094c;

    public uk(dl dlVar, org.telegram.messenger.ya yaVar, int i7) {
        this.f40092a = i7;
        this.f40093b = dlVar;
        this.f40094c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f40092a) {
            case 0:
                org.telegram.messenger.ya yaVar = this.f40094c;
                try {
                    ((a8.r7) yaVar).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new uk(this.f40093b, yaVar, 1));
                return;
            default:
                dl.S(this.f40093b, this.f40094c);
                return;
        }
    }
}
