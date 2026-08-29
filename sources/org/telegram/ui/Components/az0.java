package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class az0 extends j1.b {
    public final Rect f26922o;
    public final cz0 f26923p;

    public az0(cz0 cz0Var, cz0 cz0Var2) {
        super(cz0Var2);
        this.f26923p = cz0Var;
        this.f26922o = new Rect();
    }

    @Override
    public final int g(float f9, float f10) {
        int i10;
        cz0 cz0Var = this.f26923p;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            vy0 d = cz0Var.d(i11);
            int i12 = d.f34235k;
            if (i12 > 0 && (i10 = d.f34236l) > 0) {
                int i13 = d.f34240p;
                if (f9 >= i13 && f9 < i13 + i12) {
                    int i14 = d.f34241q;
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
        cz0 cz0Var = this.f26923p;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            vy0 d = cz0Var.d(i10);
            if (d.f34235k > 0 && d.f34236l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String str;
        Rect rect = this.f26922o;
        if (i10 >= 0) {
            cz0 cz0Var = this.f26923p;
            if (i10 < cz0Var.getChildCount()) {
                vy0 d = cz0Var.d(i10);
                int i11 = d.f34240p;
                int i12 = d.f34241q;
                rect.set(i11, i12, d.f34235k + i11, d.f34236l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f47482a.setEnabled(true);
                uy0 uy0Var = d.f34228b;
                if (uy0Var != null) {
                    str = uy0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f34229c;
                if (pagetablecell != null && pagetablecell.header) {
                    cVar.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        cVar.h(rect);
        cVar.p(false);
        cVar.j("");
    }
}
