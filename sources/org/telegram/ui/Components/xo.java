package org.telegram.ui.Components;

import org.telegram.ui.va1;
public final class xo implements Runnable {
    public final int f32952a;
    public final pp f32953b;

    public xo(pp ppVar, int i10) {
        this.f32952a = i10;
        this.f32953b = ppVar;
    }

    @Override
    public final void run() {
        switch (this.f32952a) {
            case 0:
                this.f32953b.h.l();
                return;
            case 1:
                this.f32953b.s(true);
                return;
            case 2:
                pp ppVar = this.f32953b;
                org.telegram.ui.yn ynVar = ppVar.v;
                org.telegram.ui.ActionBar.n2 b02 = va1.b0(ynVar.getMessagesController().getChat(Long.valueOf(-ynVar.a())), true);
                ?? obj = new Object();
                obj.f21350a = true;
                b02.setResourceProvider(ynVar.getResourceProvider());
                obj.f21352c = new uh(2);
                obj.d = new xo(ppVar, 3);
                obj.f21351b = new xo(ppVar, 4);
                obj.f21353e = true;
                ppVar.X = b02;
                ynVar.showAsSheet(b02, obj);
                return;
            case 3:
                this.f32953b.u();
                return;
            case 4:
                this.f32953b.X = null;
                return;
            case 5:
                this.f32953b.u();
                return;
            case 6:
                this.f32953b.X = null;
                return;
            default:
                pp ppVar2 = this.f32953b;
                ppVar2.U.f(ppVar2.G, true);
                return;
        }
    }
}
