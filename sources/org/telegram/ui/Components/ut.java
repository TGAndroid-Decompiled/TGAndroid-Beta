package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ut extends ty {
    public int W2;
    public boolean X2;
    public boolean Y2;
    public final yt Z2;

    public ut(yt ytVar, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.h6 h6Var, boolean z13) {
        super(g2Var, z10, false, false, context, z11, null, null, z12, h6Var, false, z13);
        this.Z2 = ytVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yt ytVar = this.Z2;
        int i7 = ytVar.M;
        if (i7 == 2 || i7 == 3) {
            ytVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        yt ytVar = this.Z2;
        if (ytVar.b()) {
            int i14 = i12 - i10;
            if (!this.X2 && ytVar.f42505y) {
                this.Y2 = true;
            }
            if (this.Y2 && (i13 = this.W2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.o10.o(animate().translationY(0.0f), org.telegram.ui.ActionBar.i1.f28971w, 250L);
                this.Y2 = false;
            }
            this.X2 = ytVar.f42505y;
            this.W2 = i14;
        }
    }
}
