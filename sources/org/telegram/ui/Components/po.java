package org.telegram.ui.Components;

import org.telegram.ui.oa1;
public final class po implements Runnable {
    public final int f27972a;
    public final jp f27973b;

    public po(jp jpVar, int i10) {
        this.f27972a = i10;
        this.f27973b = jpVar;
    }

    @Override
    public final void run() {
        switch (this.f27972a) {
            case 0:
                this.f27973b.h.l();
                return;
            case 1:
                this.f27973b.s(true);
                return;
            case 2:
                jp jpVar = this.f27973b;
                org.telegram.ui.zn znVar = jpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = oa1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f20453a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f20455c = new mc(5);
                obj.d = new po(jpVar, 3);
                obj.f20454b = new po(jpVar, 4);
                obj.e = true;
                jpVar.U = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f27973b.u();
                return;
            case 4:
                this.f27973b.U = null;
                return;
            case 5:
                this.f27973b.u();
                return;
            case 6:
                this.f27973b.U = null;
                return;
            default:
                jp jpVar2 = this.f27973b;
                jpVar2.R.f(jpVar2.D, true);
                return;
        }
    }
}
