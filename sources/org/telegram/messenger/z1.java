package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18007a;
    public final DownloadController f18008b;

    public z1(DownloadController downloadController, int i10) {
        this.f18007a = i10;
        this.f18008b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18007a) {
            case 0:
                DownloadController.m(this.f18008b);
                return;
            case 1:
                DownloadController.l(this.f18008b);
                return;
            default:
                DownloadController.a(this.f18008b);
                return;
        }
    }
}
