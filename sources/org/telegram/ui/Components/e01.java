package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e01 extends j1.b {
    public final Rect f25936o;
    public final g01 f25937p;

    public e01(g01 g01Var, g01 g01Var2) {
        super(g01Var2);
        this.f25937p = g01Var;
        this.f25936o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        g01 g01Var = this.f25937p;
        int childCount = g01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 d = g01Var.d(i11);
            int i12 = d.f33692k;
            if (i12 > 0 && (i10 = d.f33693l) > 0) {
                int i13 = d.f33697p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f33698q;
                    if (f10 >= i14 && f10 < i14 + i10) {
                        return i11;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        g01 g01Var = this.f25937p;
        int childCount = g01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            zz0 d = g01Var.d(i10);
            if (d.f33692k > 0 && d.f33693l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String str;
        Rect rect = this.f25936o;
        if (i10 >= 0) {
            g01 g01Var = this.f25937p;
            if (i10 < g01Var.getChildCount()) {
                zz0 d = g01Var.d(i10);
                int i11 = d.f33697p;
                int i12 = d.f33698q;
                rect.set(i11, i12, d.f33692k + i11, d.f33693l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f46485a.setEnabled(true);
                yz0 yz0Var = d.f33685b;
                if (yz0Var != null) {
                    str = yz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f33686c;
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
