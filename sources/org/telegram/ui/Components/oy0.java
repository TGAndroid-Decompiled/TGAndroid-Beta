package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class oy0 extends j1.b {
    public final Rect f29254o;
    public final qy0 f29255p;

    public oy0(qy0 qy0Var, qy0 qy0Var2) {
        super(qy0Var2);
        this.f29255p = qy0Var;
        this.f29254o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        qy0 qy0Var = this.f29255p;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jy0 d = qy0Var.d(i11);
            int i12 = d.f27598k;
            if (i12 > 0 && (i10 = d.f27599l) > 0) {
                int i13 = d.f27603p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27604q;
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
        qy0 qy0Var = this.f29255p;
        int childCount = qy0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jy0 d = qy0Var.d(i10);
            if (d.f27598k > 0 && d.f27599l > 0) {
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
        Rect rect = this.f29254o;
        if (i10 >= 0) {
            qy0 qy0Var = this.f29255p;
            if (i10 < qy0Var.getChildCount()) {
                jy0 d = qy0Var.d(i10);
                int i11 = d.f27603p;
                int i12 = d.f27604q;
                rect.set(i11, i12, d.f27598k + i11, d.f27599l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f47861a.setEnabled(true);
                iy0 iy0Var = d.f27592b;
                if (iy0Var != null) {
                    str = iy0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27593c;
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
