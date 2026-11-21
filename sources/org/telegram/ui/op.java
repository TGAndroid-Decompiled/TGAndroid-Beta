package org.telegram.ui;
public final class op implements Runnable {
    public final int f50636a;
    public final rq f50637b;

    public op(rq rqVar, int i7) {
        this.f50636a = i7;
        this.f50637b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50636a) {
            case 0:
                this.f50637b.w0();
                return;
            default:
                rq rqVar = this.f50637b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
