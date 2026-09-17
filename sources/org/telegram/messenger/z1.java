package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18030a;
    public final DownloadController f18031b;
    public final MessageObject f18032c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18030a = i10;
        this.f18031b = downloadController;
        this.f18032c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                this.f18031b.lambda$startDownloadFile$4(this.f18032c);
                return;
            case 1:
                this.f18031b.lambda$onDownloadFail$9(this.f18032c);
                return;
            default:
                this.f18031b.lambda$onDownloadComplete$6(this.f18032c);
                return;
        }
    }
}
