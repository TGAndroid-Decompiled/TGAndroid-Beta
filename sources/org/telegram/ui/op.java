package org.telegram.ui;
public final class op implements Runnable {
    public final int f50612a;
    public final rq f50613b;

    public op(rq rqVar, int i7) {
        this.f50612a = i7;
        this.f50613b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50612a) {
            case 0:
                this.f50613b.w0();
                return;
            default:
                rq rqVar = this.f50613b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
