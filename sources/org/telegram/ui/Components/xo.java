package org.telegram.ui.Components;

import org.telegram.ui.ta1;
public final class xo implements Runnable {
    public final int f33049a;
    public final pp f33050b;

    public xo(pp ppVar, int i10) {
        this.f33049a = i10;
        this.f33050b = ppVar;
    }

    @Override
    public final void run() {
        switch (this.f33049a) {
            case 0:
                this.f33050b.h.l();
                return;
            case 1:
                this.f33050b.s(true);
                return;
            case 2:
                pp ppVar = this.f33050b;
                org.telegram.ui.yn ynVar = ppVar.v;
                org.telegram.ui.ActionBar.n2 b02 = ta1.b0(ynVar.getMessagesController().getChat(Long.valueOf(-ynVar.a())), true);
                ?? obj = new Object();
                obj.f21358a = true;
                b02.setResourceProvider(ynVar.getResourceProvider());
                obj.f21360c = new uh(2);
                obj.d = new xo(ppVar, 3);
                obj.f21359b = new xo(ppVar, 4);
                obj.f21361e = true;
                ppVar.X = b02;
                ynVar.showAsSheet(b02, obj);
                return;
            case 3:
                this.f33050b.u();
                return;
            case 4:
                this.f33050b.X = null;
                return;
            case 5:
                this.f33050b.u();
                return;
            case 6:
                this.f33050b.X = null;
                return;
            default:
                pp ppVar2 = this.f33050b;
                ppVar2.U.f(ppVar2.G, true);
                return;
        }
    }
}
