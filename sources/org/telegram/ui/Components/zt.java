package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class zt extends kz {
    public int M2;
    public boolean N2;
    public boolean O2;
    public final du P2;

    public zt(du duVar, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12) {
        super(p2Var, z4, false, false, context, z10, null, null, z11, f6Var, false, z12);
        this.P2 = duVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        du duVar = this.P2;
        int i10 = duVar.I;
        if (i10 == 2 || i10 == 3) {
            duVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        du duVar = this.P2;
        if (duVar.b()) {
            int i15 = i13 - i11;
            if (!this.N2 && duVar.f24375x) {
                this.O2 = true;
            }
            if (this.O2 && (i14 = this.M2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.ui.b.p(animate().translationY(0.0f), org.telegram.ui.ActionBar.r1.f20543w, 250L);
                this.O2 = false;
            }
            this.N2 = duVar.f24375x;
            this.M2 = i15;
        }
    }
}
