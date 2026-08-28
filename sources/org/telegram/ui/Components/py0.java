package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class py0 extends j1.b {
    public final Rect f31779o;
    public final ry0 f31780p;

    public py0(ry0 ry0Var, ry0 ry0Var2) {
        super(ry0Var2);
        this.f31780p = ry0Var;
        this.f31779o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i9;
        ry0 ry0Var = this.f31780p;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ky0 d = ry0Var.d(i10);
            int i11 = d.f30272k;
            if (i11 > 0 && (i9 = d.f30273l) > 0) {
                int i12 = d.f30277p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f30278q;
                    if (f11 >= i13 && f11 < i13 + i9) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ry0 ry0Var = this.f31780p;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ky0 d = ry0Var.d(i9);
            if (d.f30272k > 0 && d.f30273l > 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
    }

    @Override
    public final boolean k(int i9, int i10) {
        return false;
    }

    @Override
    public final void l(int i9, s0.d dVar) {
        String str;
        Rect rect = this.f31779o;
        if (i9 >= 0) {
            ry0 ry0Var = this.f31780p;
            if (i9 < ry0Var.getChildCount()) {
                ky0 d = ry0Var.d(i9);
                int i10 = d.f30277p;
                int i11 = d.f30278q;
                rect.set(i10, i11, d.f30272k + i10, d.f30273l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47292a.setEnabled(true);
                jy0 jy0Var = d.f30265b;
                if (jy0Var != null) {
                    str = jy0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f30266c;
                if (pagetablecell != null && pagetablecell.header) {
                    dVar.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        dVar.h(rect);
        dVar.p(false);
        dVar.j("");
    }
}
