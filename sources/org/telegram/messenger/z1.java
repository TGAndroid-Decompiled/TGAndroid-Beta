package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18021a;
    public final DownloadController f18022b;
    public final MessageObject f18023c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18021a = i10;
        this.f18022b = downloadController;
        this.f18023c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                this.f18022b.lambda$startDownloadFile$4(this.f18023c);
                return;
            case 1:
                this.f18022b.lambda$onDownloadFail$9(this.f18023c);
                return;
            default:
                this.f18022b.lambda$onDownloadComplete$6(this.f18023c);
                return;
        }
    }
}
