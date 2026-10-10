package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class wu extends b00 {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final av S2;

    public wu(av avVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, e6Var, false, z13);
        this.S2 = avVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        av avVar = this.S2;
        int i10 = avVar.L;
        if (i10 == 2 || i10 == 3) {
            avVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        av avVar = this.S2;
        if (avVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && avVar.f24646x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.bi.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.p1.f21459w, 250L);
                this.R2 = false;
            }
            this.Q2 = avVar.f24646x;
            this.P2 = i15;
        }
    }
}
