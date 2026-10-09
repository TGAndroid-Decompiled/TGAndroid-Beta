package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36928a;
    public final md f36929b;

    public dd(md mdVar, int i10) {
        this.f36928a = i10;
        this.f36929b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36928a) {
            case 0:
                md mdVar = this.f36929b;
                mdVar.f39850j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36929b;
                mdVar2.f39867x = null;
                mdVar2.f39868y = null;
                mdVar2.f39852l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39855o0 = null;
                mdVar2.f39854n0 = null;
                mdVar2.f39856p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f39843e.h(null, null, mdVar2.f39860s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36929b.g0(true);
                return;
            default:
                md mdVar3 = this.f36929b;
                mdVar3.f39850j0 = true;
                if (mdVar3.f39865w.length() > 0) {
                    mdVar3.d0(mdVar3.f39865w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
