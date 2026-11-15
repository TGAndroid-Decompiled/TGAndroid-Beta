package org.telegram.ui;
public final class em extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f46866e;
    public final Object f46867f;

    public em(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f46867f = obj;
        this.f46866e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46867f).f49005a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new zg(5, this, (org.telegram.ui.Cells.t0) this.f46866e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                lm lmVar = (lm) this.f46867f;
                an anVar = lmVar.f49005a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar.Zb = q1Var.getMessageObject().e1();
                an anVar2 = lmVar.f49005a;
                anVar2.f45130ac = 2;
                anVar2.f45145bc = null;
                q1Var.invalidate();
                return;
            case 1:
                lm lmVar2 = (lm) this.f46867f;
                an anVar3 = lmVar2.f49005a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar3.Zb = q1Var2.getMessageObject().e1();
                an anVar4 = lmVar2.f49005a;
                anVar4.f45130ac = 2;
                anVar4.f45145bc = null;
                q1Var2.invalidate();
                return;
            case 2:
                lm lmVar3 = (lm) this.f46867f;
                an anVar5 = lmVar3.f49005a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar5.Zb = q1Var3.getMessageObject().e1();
                an anVar6 = lmVar3.f49005a;
                anVar6.f45130ac = 2;
                anVar6.f45145bc = null;
                q1Var3.invalidate();
                return;
            case 3:
                lm lmVar4 = (lm) this.f46867f;
                an anVar7 = lmVar4.f49005a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar7.Zb = q1Var4.getMessageObject().e1();
                an anVar8 = lmVar4.f49005a;
                anVar8.f45130ac = 2;
                anVar8.f45145bc = null;
                q1Var4.invalidate();
                return;
            case 4:
                lm lmVar5 = (lm) this.f46867f;
                an anVar9 = lmVar5.f49005a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar9.Zb = q1Var5.getMessageObject().e1();
                an anVar10 = lmVar5.f49005a;
                anVar10.f45130ac = 2;
                anVar10.f45145bc = null;
                q1Var5.invalidate();
                return;
            case 5:
                lm lmVar6 = (lm) this.f46867f;
                an anVar11 = lmVar6.f49005a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f46866e;
                anVar11.Zb = q1Var6.getMessageObject().e1();
                an anVar12 = lmVar6.f49005a;
                anVar12.f45130ac = 2;
                anVar12.f45145bc = null;
                q1Var6.invalidate();
                return;
            default:
                el elVar = (el) this.f46867f;
                an anVar13 = elVar.f46862a.R;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f46866e;
                anVar13.Zb = t0Var.getMessageObject().e1();
                an anVar14 = elVar.f46862a.R;
                anVar14.f45130ac = 4;
                anVar14.f45145bc = null;
                t0Var.getMessageObject().f23844r = true;
                t0Var.invalidate();
                return;
        }
    }
}
