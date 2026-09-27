package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18249a;
    public final DownloadController f18250b;

    public z1(DownloadController downloadController, int i10) {
        this.f18249a = i10;
        this.f18250b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18249a) {
            case 0:
                DownloadController.m(this.f18250b);
                return;
            case 1:
                DownloadController.l(this.f18250b);
                return;
            default:
                DownloadController.a(this.f18250b);
                return;
        }
    }
}
