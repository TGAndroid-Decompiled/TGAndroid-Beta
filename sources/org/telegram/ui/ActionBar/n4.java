package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.hp0;
public final class n4 implements View.OnLayoutChangeListener {
    public final int f21672a;
    public final Object f21673b;
    public final Object f21674c;
    public final Object d;

    public n4(hp0 hp0Var, hp0 hp0Var2, hp0 hp0Var3) {
        this.f21672a = 1;
        this.f21673b = hp0Var;
        this.f21674c = hp0Var2;
        this.d = hp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21672a) {
            case 0:
                Rect rect = (Rect) this.f21673b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21674c;
                rect2.set(i14, i15, i16, i17);
                a5 a5Var = (a5) this.d;
                y4 y4Var = a5Var.f20692b;
                if (y4Var.f() && !rect.equals(rect2)) {
                    a5Var.h = true;
                    if (y4Var.f()) {
                        a5Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((hp0) this.f21673b).setProgress(org.telegram.ui.m5.f39375c);
                ((hp0) this.f21674c).setProgress(org.telegram.ui.m5.d);
                ((hp0) this.d).setProgress(org.telegram.ui.m5.e);
                return;
        }
    }

    public n4(a5 a5Var) {
        this.f21672a = 0;
        this.d = a5Var;
        this.f21673b = new Rect();
        this.f21674c = new Rect();
    }
}
