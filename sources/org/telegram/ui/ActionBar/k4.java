package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.to0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f19523a;
    public final Object f19524b;
    public final Object f19525c;
    public final Object d;

    public k4(to0 to0Var, to0 to0Var2, to0 to0Var3) {
        this.f19523a = 1;
        this.f19524b = to0Var;
        this.f19525c = to0Var2;
        this.d = to0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19523a) {
            case 0:
                Rect rect = (Rect) this.f19524b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19525c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f19927b;
                if (v4Var.f() && !rect.equals(rect2)) {
                    x4Var.h = true;
                    if (v4Var.f()) {
                        x4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((to0) this.f19524b).setProgress(org.telegram.ui.k5.f34909c);
                ((to0) this.f19525c).setProgress(org.telegram.ui.k5.d);
                ((to0) this.d).setProgress(org.telegram.ui.k5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f19523a = 0;
        this.d = x4Var;
        this.f19524b = new Rect();
        this.f19525c = new Rect();
    }
}
