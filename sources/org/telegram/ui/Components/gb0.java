package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class gb0 implements e2.h {
    public final int f24327a;
    public final ViewGroup f24328b;

    public gb0(ViewGroup viewGroup, int i10) {
        this.f24327a = i10;
        this.f24328b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24327a) {
            case 0:
                xb0 xb0Var = (xb0) this.f24328b;
                xb0Var.f30231n.y(xb0Var.f30230f.U((View) obj));
                return;
            default:
                s61 s61Var = (s61) this.f24328b;
                s61Var.Y2.Q(s61Var.U((View) obj), s61Var.f28065c3);
                return;
        }
    }
}
