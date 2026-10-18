package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f20179a;
    public final TranslateController f20180b;
    public final long f20181c;

    public yk(TranslateController translateController, long j10, int i10) {
        this.f20179a = i10;
        this.f20180b = translateController;
        this.f20181c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20179a) {
            case 0:
                TranslateController.G(this.f20180b, this.f20181c);
                return;
            default:
                TranslateController.p(this.f20180b, this.f20181c);
                return;
        }
    }
}
