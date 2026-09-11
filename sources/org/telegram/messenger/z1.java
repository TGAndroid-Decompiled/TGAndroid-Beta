package org.telegram.messenger;
public final class z1 implements Runnable {
    public final int f19789a;
    public final DownloadController f19790b;
    public final MessageObject f19791c;

    public z1(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19789a = i10;
        this.f19790b = downloadController;
        this.f19791c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19789a) {
            case 0:
                this.f19790b.lambda$startDownloadFile$4(this.f19791c);
                return;
            case 1:
                this.f19790b.lambda$onDownloadFail$9(this.f19791c);
                return;
            default:
                this.f19790b.lambda$onDownloadComplete$6(this.f19791c);
                return;
        }
    }
}
