package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.pn0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f23516a;
    public final Object f23517b;
    public final Object f23518c;
    public final Object d;

    public i4(pn0 pn0Var, pn0 pn0Var2, pn0 pn0Var3) {
        this.f23516a = 1;
        this.f23517b = pn0Var;
        this.f23518c = pn0Var2;
        this.d = pn0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f23516a) {
            case 0:
                Rect rect = (Rect) this.f23517b;
                rect.set(i9, i10, i11, i12);
                Rect rect2 = (Rect) this.f23518c;
                rect2.set(i13, i14, i15, i16);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f23874b;
                if (t4Var.f() && !rect.equals(rect2)) {
                    v4Var.h = true;
                    if (t4Var.f()) {
                        v4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((pn0) this.f23517b).setProgress(org.telegram.ui.i5.f39007c);
                ((pn0) this.f23518c).setProgress(org.telegram.ui.i5.d);
                ((pn0) this.d).setProgress(org.telegram.ui.i5.f39008e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f23516a = 0;
        this.d = v4Var;
        this.f23517b = new Rect();
        this.f23518c = new Rect();
    }
}
