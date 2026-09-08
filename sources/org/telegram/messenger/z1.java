package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19795a;
    public final DownloadController f19796b;
    public final MessageObject f19797c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19795a = i10;
        this.f19796b = downloadController;
        this.f19797c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19795a) {
            case 0:
                this.f19796b.lambda$startDownloadFile$4(this.f19797c);
                return;
            case 1:
                this.f19796b.lambda$onDownloadFail$9(this.f19797c);
                return;
            default:
                this.f19796b.lambda$onDownloadComplete$6(this.f19797c);
                return;
        }
    }
}
