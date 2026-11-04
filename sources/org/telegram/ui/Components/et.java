package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class et extends ey {
    public int W2;
    public boolean X2;
    public boolean Y2;
    public final jt Z2;

    public et(jt jtVar, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var, boolean z13) {
        super(d2Var, z10, false, false, context, z11, null, null, z12, e6Var, false, z13);
        this.Z2 = jtVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jt jtVar = this.Z2;
        int i3 = jtVar.M;
        if (i3 == 2 || i3 == 3) {
            jtVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        jt jtVar = this.Z2;
        if (jtVar.b()) {
            int i14 = i12 - i10;
            if (!this.X2 && jtVar.f35198y) {
                this.Y2 = true;
            }
            if (this.Y2 && (i13 = this.W2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.camera.q.l(animate().translationY(0.0f), org.telegram.ui.ActionBar.h1.f27551w, 250L);
                this.Y2 = false;
            }
            this.X2 = jtVar.f35198y;
            this.W2 = i14;
        }
    }
}
