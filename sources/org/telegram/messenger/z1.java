package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19982a;
    public final DownloadController f19983b;

    public z1(DownloadController downloadController, int i10) {
        this.f19982a = i10;
        this.f19983b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19982a) {
            case 0:
                DownloadController.m(this.f19983b);
                return;
            case 1:
                DownloadController.l(this.f19983b);
                return;
            default:
                DownloadController.a(this.f19983b);
                return;
        }
    }
}
