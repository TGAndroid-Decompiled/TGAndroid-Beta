package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19948a;
    public final DownloadController f19949b;

    public z1(DownloadController downloadController, int i10) {
        this.f19948a = i10;
        this.f19949b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                DownloadController.m(this.f19949b);
                return;
            case 1:
                DownloadController.l(this.f19949b);
                return;
            default:
                DownloadController.a(this.f19949b);
                return;
        }
    }
}
