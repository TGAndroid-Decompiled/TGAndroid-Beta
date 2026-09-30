package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18273a;
    public final DownloadController f18274b;

    public z1(DownloadController downloadController, int i10) {
        this.f18273a = i10;
        this.f18274b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                DownloadController.m(this.f18274b);
                return;
            case 1:
                DownloadController.l(this.f18274b);
                return;
            default:
                DownloadController.a(this.f18274b);
                return;
        }
    }
}
