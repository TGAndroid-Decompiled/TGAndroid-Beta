package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.jo0;
public final class l4 implements View.OnLayoutChangeListener {
    public final int f20400a;
    public final Object f20401b;
    public final Object f20402c;
    public final Object d;

    public l4(jo0 jo0Var, jo0 jo0Var2, jo0 jo0Var3) {
        this.f20400a = 1;
        this.f20401b = jo0Var;
        this.f20402c = jo0Var2;
        this.d = jo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20400a) {
            case 0:
                Rect rect = (Rect) this.f20401b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20402c;
                rect2.set(i14, i15, i16, i17);
                y4 y4Var = (y4) this.d;
                w4 w4Var = y4Var.f20733b;
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
                ((jo0) this.f20401b).setProgress(org.telegram.ui.n5.f36387c);
                ((jo0) this.f20402c).setProgress(org.telegram.ui.n5.d);
                ((jo0) this.d).setProgress(org.telegram.ui.n5.e);
                return;
        }
    }

    public l4(y4 y4Var) {
        this.f20400a = 0;
        this.d = y4Var;
        this.f20401b = new Rect();
        this.f20402c = new Rect();
    }
}
