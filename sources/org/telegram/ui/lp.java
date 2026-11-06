package org.telegram.ui;
public final class lp implements Runnable {
    public final int f47570a;
    public final oq f47571b;

    public lp(oq oqVar, int i7) {
        this.f47570a = i7;
        this.f47571b = oqVar;
    }

    @Override
    public final void run() {
        switch (this.f47570a) {
            case 0:
                this.f47571b.w0();
                return;
            default:
                oq oqVar = this.f47571b;
                oqVar.getMessagesController().V2(0, oqVar.M, true);
                return;
        }
    }
}
