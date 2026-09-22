package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18262a;
    public final DownloadController f18263b;
    public final MessageObject f18264c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18262a = i10;
        this.f18263b = downloadController;
        this.f18264c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18262a) {
            case 0:
                this.f18263b.lambda$startDownloadFile$4(this.f18264c);
                return;
            case 1:
                this.f18263b.lambda$onDownloadFail$9(this.f18264c);
                return;
            default:
                this.f18263b.lambda$onDownloadComplete$6(this.f18264c);
                return;
        }
    }
}
