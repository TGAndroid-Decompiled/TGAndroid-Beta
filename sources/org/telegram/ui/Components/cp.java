package org.telegram.ui.Components;
public final class cp implements Runnable {
    public final int f25406a;
    public final up f25407b;

    public cp(up upVar, int i10) {
        this.f25406a = i10;
        this.f25407b = upVar;
    }

    @Override
    public final void run() {
        switch (this.f25406a) {
            case 0:
                this.f25407b.h.l();
                return;
            case 1:
                this.f25407b.v(true);
                return;
            case 2:
                up upVar = this.f25407b;
                org.telegram.ui.sn snVar = upVar.v;
                org.telegram.ui.ActionBar.o2 d02 = org.telegram.ui.t91.d0(snVar.getMessagesController().getChat(Long.valueOf(-snVar.a())), true);
                ?? obj = new Object();
                obj.f21637a = true;
                d02.setResourceProvider(snVar.getResourceProvider());
                obj.f21639c = new pc(7);
                obj.d = new cp(upVar, 3);
                obj.f21638b = new cp(upVar, 4);
                obj.e = true;
                upVar.W = d02;
                snVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f25407b.z();
                return;
            case 4:
                this.f25407b.W = null;
                return;
            case 5:
                this.f25407b.z();
                return;
            case 6:
                this.f25407b.W = null;
                return;
            default:
                up upVar2 = this.f25407b;
                upVar2.T.f(upVar2.F, true);
                return;
        }
    }
}
