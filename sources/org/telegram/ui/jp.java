package org.telegram.ui;
public final class jp implements Runnable {
    public final int f46663a;
    public final nq f46664b;

    public jp(nq nqVar, int i3) {
        this.f46663a = i3;
        this.f46664b = nqVar;
    }

    @Override
    public final void run() {
        switch (this.f46663a) {
            case 0:
                this.f46664b.w0();
                return;
            default:
                nq nqVar = this.f46664b;
                nqVar.getMessagesController().V2(0, nqVar.N, true);
                return;
        }
    }
}
