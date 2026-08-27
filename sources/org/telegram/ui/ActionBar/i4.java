package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.qn0;

public final class i4 implements View.OnLayoutChangeListener {

    public final int f23507a;

    public final Object f23508b;

    public final Object f23509c;
    public final Object d;

    public i4(qn0 qn0Var, qn0 qn0Var2, qn0 qn0Var3) {
        this.f23507a = 1;
        this.f23508b = qn0Var;
        this.f23509c = qn0Var2;
        this.d = qn0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23507a) {
            case 0:
                Rect rect = (Rect) this.f23508b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f23509c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f23904b;
                if (t4Var.f() && !rect.equals(rect2)) {
                    v4Var.h = true;
                    if (t4Var.f()) {
                        v4Var.c();
                    }
                    break;
                }
                break;
            default:
                ((qn0) this.f23508b).setProgress(org.telegram.ui.j5.f39252c);
                ((qn0) this.f23509c).setProgress(org.telegram.ui.j5.d);
                ((qn0) this.d).setProgress(org.telegram.ui.j5.f39253e);
                break;
        }
    }

    public i4(v4 v4Var) {
        this.f23507a = 0;
        this.d = v4Var;
        this.f23508b = new Rect();
        this.f23509c = new Rect();
    }
}
