package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ku extends rz {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final ou Y2;

    public ku(ou ouVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.g6 g6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, g6Var, false, z13);
        this.Y2 = ouVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ou ouVar = this.Y2;
        int i10 = ouVar.L;
        if (i10 == 2 || i10 == 3) {
            ouVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        ou ouVar = this.Y2;
        if (ouVar.b()) {
            int i15 = i13 - i11;
            if (!this.W2 && ouVar.f29389x) {
                this.X2 = true;
            }
            if (this.X2 && (i14 = this.V2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.tl.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.o1.f21718w, 250L);
                this.X2 = false;
            }
            this.W2 = ouVar.f29389x;
            this.V2 = i15;
        }
    }
}
