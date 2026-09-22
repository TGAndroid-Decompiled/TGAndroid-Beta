package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f18018a;
    public final DownloadController f18019b;
    public final MessageObject f18020c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18018a = i10;
        this.f18019b = downloadController;
        this.f18020c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18018a) {
            case 0:
                this.f18019b.lambda$startDownloadFile$4(this.f18020c);
                return;
            case 1:
                this.f18019b.lambda$onDownloadFail$9(this.f18020c);
                return;
            default:
                this.f18019b.lambda$onDownloadComplete$6(this.f18020c);
                return;
        }
    }
}
