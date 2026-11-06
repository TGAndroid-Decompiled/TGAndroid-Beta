package org.telegram.ui;
public final class em extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f45374e;
    public final Object f45375f;

    public em(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f45375f = obj;
        this.f45374e = zVar;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f45375f).f47560a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new qf(16, this, (org.telegram.ui.Cells.t0) this.f45374e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                lm lmVar = (lm) this.f45375f;
                an anVar = lmVar.f47560a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar.Wb = q1Var.getMessageObject().f1();
                an anVar2 = lmVar.f47560a;
                anVar2.Xb = 2;
                anVar2.Yb = null;
                q1Var.invalidate();
                return;
            case 1:
                lm lmVar2 = (lm) this.f45375f;
                an anVar3 = lmVar2.f47560a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar3.Wb = q1Var2.getMessageObject().f1();
                an anVar4 = lmVar2.f47560a;
                anVar4.Xb = 2;
                anVar4.Yb = null;
                q1Var2.invalidate();
                return;
            case 2:
                lm lmVar3 = (lm) this.f45375f;
                an anVar5 = lmVar3.f47560a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar5.Wb = q1Var3.getMessageObject().f1();
                an anVar6 = lmVar3.f47560a;
                anVar6.Xb = 2;
                anVar6.Yb = null;
                q1Var3.invalidate();
                return;
            case 3:
                lm lmVar4 = (lm) this.f45375f;
                an anVar7 = lmVar4.f47560a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar7.Wb = q1Var4.getMessageObject().f1();
                an anVar8 = lmVar4.f47560a;
                anVar8.Xb = 2;
                anVar8.Yb = null;
                q1Var4.invalidate();
                return;
            case 4:
                lm lmVar5 = (lm) this.f45375f;
                an anVar9 = lmVar5.f47560a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar9.Wb = q1Var5.getMessageObject().f1();
                an anVar10 = lmVar5.f47560a;
                anVar10.Xb = 2;
                anVar10.Yb = null;
                q1Var5.invalidate();
                return;
            case 5:
                lm lmVar6 = (lm) this.f45375f;
                an anVar11 = lmVar6.f47560a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f45374e;
                anVar11.Wb = q1Var6.getMessageObject().f1();
                an anVar12 = lmVar6.f47560a;
                anVar12.Xb = 2;
                anVar12.Yb = null;
                q1Var6.invalidate();
                return;
            default:
                el elVar = (el) this.f45375f;
                an anVar13 = elVar.f45372a.Q;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f45374e;
                anVar13.Wb = t0Var.getMessageObject().f1();
                an anVar14 = elVar.f45372a.Q;
                anVar14.Xb = 4;
                anVar14.Yb = null;
                t0Var.getMessageObject().f23269r = true;
                t0Var.invalidate();
                return;
        }
    }
}
