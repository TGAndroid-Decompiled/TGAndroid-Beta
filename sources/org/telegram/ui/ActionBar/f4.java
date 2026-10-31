package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.nn0;
public final class f4 implements View.OnLayoutChangeListener {
    public final int f20320a;
    public final Object f20321b;
    public final Object f20322c;
    public final Object d;

    public f4(nn0 nn0Var, nn0 nn0Var2, nn0 nn0Var3) {
        this.f20320a = 1;
        this.f20321b = nn0Var;
        this.f20322c = nn0Var2;
        this.d = nn0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20320a) {
            case 0:
                Rect rect = (Rect) this.f20321b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20322c;
                rect2.set(i14, i15, i16, i17);
                s4 s4Var = (s4) this.d;
                q4 q4Var = s4Var.f20776b;
                if (q4Var.f() && !rect.equals(rect2)) {
                    s4Var.h = true;
                    if (q4Var.f()) {
                        s4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((nn0) this.f20321b).setProgress(org.telegram.ui.g5.f37423j1);
                ((nn0) this.f20322c).setProgress(org.telegram.ui.g5.f37424k1);
                ((nn0) this.d).setProgress(org.telegram.ui.g5.l1);
                return;
        }
    }

    public f4(s4 s4Var) {
        this.f20320a = 0;
        this.d = s4Var;
        this.f20321b = new Rect();
        this.f20322c = new Rect();
    }
}
