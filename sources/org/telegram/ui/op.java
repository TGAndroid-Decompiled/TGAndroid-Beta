package org.telegram.ui;
public final class op implements Runnable {
    public final int f50738a;
    public final rq f50739b;

    public op(rq rqVar, int i7) {
        this.f50738a = i7;
        this.f50739b = rqVar;
    }

    @Override
    public final void run() {
        switch (this.f50738a) {
            case 0:
                this.f50739b.w0();
                return;
            default:
                rq rqVar = this.f50739b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                return;
        }
    }
}
