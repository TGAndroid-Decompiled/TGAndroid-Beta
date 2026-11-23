package org.telegram.ui;
public final class op implements Runnable {
    public final int f50640a;
    public final rq f50641b;

    public op(rq rqVar, int i7) {
        this.f50640a = i7;
        this.f50641b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50640a) {
            case 0:
                this.f50641b.w0();
                return;
            default:
                rq rqVar = this.f50641b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
