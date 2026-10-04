package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.yo0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f21245a;
    public final Object f21246b;
    public final Object f21247c;
    public final Object d;

    public j4(yo0 yo0Var, yo0 yo0Var2, yo0 yo0Var3) {
        this.f21245a = 1;
        this.f21246b = yo0Var;
        this.f21247c = yo0Var2;
        this.d = yo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21245a) {
            case 0:
                Rect rect = (Rect) this.f21246b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21247c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f21669b;
                if (u4Var.f() && !rect.equals(rect2)) {
                    w4Var.h = true;
                    if (u4Var.f()) {
                        w4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((yo0) this.f21246b).setProgress(org.telegram.ui.j5.f37584c);
                ((yo0) this.f21247c).setProgress(org.telegram.ui.j5.d);
                ((yo0) this.d).setProgress(org.telegram.ui.j5.f37585e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f21245a = 0;
        this.d = w4Var;
        this.f21246b = new Rect();
        this.f21247c = new Rect();
    }
}
