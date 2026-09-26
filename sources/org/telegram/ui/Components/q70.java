package org.telegram.ui.Components;

import android.view.View;
public final class q70 implements View.OnLayoutChangeListener {
    public final int f27603a;
    public final Object f27604b;

    public q70(Object obj, int i10) {
        this.f27603a = i10;
        this.f27604b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27603a) {
            case 0:
                z70 z70Var = (z70) this.f27604b;
                if (z70Var.D()) {
                    z70Var.O();
                    return;
                }
                return;
            default:
                ox0 ox0Var = (ox0) this.f27604b;
                ai.p4 p4Var = ox0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    ox0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
