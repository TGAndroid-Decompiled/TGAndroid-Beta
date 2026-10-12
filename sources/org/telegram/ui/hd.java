package org.telegram.ui;
public final class hd implements Runnable {
    public final int f38329a;
    public final qd f38330b;

    public hd(qd qdVar, int i10) {
        this.f38329a = i10;
        this.f38330b = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f38329a) {
            case 0:
                qd qdVar = this.f38330b;
                qdVar.f41284j0 = true;
                qdVar.h0();
                return;
            case 1:
                qd qdVar2 = this.f38330b;
                qdVar2.f41301x = null;
                qdVar2.f41302y = null;
                qdVar2.f41286l0 = null;
                qdVar2.m0 = null;
                qdVar2.f41289o0 = null;
                qdVar2.f41288n0 = null;
                qdVar2.f41290p0 = 0.0d;
                qdVar2.e0(false, true);
                qdVar2.f41277e.h(null, null, qdVar2.f41294s, null);
                qdVar2.h.setAnimation(qdVar2.J);
                qdVar2.J.M(0);
                return;
            case 2:
                this.f38330b.g0(true);
                return;
            default:
                qd qdVar3 = this.f38330b;
                qdVar3.f41284j0 = true;
                if (qdVar3.f41299w.length() > 0) {
                    qdVar3.d0(qdVar3.f41299w.getText().toString());
                }
                qdVar3.h0();
                return;
        }
    }
}
