package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ao0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f23526a;
    public final Object f23527b;
    public final Object f23528c;
    public final Object d;

    public i4(ao0 ao0Var, ao0 ao0Var2, ao0 ao0Var3) {
        this.f23526a = 1;
        this.f23527b = ao0Var;
        this.f23528c = ao0Var2;
        this.d = ao0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23526a) {
            case 0:
                Rect rect = (Rect) this.f23527b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f23528c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f23894b;
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
                ((ao0) this.f23527b).setProgress(org.telegram.ui.j5.f39431c);
                ((ao0) this.f23528c).setProgress(org.telegram.ui.j5.d);
                ((ao0) this.d).setProgress(org.telegram.ui.j5.f39432e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f23526a = 0;
        this.d = v4Var;
        this.f23527b = new Rect();
        this.f23528c = new Rect();
    }
}
