package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p01 extends j1.b {
    public final Rect f31422o;
    public final r01 f31423p;

    public p01(r01 r01Var, r01 r01Var2) {
        super(r01Var2);
        this.f31423p = r01Var;
        this.f31422o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        r01 r01Var = this.f31423p;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            k01 d = r01Var.d(i11);
            int i12 = d.f29806k;
            if (i12 > 0 && (i10 = d.f29807l) > 0) {
                int i13 = d.f29811p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f29812q;
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
        r01 r01Var = this.f31423p;
        int childCount = r01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k01 d = r01Var.d(i10);
            if (d.f29806k > 0 && d.f29807l > 0) {
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
        Rect rect = this.f31422o;
        if (i10 >= 0) {
            r01 r01Var = this.f31423p;
            if (i10 < r01Var.getChildCount()) {
                k01 d = r01Var.d(i10);
                int i11 = d.f29811p;
                int i12 = d.f29812q;
                rect.set(i11, i12, d.f29806k + i11, d.f29807l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47688a.setEnabled(true);
                j01 j01Var = d.f29800b;
                if (j01Var != null) {
                    str = j01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f29801c;
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
