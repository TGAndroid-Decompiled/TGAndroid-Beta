package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ru extends wz {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final vu S2;

    public ru(vu vuVar, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var, boolean z13) {
        super(m2Var, z10, false, false, context, z11, null, null, z12, c6Var, false, z13);
        this.S2 = vuVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vu vuVar = this.S2;
        int i10 = vuVar.L;
        if (i10 == 2 || i10 == 3) {
            vuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        vu vuVar = this.S2;
        if (vuVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && vuVar.f30326x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.sk.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.o1.f20254w, 250L);
                this.R2 = false;
            }
            this.Q2 = vuVar.f30326x;
            this.P2 = i15;
        }
    }
}
