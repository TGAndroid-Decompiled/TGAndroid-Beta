package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class ny0 extends j1.b {
    public final Rect f28920o;
    public final py0 f28921p;

    public ny0(py0 py0Var, py0 py0Var2) {
        super(py0Var2);
        this.f28921p = py0Var;
        this.f28920o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        py0 py0Var = this.f28921p;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iy0 d = py0Var.d(i11);
            int i12 = d.f27139k;
            if (i12 > 0 && (i10 = d.f27140l) > 0) {
                int i13 = d.f27144p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27145q;
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
        py0 py0Var = this.f28921p;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            iy0 d = py0Var.d(i10);
            if (d.f27139k > 0 && d.f27140l > 0) {
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
        Rect rect = this.f28920o;
        if (i10 >= 0) {
            py0 py0Var = this.f28921p;
            if (i10 < py0Var.getChildCount()) {
                iy0 d = py0Var.d(i10);
                int i11 = d.f27144p;
                int i12 = d.f27145q;
                rect.set(i11, i12, d.f27139k + i11, d.f27140l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f47850a.setEnabled(true);
                hy0 hy0Var = d.f27133b;
                if (hy0Var != null) {
                    str = hy0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27134c;
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
