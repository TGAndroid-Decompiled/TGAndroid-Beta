package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class an extends qf.c {
    public final int d;
    public final org.telegram.ui.Cells.z e;
    public final Object f37802f;

    public an(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f37802f = obj;
        this.e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 5), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 6), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 7), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 8), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 9), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(((hn) this.f37802f).f39938a, 10), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ed(19, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                hn hnVar = (hn) this.f37802f;
                wn wnVar = hnVar.f39938a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                wnVar.Wb = s1Var.getMessageObject().getId();
                wn wnVar2 = hnVar.f39938a;
                wnVar2.Xb = 2;
                wnVar2.Yb = null;
                s1Var.invalidate();
                return;
            case 1:
                hn hnVar2 = (hn) this.f37802f;
                wn wnVar3 = hnVar2.f39938a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                wnVar3.Wb = s1Var2.getMessageObject().getId();
                wn wnVar4 = hnVar2.f39938a;
                wnVar4.Xb = 2;
                wnVar4.Yb = null;
                s1Var2.invalidate();
                return;
            case 2:
                hn hnVar3 = (hn) this.f37802f;
                wn wnVar5 = hnVar3.f39938a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                wnVar5.Wb = s1Var3.getMessageObject().getId();
                wn wnVar6 = hnVar3.f39938a;
                wnVar6.Xb = 2;
                wnVar6.Yb = null;
                s1Var3.invalidate();
                return;
            case 3:
                hn hnVar4 = (hn) this.f37802f;
                wn wnVar7 = hnVar4.f39938a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                wnVar7.Wb = s1Var4.getMessageObject().getId();
                wn wnVar8 = hnVar4.f39938a;
                wnVar8.Xb = 2;
                wnVar8.Yb = null;
                s1Var4.invalidate();
                return;
            case 4:
                hn hnVar5 = (hn) this.f37802f;
                wn wnVar9 = hnVar5.f39938a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                wnVar9.Wb = s1Var5.getMessageObject().getId();
                wn wnVar10 = hnVar5.f39938a;
                wnVar10.Xb = 2;
                wnVar10.Yb = null;
                s1Var5.invalidate();
                return;
            case 5:
                hn hnVar6 = (hn) this.f37802f;
                wn wnVar11 = hnVar6.f39938a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                wnVar11.Wb = s1Var6.getMessageObject().getId();
                wn wnVar12 = hnVar6.f39938a;
                wnVar12.Xb = 2;
                wnVar12.Yb = null;
                s1Var6.invalidate();
                return;
            default:
                yl ylVar = (yl) this.f37802f;
                wn wnVar13 = ylVar.f46046a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                wnVar13.Wb = v0Var.getMessageObject().getId();
                wn wnVar14 = ylVar.f46046a.Q;
                wnVar14.Xb = 4;
                wnVar14.Yb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
