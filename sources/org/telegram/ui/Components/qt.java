package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class qt extends wy {
    public int L2;
    public boolean M2;
    public boolean N2;
    public final ut O2;

    public qt(ut utVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.b6 b6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, b6Var, false, z13);
        this.O2 = utVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ut utVar = this.O2;
        int i9 = utVar.H;
        if (i9 == 2 || i9 == 3) {
            utVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        ut utVar = this.O2;
        if (utVar.b()) {
            int i14 = i12 - i10;
            if (!this.M2 && utVar.f33130x) {
                this.N2 = true;
            }
            if (this.N2 && (i13 = this.L2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.ll.r(animate().translationY(0.0f), org.telegram.ui.ActionBar.q1.f23713w, 250L);
                this.N2 = false;
            }
            this.M2 = utVar.f33130x;
            this.L2 = i14;
        }
    }
}
