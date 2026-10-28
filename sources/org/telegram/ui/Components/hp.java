package org.telegram.ui.Components;
public final class hp implements Runnable {
    public final int f29044a;
    public final zp f29045b;

    public hp(zp zpVar, int i10) {
        this.f29044a = i10;
        this.f29045b = zpVar;
    }

    @Override
    public final void run() {
        switch (this.f29044a) {
            case 0:
                this.f29045b.h.l();
                return;
            case 1:
                this.f29045b.u(true);
                return;
            case 2:
                zp zpVar = this.f29045b;
                org.telegram.ui.wn wnVar = zpVar.v;
                org.telegram.ui.ActionBar.r2 c02 = org.telegram.ui.y91.c0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                ?? obj = new Object();
                obj.f22929a = true;
                c02.setResourceProvider(wnVar.getResourceProvider());
                obj.f22931c = new k5(9);
                obj.d = new hp(zpVar, 3);
                obj.f22930b = new hp(zpVar, 4);
                obj.e = true;
                zpVar.W = c02;
                wnVar.showAsSheet(c02, obj);
                return;
            case 3:
                this.f29045b.y();
                return;
            case 4:
                this.f29045b.W = null;
                return;
            case 5:
                this.f29045b.y();
                return;
            case 6:
                this.f29045b.W = null;
                return;
            default:
                zp zpVar2 = this.f29045b;
                zpVar2.T.f(zpVar2.F, true);
                return;
        }
    }
}
