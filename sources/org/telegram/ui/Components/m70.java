package org.telegram.ui.Components;

import android.view.View;
public final class m70 implements View.OnLayoutChangeListener {
    public final int f26343a;
    public final Object f26344b;

    public m70(Object obj, int i10) {
        this.f26343a = i10;
        this.f26344b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26343a) {
            case 0:
                v70 v70Var = (v70) this.f26344b;
                if (v70Var.D()) {
                    v70Var.O();
                    return;
                }
                return;
            default:
                ox0 ox0Var = (ox0) this.f26344b;
                ai.p4 p4Var = ox0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    ox0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
