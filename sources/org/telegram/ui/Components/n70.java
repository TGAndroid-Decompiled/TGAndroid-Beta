package org.telegram.ui.Components;

import android.view.View;
public final class n70 implements View.OnLayoutChangeListener {
    public final int f25449a;
    public final Object f25450b;

    public n70(Object obj, int i10) {
        this.f25449a = i10;
        this.f25450b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f25449a) {
            case 0:
                w70 w70Var = (w70) this.f25450b;
                if (w70Var.D()) {
                    w70Var.O();
                    return;
                }
                return;
            default:
                ox0 ox0Var = (ox0) this.f25450b;
                di.h hVar = ox0Var.h;
                if (hVar != null && hVar.getLayout() != null) {
                    ox0Var.F = hVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
