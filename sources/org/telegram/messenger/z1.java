package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19816a;
    public final DownloadController f19817b;
    public final MessageObject f19818c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19816a = i10;
        this.f19817b = downloadController;
        this.f19818c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19816a) {
            case 0:
                this.f19817b.lambda$startDownloadFile$4(this.f19818c);
                return;
            case 1:
                this.f19817b.lambda$onDownloadFail$9(this.f19818c);
                return;
            default:
                this.f19817b.lambda$onDownloadComplete$6(this.f19818c);
                return;
        }
    }
}
