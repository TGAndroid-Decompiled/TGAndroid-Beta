package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19949a;
    public final DownloadController f19950b;

    public z1(DownloadController downloadController, int i10) {
        this.f19949a = i10;
        this.f19950b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19949a) {
            case 0:
                DownloadController.m(this.f19950b);
                return;
            case 1:
                DownloadController.l(this.f19950b);
                return;
            default:
                DownloadController.a(this.f19950b);
                return;
        }
    }
}
