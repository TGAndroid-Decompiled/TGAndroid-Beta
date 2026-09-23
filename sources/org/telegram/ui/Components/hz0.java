package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class hz0 extends j1.b {
    public final Rect f24833o;
    public final jz0 f24834p;

    public hz0(jz0 jz0Var, jz0 jz0Var2) {
        super(jz0Var2);
        this.f24834p = jz0Var;
        this.f24833o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        jz0 jz0Var = this.f24834p;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            cz0 d = jz0Var.d(i11);
            int i12 = d.f23159k;
            if (i12 > 0 && (i10 = d.f23160l) > 0) {
                int i13 = d.f23164p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f23165q;
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
        jz0 jz0Var = this.f24834p;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            cz0 d = jz0Var.d(i10);
            if (d.f23159k > 0 && d.f23160l > 0) {
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
        Rect rect = this.f24833o;
        if (i10 >= 0) {
            jz0 jz0Var = this.f24834p;
            if (i10 < jz0Var.getChildCount()) {
                cz0 d = jz0Var.d(i10);
                int i11 = d.f23164p;
                int i12 = d.f23165q;
                rect.set(i11, i12, d.f23159k + i11, d.f23160l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f42576a.setEnabled(true);
                bz0 bz0Var = d.f23153b;
                if (bz0Var != null) {
                    str = bz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f23154c;
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
