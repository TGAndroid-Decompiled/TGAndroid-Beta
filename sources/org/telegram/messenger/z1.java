package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18256a;
    public final DownloadController f18257b;

    public z1(DownloadController downloadController, int i10) {
        this.f18256a = i10;
        this.f18257b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18256a) {
            case 0:
                DownloadController.m(this.f18257b);
                return;
            case 1:
                DownloadController.l(this.f18257b);
                return;
            default:
                DownloadController.a(this.f18257b);
                return;
        }
    }
}
