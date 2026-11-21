package org.telegram.ui.Components;
public final class tk implements Runnable {
    public final int f39929a;
    public final zk f39930b;

    public tk(zk zkVar, int i7) {
        this.f39929a = i7;
        this.f39930b = zkVar;
    }

    @Override
    public final void run() {
        switch (this.f39929a) {
            case 0:
                this.f39930b.b0();
                return;
            case 1:
                zk zkVar = this.f39930b;
                EditTextBoldCursor editTextBoldCursor = zkVar.T;
                if (!zkVar.L && !zkVar.O0 && !zkVar.f37521b.J && zkVar.M0 && zkVar.U0 == null && editTextBoldCursor.hasFocus() && zkVar.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                zk zkVar2 = this.f39930b;
                if (!zkVar2.L && zkVar2.M0 && zkVar2.isShown()) {
                    zkVar2.e0();
                    return;
                }
                return;
            case 3:
                zk zkVar3 = this.f39930b;
                if (!zkVar3.L) {
                    float f10 = zkVar3.f42912n0;
                    if (f10 < 1.0f && zkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        zkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f56364m = hVar;
                        zkVar3.m0.f(0.001f);
                        zkVar3.m0.b(new j7(zkVar3, 4));
                        zkVar3.m0.a(new ya(zkVar3, 2));
                        zkVar3.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                zk zkVar4 = this.f39930b;
                if (zkVar4.M0 && !zkVar4.L) {
                    zkVar4.d0();
                    if (zkVar4.N0) {
                        zkVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                zk zkVar5 = this.f39930b;
                if (!zkVar5.f42915q0) {
                    zkVar5.f42914p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
