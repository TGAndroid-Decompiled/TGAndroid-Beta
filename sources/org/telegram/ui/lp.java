package org.telegram.ui;
public final class lp implements Runnable {
    public final int f47571a;
    public final oq f47572b;

    public lp(oq oqVar, int i7) {
        this.f47571a = i7;
        this.f47572b = oqVar;
    }

    @Override
    public final void run() {
        switch (this.f47571a) {
            case 0:
                this.f47572b.w0();
                return;
            default:
                oq oqVar = this.f47572b;
                oqVar.getMessagesController().V2(0, oqVar.M, true);
                return;
        }
    }
}
