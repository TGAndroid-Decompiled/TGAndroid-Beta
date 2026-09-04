package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19768a;
    public final DownloadController f19769b;
    public final MessageObject f19770c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19768a = i10;
        this.f19769b = downloadController;
        this.f19770c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19768a) {
            case 0:
                this.f19769b.lambda$startDownloadFile$4(this.f19770c);
                return;
            case 1:
                this.f19769b.lambda$onDownloadFail$9(this.f19770c);
                return;
            default:
                this.f19769b.lambda$onDownloadComplete$6(this.f19770c);
                return;
        }
    }
}
