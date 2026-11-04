package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class jx0 extends j1.b {
    public final Rect f35215o;
    public final lx0 f35216p;

    public jx0(lx0 lx0Var, lx0 lx0Var2) {
        super(lx0Var2);
        this.f35216p = lx0Var;
        this.f35215o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i3;
        lx0 lx0Var = this.f35216p;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            int i11 = d.f33508k;
            if (i11 > 0 && (i3 = d.f33509l) > 0) {
                int i12 = d.f33513p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f33514q;
                    if (f11 >= i13 && f11 < i13 + i3) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        lx0 lx0Var = this.f35216p;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ex0 d = lx0Var.d(i3);
            if (d.f33508k > 0 && d.f33509l > 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
    }

    @Override
    public final boolean k(int i3, int i10) {
        return false;
    }

    @Override
    public final void l(int i3, s0.d dVar) {
        String str;
        Rect rect = this.f35215o;
        if (i3 >= 0) {
            lx0 lx0Var = this.f35216p;
            if (i3 < lx0Var.getChildCount()) {
                ex0 d = lx0Var.d(i3);
                int i10 = d.f33513p;
                int i11 = d.f33514q;
                rect.set(i10, i11, d.f33508k + i10, d.f33509l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f54570a.setEnabled(true);
                dx0 dx0Var = d.f33501b;
                if (dx0Var != null) {
                    str = dx0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f33502c;
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
