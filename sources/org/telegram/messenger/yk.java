package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f20182a;
    public final TranslateController f20183b;
    public final long f20184c;

    public yk(TranslateController translateController, long j10, int i10) {
        this.f20182a = i10;
        this.f20183b = translateController;
        this.f20184c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20182a) {
            case 0:
                TranslateController.G(this.f20183b, this.f20184c);
                return;
            default:
                TranslateController.p(this.f20183b, this.f20184c);
                return;
        }
    }
}
