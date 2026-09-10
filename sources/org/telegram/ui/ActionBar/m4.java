package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.oo0;
public final class m4 implements View.OnLayoutChangeListener {
    public final int f18473a;
    public final Object f18474b;
    public final Object f18475c;
    public final Object d;

    public m4(oo0 oo0Var, oo0 oo0Var2, oo0 oo0Var3) {
        this.f18473a = 1;
        this.f18474b = oo0Var;
        this.f18475c = oo0Var2;
        this.d = oo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f18473a) {
            case 0:
                Rect rect = (Rect) this.f18474b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f18475c;
                rect2.set(i14, i15, i16, i17);
                z4 z4Var = (z4) this.d;
                x4 x4Var = z4Var.f18825b;
                if (x4Var.f() && !rect.equals(rect2)) {
                    z4Var.h = true;
                    if (x4Var.f()) {
                        z4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((oo0) this.f18474b).setProgress(org.telegram.ui.i5.f33535c);
                ((oo0) this.f18475c).setProgress(org.telegram.ui.i5.d);
                ((oo0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public m4(z4 z4Var) {
        this.f18473a = 0;
        this.d = z4Var;
        this.f18474b = new Rect();
        this.f18475c = new Rect();
    }
}
