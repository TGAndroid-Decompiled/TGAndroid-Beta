package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f01 extends j1.b {
    public final Rect f26160o;
    public final h01 f26161p;

    public f01(h01 h01Var, h01 h01Var2) {
        super(h01Var2);
        this.f26161p = h01Var;
        this.f26160o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        h01 h01Var = this.f26161p;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 d = h01Var.d(i11);
            int i12 = d.f24590k;
            if (i12 > 0 && (i10 = d.f24591l) > 0) {
                int i13 = d.f24595p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f24596q;
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
        h01 h01Var = this.f26161p;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            a01 d = h01Var.d(i10);
            if (d.f24590k > 0 && d.f24591l > 0) {
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
        Rect rect = this.f26160o;
        if (i10 >= 0) {
            h01 h01Var = this.f26161p;
            if (i10 < h01Var.getChildCount()) {
                a01 d = h01Var.d(i10);
                int i11 = d.f24595p;
                int i12 = d.f24596q;
                rect.set(i11, i12, d.f24590k + i11, d.f24591l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f46299a.setEnabled(true);
                zz0 zz0Var = d.f24584b;
                if (zz0Var != null) {
                    str = zz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f24585c;
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
