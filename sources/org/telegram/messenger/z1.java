package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18204a;
    public final DownloadController f18205b;
    public final MessageObject f18206c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18204a = i10;
        this.f18205b = downloadController;
        this.f18206c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18204a) {
            case 0:
                this.f18205b.lambda$startDownloadFile$4(this.f18206c);
                return;
            case 1:
                this.f18205b.lambda$onDownloadFail$9(this.f18206c);
                return;
            default:
                this.f18205b.lambda$onDownloadComplete$6(this.f18206c);
                return;
        }
    }
}
