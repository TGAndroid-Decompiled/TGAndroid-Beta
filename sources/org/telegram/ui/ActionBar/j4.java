package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.yo0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f21240a;
    public final Object f21241b;
    public final Object f21242c;
    public final Object d;

    public j4(yo0 yo0Var, yo0 yo0Var2, yo0 yo0Var3) {
        this.f21240a = 1;
        this.f21241b = yo0Var;
        this.f21242c = yo0Var2;
        this.d = yo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21240a) {
            case 0:
                Rect rect = (Rect) this.f21241b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21242c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f21664b;
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
                ((yo0) this.f21241b).setProgress(org.telegram.ui.j5.f37578c);
                ((yo0) this.f21242c).setProgress(org.telegram.ui.j5.d);
                ((yo0) this.d).setProgress(org.telegram.ui.j5.f37579e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f21240a = 0;
        this.d = w4Var;
        this.f21241b = new Rect();
        this.f21242c = new Rect();
    }
}
