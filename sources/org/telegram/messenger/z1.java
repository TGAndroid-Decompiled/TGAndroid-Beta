package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19963a;
    public final DownloadController f19964b;

    public z1(DownloadController downloadController, int i10) {
        this.f19963a = i10;
        this.f19964b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19963a) {
            case 0:
                DownloadController.m(this.f19964b);
                return;
            case 1:
                DownloadController.l(this.f19964b);
                return;
            default:
                DownloadController.a(this.f19964b);
                return;
        }
    }
}
