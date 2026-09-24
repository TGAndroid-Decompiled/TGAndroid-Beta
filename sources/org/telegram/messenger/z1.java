package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18241a;
    public final DownloadController f18242b;

    public z1(DownloadController downloadController, int i10) {
        this.f18241a = i10;
        this.f18242b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                DownloadController.m(this.f18242b);
                return;
            case 1:
                DownloadController.l(this.f18242b);
                return;
            default:
                DownloadController.a(this.f18242b);
                return;
        }
    }
}
