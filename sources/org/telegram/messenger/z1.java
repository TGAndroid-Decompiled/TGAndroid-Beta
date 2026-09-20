package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18247a;
    public final DownloadController f18248b;
    public final MessageObject f18249c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18247a = i10;
        this.f18248b = downloadController;
        this.f18249c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                this.f18248b.lambda$startDownloadFile$4(this.f18249c);
                return;
            case 1:
                this.f18248b.lambda$onDownloadFail$9(this.f18249c);
                return;
            default:
                this.f18248b.lambda$onDownloadComplete$6(this.f18249c);
                return;
        }
    }
}
