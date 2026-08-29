package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class wt extends fz {
    public int L2;
    public boolean M2;
    public boolean N2;
    public final au O2;

    public wt(au auVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, c6Var, false, z13);
        this.O2 = auVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        au auVar = this.O2;
        int i10 = auVar.H;
        if (i10 == 2 || i10 == 3) {
            auVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        au auVar = this.O2;
        if (auVar.b()) {
            int i15 = i13 - i11;
            if (!this.M2 && auVar.f26891x) {
                this.N2 = true;
            }
            if (this.N2 && (i14 = this.L2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.ui.b.q(animate().translationY(0.0f), org.telegram.ui.ActionBar.q1.f23735w, 250L);
                this.N2 = false;
            }
            this.M2 = auVar.f26891x;
            this.L2 = i15;
        }
    }
}
