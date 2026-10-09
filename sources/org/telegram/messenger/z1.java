package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19945a;
    public final DownloadController f19946b;

    public z1(DownloadController downloadController, int i10) {
        this.f19945a = i10;
        this.f19946b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19945a) {
            case 0:
                DownloadController.m(this.f19946b);
                return;
            case 1:
                DownloadController.l(this.f19946b);
                return;
            default:
                DownloadController.a(this.f19946b);
                return;
        }
    }
}
