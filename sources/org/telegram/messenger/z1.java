package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18255a;
    public final DownloadController f18256b;

    public z1(DownloadController downloadController, int i10) {
        this.f18255a = i10;
        this.f18256b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18255a) {
            case 0:
                DownloadController.m(this.f18256b);
                return;
            case 1:
                DownloadController.l(this.f18256b);
                return;
            default:
                DownloadController.a(this.f18256b);
                return;
        }
    }
}
