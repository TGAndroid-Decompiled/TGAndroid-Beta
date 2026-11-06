package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class jx0 extends k1.b {
    public final Rect f35114o;
    public final lx0 f35115p;

    public jx0(lx0 lx0Var, lx0 lx0Var2) {
        super(lx0Var2);
        this.f35115p = lx0Var;
        this.f35114o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        lx0 lx0Var = this.f35115p;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            int i11 = d.f33358k;
            if (i11 > 0 && (i7 = d.f33359l) > 0) {
                int i12 = d.f33363p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f33364q;
                    if (f11 >= i13 && f11 < i13 + i7) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        lx0 lx0Var = this.f35115p;
        int childCount = lx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ex0 d = lx0Var.d(i7);
            if (d.f33358k > 0 && d.f33359l > 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return false;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        String str;
        Rect rect = this.f35114o;
        if (i7 >= 0) {
            lx0 lx0Var = this.f35115p;
            if (i7 < lx0Var.getChildCount()) {
                ex0 d = lx0Var.d(i7);
                int i10 = d.f33363p;
                int i11 = d.f33364q;
                rect.set(i10, i11, d.f33358k + i10, d.f33359l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f54484a.setEnabled(true);
                dx0 dx0Var = d.f33351b;
                if (dx0Var != null) {
                    str = dx0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f33352c;
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
