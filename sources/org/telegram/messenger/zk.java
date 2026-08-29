package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f22385a;
    public final TranslateController f22386b;
    public final long f22387c;

    public zk(TranslateController translateController, long j10, int i10) {
        this.f22385a = i10;
        this.f22386b = translateController;
        this.f22387c = j10;
    }

    @Override
    public final void run() {
        switch (this.f22385a) {
            case 0:
                TranslateController.G(this.f22386b, this.f22387c);
                return;
            default:
                TranslateController.p(this.f22386b, this.f22387c);
                return;
        }
    }
}
