package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.qp0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f20982a;
    public final Object f20983b;
    public final Object f20984c;
    public final Object d;

    public i4(qp0 qp0Var, qp0 qp0Var2, qp0 qp0Var3) {
        this.f20982a = 1;
        this.f20983b = qp0Var;
        this.f20984c = qp0Var2;
        this.d = qp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20982a) {
            case 0:
                Rect rect = (Rect) this.f20983b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20984c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f21404b;
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
                ((qp0) this.f20983b).setProgress(org.telegram.ui.l5.f39636c);
                ((qp0) this.f20984c).setProgress(org.telegram.ui.l5.d);
                ((qp0) this.d).setProgress(org.telegram.ui.l5.f39637e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f20982a = 0;
        this.d = v4Var;
        this.f20983b = new Rect();
        this.f20984c = new Rect();
    }
}
