package org.telegram.ui;
public final class np implements Runnable {
    public final int f48241a;
    public final rq f48242b;

    public np(rq rqVar, int i7) {
        this.f48241a = i7;
        this.f48242b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f48241a) {
            case 0:
                this.f48242b.w0();
                return;
            default:
                rq rqVar = this.f48242b;
                rqVar.getMessagesController().V2(0, rqVar.M, true);
                return;
        }
    }
}
