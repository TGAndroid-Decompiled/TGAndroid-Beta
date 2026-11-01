package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class st extends vy {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final wt Y2;

    public st(wt wtVar, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.p6 p6Var, boolean z13) {
        super(k2Var, z10, false, false, context, z11, null, null, z12, p6Var, false, z13);
        this.Y2 = wtVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wt wtVar = this.Y2;
        int i10 = wtVar.L;
        if (i10 == 2 || i10 == 3) {
            wtVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        wt wtVar = this.Y2;
        if (wtVar.b()) {
            int i15 = i13 - i11;
            if (!this.W2 && wtVar.f32317y) {
                this.X2 = true;
            }
            if (this.X2 && (i14 = this.V2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.a30.m(animate().translationY(0.0f), org.telegram.ui.ActionBar.m1.f20562w, 250L);
                this.X2 = false;
            }
            this.W2 = wtVar.f32317y;
            this.V2 = i15;
        }
    }
}
