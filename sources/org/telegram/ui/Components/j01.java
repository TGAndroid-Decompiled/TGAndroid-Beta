package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j01 extends j1.b {
    public final Rect f27542o;
    public final l01 f27543p;

    public j01(l01 l01Var, l01 l01Var2) {
        super(l01Var2);
        this.f27543p = l01Var;
        this.f27542o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        l01 l01Var = this.f27543p;
        int childCount = l01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            e01 d = l01Var.d(i11);
            int i12 = d.f25895k;
            if (i12 > 0 && (i10 = d.f25896l) > 0) {
                int i13 = d.f25900p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f25901q;
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
        l01 l01Var = this.f27543p;
        int childCount = l01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e01 d = l01Var.d(i10);
            if (d.f25895k > 0 && d.f25896l > 0) {
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
        Rect rect = this.f27542o;
        if (i10 >= 0) {
            l01 l01Var = this.f27543p;
            if (i10 < l01Var.getChildCount()) {
                e01 d = l01Var.d(i10);
                int i11 = d.f25900p;
                int i12 = d.f25901q;
                rect.set(i11, i12, d.f25895k + i11, d.f25896l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47587a.setEnabled(true);
                d01 d01Var = d.f25888b;
                if (d01Var != null) {
                    str = d01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f25889c;
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
