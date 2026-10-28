package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nu extends sz {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final ru Y2;

    public nu(ru ruVar, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.u6 u6Var, boolean z13) {
        super(r2Var, z10, false, false, context, z11, null, null, z12, u6Var, false, z13);
        this.Y2 = ruVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ru ruVar = this.Y2;
        int i10 = ruVar.L;
        if (i10 == 2 || i10 == 3) {
            ruVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        ru ruVar = this.Y2;
        if (ruVar.b()) {
            int i15 = i13 - i11;
            if (!this.W2 && ruVar.f32373x) {
                this.X2 = true;
            }
            if (this.X2 && (i14 = this.V2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.wh.q(animate().translationY(0.0f), org.telegram.ui.ActionBar.q1.f22964w, 250L);
                this.X2 = false;
            }
            this.W2 = ruVar.f32373x;
            this.V2 = i15;
        }
    }
}
