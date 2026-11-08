package org.telegram.ui;
public final class lp implements Runnable {
    public final int f47567a;
    public final oq f47568b;

    public lp(oq oqVar, int i7) {
        this.f47567a = i7;
        this.f47568b = oqVar;
    }

    @Override
    public final void run() {
        switch (this.f47567a) {
            case 0:
                this.f47568b.w0();
                return;
            default:
                oq oqVar = this.f47568b;
                oqVar.getMessagesController().V2(0, oqVar.M, true);
                return;
        }
    }
}
