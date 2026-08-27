package org.telegram.ui.Components;

import org.telegram.ui.q91;

public final class io implements Runnable {

    public final int f29451a;

    public final ap f29452b;

    public io(ap apVar, int i10) {
        this.f29451a = i10;
        this.f29452b = apVar;
    }

    @Override
    public final void run() {
        switch (this.f29451a) {
            case 0:
                this.f29452b.h.l();
                break;
            case 1:
                this.f29452b.t(true);
                break;
            case 2:
                ap apVar = this.f29452b;
                org.telegram.ui.rn rnVar = apVar.v;
                org.telegram.ui.ActionBar.n2 n2VarD0 = q91.d0(rnVar.getMessagesController().getChat(Long.valueOf(-rnVar.a())), true);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                n2VarD0.setResourceProvider(rnVar.getResourceProvider());
                l2Var.f23621c = new gc(6);
                l2Var.d = new io(apVar, 3);
                l2Var.f23620b = new io(apVar, 4);
                l2Var.f23622e = true;
                apVar.T = n2VarD0;
                rnVar.showAsSheet(n2VarD0, l2Var);
                break;
            case 3:
                this.f29452b.v();
                break;
            case 4:
                this.f29452b.T = null;
                break;
            case 5:
                this.f29452b.v();
                break;
            case 6:
                this.f29452b.T = null;
                break;
            default:
                ap apVar2 = this.f29452b;
                apVar2.Q.f(apVar2.C, true);
                break;
        }
    }
}
