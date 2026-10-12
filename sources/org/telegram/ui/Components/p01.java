package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p01 extends j1.b {
    public final Rect f29340o;
    public final r01 f29341p;

    public p01(r01 r01Var, r01 r01Var2) {
        super(r01Var2);
        this.f29341p = r01Var;
        this.f29340o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        r01 r01Var = this.f29341p;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            k01 d = r01Var.d(i11);
            int i12 = d.f27699k;
            if (i12 > 0 && (i10 = d.f27700l) > 0) {
                int i13 = d.f27704p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27705q;
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
        r01 r01Var = this.f29341p;
        int childCount = r01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k01 d = r01Var.d(i10);
            if (d.f27699k > 0 && d.f27700l > 0) {
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
        Rect rect = this.f29340o;
        if (i10 >= 0) {
            r01 r01Var = this.f29341p;
            if (i10 < r01Var.getChildCount()) {
                k01 d = r01Var.d(i10);
                int i11 = d.f27704p;
                int i12 = d.f27705q;
                rect.set(i11, i12, d.f27699k + i11, d.f27700l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.k(true);
                j01 j01Var = d.f27692b;
                if (j01Var != null) {
                    str = j01Var.getText();
                } else {
                    str = null;
                }
                dVar.p((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27693c;
                if (pagetablecell != null && pagetablecell.header) {
                    dVar.l(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        dVar.h(rect);
        dVar.q(false);
        dVar.j("");
    }
}
