package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f22293a;
    public final DownloadController f22294b;

    public z1(DownloadController downloadController, int i10) {
        this.f22293a = i10;
        this.f22294b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f22293a) {
            case 0:
                DownloadController.m(this.f22294b);
                return;
            case 1:
                DownloadController.l(this.f22294b);
                return;
            default:
                DownloadController.a(this.f22294b);
                return;
        }
    }
}
