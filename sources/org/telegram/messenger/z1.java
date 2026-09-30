package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18258a;
    public final DownloadController f18259b;

    public z1(DownloadController downloadController, int i10) {
        this.f18258a = i10;
        this.f18259b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18258a) {
            case 0:
                DownloadController.m(this.f18259b);
                return;
            case 1:
                DownloadController.l(this.f18259b);
                return;
            default:
                DownloadController.a(this.f18259b);
                return;
        }
    }
}
