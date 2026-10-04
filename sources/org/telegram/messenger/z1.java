package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19958a;
    public final DownloadController f19959b;

    public z1(DownloadController downloadController, int i10) {
        this.f19958a = i10;
        this.f19959b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19958a) {
            case 0:
                DownloadController.m(this.f19959b);
                return;
            case 1:
                DownloadController.l(this.f19959b);
                return;
            default:
                DownloadController.a(this.f19959b);
                return;
        }
    }
}
