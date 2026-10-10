package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class k01 extends j1.b {
    public final Rect f27845o;
    public final m01 f27846p;

    public k01(m01 m01Var, m01 m01Var2) {
        super(m01Var2);
        this.f27846p = m01Var;
        this.f27845o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        m01 m01Var = this.f27846p;
        int childCount = m01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            f01 d = m01Var.d(i11);
            int i12 = d.f26231k;
            if (i12 > 0 && (i10 = d.f26232l) > 0) {
                int i13 = d.f26236p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f26237q;
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
        m01 m01Var = this.f27846p;
        int childCount = m01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f01 d = m01Var.d(i10);
            if (d.f26231k > 0 && d.f26232l > 0) {
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
        Rect rect = this.f27845o;
        if (i10 >= 0) {
            m01 m01Var = this.f27846p;
            if (i10 < m01Var.getChildCount()) {
                f01 d = m01Var.d(i10);
                int i11 = d.f26236p;
                int i12 = d.f26237q;
                rect.set(i11, i12, d.f26231k + i11, d.f26232l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47631a.setEnabled(true);
                e01 e01Var = d.f26224b;
                if (e01Var != null) {
                    str = e01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f26225c;
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
