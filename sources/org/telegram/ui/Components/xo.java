package org.telegram.ui.Components;

import org.telegram.ui.va1;
public final class xo implements Runnable {
    public final int f32951a;
    public final pp f32952b;

    public xo(pp ppVar, int i10) {
        this.f32951a = i10;
        this.f32952b = ppVar;
    }

    @Override
    public final void run() {
        switch (this.f32951a) {
            case 0:
                this.f32952b.h.l();
                return;
            case 1:
                this.f32952b.s(true);
                return;
            case 2:
                pp ppVar = this.f32952b;
                org.telegram.ui.yn ynVar = ppVar.v;
                org.telegram.ui.ActionBar.n2 b02 = va1.b0(ynVar.getMessagesController().getChat(Long.valueOf(-ynVar.a())), true);
                ?? obj = new Object();
                obj.f21349a = true;
                b02.setResourceProvider(ynVar.getResourceProvider());
                obj.f21351c = new uh(2);
                obj.d = new xo(ppVar, 3);
                obj.f21350b = new xo(ppVar, 4);
                obj.f21352e = true;
                ppVar.X = b02;
                ynVar.showAsSheet(b02, obj);
                return;
            case 3:
                this.f32952b.u();
                return;
            case 4:
                this.f32952b.X = null;
                return;
            case 5:
                this.f32952b.u();
                return;
            case 6:
                this.f32952b.X = null;
                return;
            default:
                pp ppVar2 = this.f32952b;
                ppVar2.U.f(ppVar2.G, true);
                return;
        }
    }
}
