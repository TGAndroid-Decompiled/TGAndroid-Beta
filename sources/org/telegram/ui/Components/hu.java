package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class hu extends mz {
    public int N2;
    public boolean O2;
    public boolean P2;
    public final lu Q2;

    public hu(lu luVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, e6Var, false, z13);
        this.Q2 = luVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lu luVar = this.Q2;
        int i10 = luVar.L;
        if (i10 == 2 || i10 == 3) {
            luVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        lu luVar = this.Q2;
        if (luVar.b()) {
            int i15 = i13 - i11;
            if (!this.O2 && luVar.f26152x) {
                this.P2 = true;
            }
            if (this.P2 && (i14 = this.N2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.qk.s(animate().translationY(0.0f), org.telegram.ui.ActionBar.q1.f19718w, 250L);
                this.P2 = false;
            }
            this.O2 = luVar.f26152x;
            this.N2 = i15;
        }
    }
}
