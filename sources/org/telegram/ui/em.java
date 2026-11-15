package org.telegram.ui;
public final class em extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f46858e;
    public final Object f46859f;

    public em(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f46859f = obj;
        this.f46858e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f46859f).f49001a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new zg(5, this, (org.telegram.ui.Cells.t0) this.f46858e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                lm lmVar = (lm) this.f46859f;
                an anVar = lmVar.f49001a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar.Zb = q1Var.getMessageObject().e1();
                an anVar2 = lmVar.f49001a;
                anVar2.f45129ac = 2;
                anVar2.f45144bc = null;
                q1Var.invalidate();
                return;
            case 1:
                lm lmVar2 = (lm) this.f46859f;
                an anVar3 = lmVar2.f49001a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar3.Zb = q1Var2.getMessageObject().e1();
                an anVar4 = lmVar2.f49001a;
                anVar4.f45129ac = 2;
                anVar4.f45144bc = null;
                q1Var2.invalidate();
                return;
            case 2:
                lm lmVar3 = (lm) this.f46859f;
                an anVar5 = lmVar3.f49001a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar5.Zb = q1Var3.getMessageObject().e1();
                an anVar6 = lmVar3.f49001a;
                anVar6.f45129ac = 2;
                anVar6.f45144bc = null;
                q1Var3.invalidate();
                return;
            case 3:
                lm lmVar4 = (lm) this.f46859f;
                an anVar7 = lmVar4.f49001a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar7.Zb = q1Var4.getMessageObject().e1();
                an anVar8 = lmVar4.f49001a;
                anVar8.f45129ac = 2;
                anVar8.f45144bc = null;
                q1Var4.invalidate();
                return;
            case 4:
                lm lmVar5 = (lm) this.f46859f;
                an anVar9 = lmVar5.f49001a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar9.Zb = q1Var5.getMessageObject().e1();
                an anVar10 = lmVar5.f49001a;
                anVar10.f45129ac = 2;
                anVar10.f45144bc = null;
                q1Var5.invalidate();
                return;
            case 5:
                lm lmVar6 = (lm) this.f46859f;
                an anVar11 = lmVar6.f49001a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f46858e;
                anVar11.Zb = q1Var6.getMessageObject().e1();
                an anVar12 = lmVar6.f49001a;
                anVar12.f45129ac = 2;
                anVar12.f45144bc = null;
                q1Var6.invalidate();
                return;
            default:
                el elVar = (el) this.f46859f;
                an anVar13 = elVar.f46852a.R;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f46858e;
                anVar13.Zb = t0Var.getMessageObject().e1();
                an anVar14 = elVar.f46852a.R;
                anVar14.f45129ac = 4;
                anVar14.f45144bc = null;
                t0Var.getMessageObject().f23846r = true;
                t0Var.invalidate();
                return;
        }
    }
}
