package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nt extends ly {
    public int W2;
    public boolean X2;
    public boolean Y2;
    public final rt Z2;

    public nt(rt rtVar, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var, boolean z13) {
        super(e2Var, z10, false, false, context, z11, null, null, z12, e6Var, false, z13);
        this.Z2 = rtVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rt rtVar = this.Z2;
        int i7 = rtVar.M;
        if (i7 == 2 || i7 == 3) {
            rtVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        rt rtVar = this.Z2;
        if (rtVar.b()) {
            int i14 = i12 - i10;
            if (!this.X2 && rtVar.f39066y) {
                this.Y2 = true;
            }
            if (this.Y2 && (i13 = this.W2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.i20.n(animate().translationY(0.0f), org.telegram.ui.ActionBar.i1.f28644w, 250L);
                this.Y2 = false;
            }
            this.X2 = rtVar.f39066y;
            this.W2 = i14;
        }
    }
}
