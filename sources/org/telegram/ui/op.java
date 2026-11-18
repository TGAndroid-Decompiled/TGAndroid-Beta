package org.telegram.ui;
public final class op implements Runnable {
    public final int f50647a;
    public final rq f50648b;

    public op(rq rqVar, int i7) {
        this.f50647a = i7;
        this.f50648b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50647a) {
            case 0:
                this.f50648b.w0();
                return;
            default:
                rq rqVar = this.f50648b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
