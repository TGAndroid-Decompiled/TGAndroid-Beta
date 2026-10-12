package org.telegram.ui.Components;

import android.view.View;
public final class j80 implements View.OnLayoutChangeListener {
    public final int f27388a;
    public final Object f27389b;

    public j80(Object obj, int i10) {
        this.f27388a = i10;
        this.f27389b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27388a) {
            case 0:
                s80 s80Var = (s80) this.f27389b;
                if (s80Var.D()) {
                    s80Var.O();
                    return;
                }
                return;
            default:
                ly0 ly0Var = (ly0) this.f27389b;
                ai.q4 q4Var = ly0Var.h;
                if (q4Var != null && q4Var.getLayout() != null) {
                    ly0Var.F = q4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
