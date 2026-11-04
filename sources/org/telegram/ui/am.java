package org.telegram.ui;
public final class am extends sf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f43796e;
    public final Object f43797f;

    public am(Object obj, org.telegram.ui.Cells.z zVar, int i3) {
        this.d = i3;
        this.f43797f = obj;
        this.f43796e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.f43797f).f45934a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new sc(21, this, (org.telegram.ui.Cells.t0) this.f43796e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                hm hmVar = (hm) this.f43797f;
                wm wmVar = hmVar.f45934a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar.Xb = q1Var.getMessageObject().f1();
                wm wmVar2 = hmVar.f45934a;
                wmVar2.Yb = 2;
                wmVar2.Zb = null;
                q1Var.invalidate();
                return;
            case 1:
                hm hmVar2 = (hm) this.f43797f;
                wm wmVar3 = hmVar2.f45934a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar3.Xb = q1Var2.getMessageObject().f1();
                wm wmVar4 = hmVar2.f45934a;
                wmVar4.Yb = 2;
                wmVar4.Zb = null;
                q1Var2.invalidate();
                return;
            case 2:
                hm hmVar3 = (hm) this.f43797f;
                wm wmVar5 = hmVar3.f45934a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar5.Xb = q1Var3.getMessageObject().f1();
                wm wmVar6 = hmVar3.f45934a;
                wmVar6.Yb = 2;
                wmVar6.Zb = null;
                q1Var3.invalidate();
                return;
            case 3:
                hm hmVar4 = (hm) this.f43797f;
                wm wmVar7 = hmVar4.f45934a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar7.Xb = q1Var4.getMessageObject().f1();
                wm wmVar8 = hmVar4.f45934a;
                wmVar8.Yb = 2;
                wmVar8.Zb = null;
                q1Var4.invalidate();
                return;
            case 4:
                hm hmVar5 = (hm) this.f43797f;
                wm wmVar9 = hmVar5.f45934a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar9.Xb = q1Var5.getMessageObject().f1();
                wm wmVar10 = hmVar5.f45934a;
                wmVar10.Yb = 2;
                wmVar10.Zb = null;
                q1Var5.invalidate();
                return;
            case 5:
                hm hmVar6 = (hm) this.f43797f;
                wm wmVar11 = hmVar6.f45934a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f43796e;
                wmVar11.Xb = q1Var6.getMessageObject().f1();
                wm wmVar12 = hmVar6.f45934a;
                wmVar12.Yb = 2;
                wmVar12.Zb = null;
                q1Var6.invalidate();
                return;
            default:
                al alVar = (al) this.f43797f;
                wm wmVar13 = alVar.f43794a.R;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f43796e;
                wmVar13.Xb = t0Var.getMessageObject().f1();
                wm wmVar14 = alVar.f43794a.R;
                wmVar14.Yb = 4;
                wmVar14.Zb = null;
                t0Var.getMessageObject().f26893r = true;
                t0Var.invalidate();
                return;
        }
    }
}
