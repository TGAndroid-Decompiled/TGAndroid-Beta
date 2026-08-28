package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f22288a;
    public final DownloadController f22289b;

    public z1(DownloadController downloadController, int i9) {
        this.f22288a = i9;
        this.f22289b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f22288a) {
            case 0:
                DownloadController.m(this.f22289b);
                return;
            case 1:
                DownloadController.l(this.f22289b);
                return;
            default:
                DownloadController.a(this.f22289b);
                return;
        }
    }
}
