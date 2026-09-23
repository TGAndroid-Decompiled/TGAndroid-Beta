package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.fo0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f19249a;
    public final Object f19250b;
    public final Object f19251c;
    public final Object d;

    public j4(fo0 fo0Var, fo0 fo0Var2, fo0 fo0Var3) {
        this.f19249a = 1;
        this.f19250b = fo0Var;
        this.f19251c = fo0Var2;
        this.d = fo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19249a) {
            case 0:
                Rect rect = (Rect) this.f19250b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19251c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f19650b;
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
                ((fo0) this.f19250b).setProgress(org.telegram.ui.j5.f34325c);
                ((fo0) this.f19251c).setProgress(org.telegram.ui.j5.d);
                ((fo0) this.d).setProgress(org.telegram.ui.j5.e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f19249a = 0;
        this.d = w4Var;
        this.f19250b = new Rect();
        this.f19251c = new Rect();
    }
}
