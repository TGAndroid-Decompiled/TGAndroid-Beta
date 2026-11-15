package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.qm0;
public final class w3 implements View.OnLayoutChangeListener {
    public final int f29803a;
    public final Object f29804b;
    public final Object f29805c;
    public final Object d;

    public w3(qm0 qm0Var, qm0 qm0Var2, qm0 qm0Var3) {
        this.f29803a = 1;
        this.f29804b = qm0Var;
        this.f29805c = qm0Var2;
        this.d = qm0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f29803a) {
            case 0:
                Rect rect = (Rect) this.f29804b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f29805c;
                rect2.set(i13, i14, i15, i16);
                i4 i4Var = (i4) this.d;
                g4 g4Var = i4Var.f28686b;
                if (g4Var.f() && !rect.equals(rect2)) {
                    i4Var.h = true;
                    if (g4Var.f()) {
                        i4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qm0) this.f29804b).setProgress(org.telegram.ui.h5.n1);
                ((qm0) this.f29805c).setProgress(org.telegram.ui.h5.f47610o1);
                ((qm0) this.d).setProgress(org.telegram.ui.h5.f47611p1);
                return;
        }
    }

    public w3(i4 i4Var) {
        this.f29803a = 0;
        this.d = i4Var;
        this.f29804b = new Rect();
        this.f29805c = new Rect();
    }
}
