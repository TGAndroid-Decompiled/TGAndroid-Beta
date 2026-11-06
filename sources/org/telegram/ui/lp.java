package org.telegram.ui;
public final class lp implements Runnable {
    public final int f47543a;
    public final oq f47544b;

    public lp(oq oqVar, int i7) {
        this.f47543a = i7;
        this.f47544b = oqVar;
    }

    @Override
    public final void run() {
        switch (this.f47543a) {
            case 0:
                this.f47544b.w0();
                return;
            default:
                oq oqVar = this.f47544b;
                oqVar.getMessagesController().V2(0, oqVar.M, true);
                return;
        }
    }
}
