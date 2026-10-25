package org.telegram.ui.Components;

import android.view.View;
public final class b80 implements View.OnLayoutChangeListener {
    public final int f26774a;
    public final Object f26775b;

    public b80(Object obj, int i10) {
        this.f26774a = i10;
        this.f26775b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26774a) {
            case 0:
                k80 k80Var = (k80) this.f26775b;
                if (k80Var.D()) {
                    k80Var.O();
                    return;
                }
                return;
            default:
                jy0 jy0Var = (jy0) this.f26775b;
                bi.md mdVar = jy0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    jy0Var.F = mdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
