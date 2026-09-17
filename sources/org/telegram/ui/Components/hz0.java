package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class hz0 extends j1.b {
    public final Rect f26919o;
    public final jz0 f26920p;

    public hz0(jz0 jz0Var, jz0 jz0Var2) {
        super(jz0Var2);
        this.f26920p = jz0Var;
        this.f26919o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        jz0 jz0Var = this.f26920p;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            cz0 d = jz0Var.d(i11);
            int i12 = d.f25177k;
            if (i12 > 0 && (i10 = d.f25178l) > 0) {
                int i13 = d.f25182p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f25183q;
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
        jz0 jz0Var = this.f26920p;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            cz0 d = jz0Var.d(i10);
            if (d.f25177k > 0 && d.f25178l > 0) {
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
        Rect rect = this.f26919o;
        if (i10 >= 0) {
            jz0 jz0Var = this.f26920p;
            if (i10 < jz0Var.getChildCount()) {
                cz0 d = jz0Var.d(i10);
                int i11 = d.f25182p;
                int i12 = d.f25183q;
                rect.set(i11, i12, d.f25177k + i11, d.f25178l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f45714a.setEnabled(true);
                bz0 bz0Var = d.f25170b;
                if (bz0Var != null) {
                    str = bz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f25171c;
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
