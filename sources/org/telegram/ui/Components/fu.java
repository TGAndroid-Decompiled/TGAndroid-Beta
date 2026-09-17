package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class fu extends kz {
    public int O2;
    public boolean P2;
    public boolean Q2;
    public final ju R2;

    public fu(ju juVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, f6Var, false, z13);
        this.R2 = juVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ju juVar = this.R2;
        int i10 = juVar.L;
        if (i10 == 2 || i10 == 3) {
            juVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        ju juVar = this.R2;
        if (juVar.b()) {
            int i15 = i13 - i11;
            if (!this.P2 && juVar.f25438x) {
                this.Q2 = true;
            }
            if (this.Q2 && (i14 = this.O2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.wl.q(animate().translationY(0.0f), org.telegram.ui.ActionBar.q1.f19507w, 250L);
                this.Q2 = false;
            }
            this.P2 = juVar.f25438x;
            this.O2 = i15;
        }
    }
}
