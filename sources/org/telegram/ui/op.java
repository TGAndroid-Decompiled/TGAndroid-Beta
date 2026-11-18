package org.telegram.ui;
public final class op implements Runnable {
    public final int f50603a;
    public final rq f50604b;

    public op(rq rqVar, int i7) {
        this.f50603a = i7;
        this.f50604b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50603a) {
            case 0:
                this.f50604b.w0();
                return;
            default:
                rq rqVar = this.f50604b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
