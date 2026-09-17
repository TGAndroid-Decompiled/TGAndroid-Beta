package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.go0;
public final class l4 implements View.OnLayoutChangeListener {
    public final int f19374a;
    public final Object f19375b;
    public final Object f19376c;
    public final Object d;

    public l4(go0 go0Var, go0 go0Var2, go0 go0Var3) {
        this.f19374a = 1;
        this.f19375b = go0Var;
        this.f19376c = go0Var2;
        this.d = go0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19374a) {
            case 0:
                Rect rect = (Rect) this.f19375b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19376c;
                rect2.set(i14, i15, i16, i17);
                y4 y4Var = (y4) this.d;
                w4 w4Var = y4Var.f19728b;
                if (w4Var.f() && !rect.equals(rect2)) {
                    y4Var.h = true;
                    if (w4Var.f()) {
                        y4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((go0) this.f19375b).setProgress(org.telegram.ui.i5.f34431c);
                ((go0) this.f19376c).setProgress(org.telegram.ui.i5.d);
                ((go0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public l4(y4 y4Var) {
        this.f19374a = 0;
        this.d = y4Var;
        this.f19375b = new Rect();
        this.f19376c = new Rect();
    }
}
