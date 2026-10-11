package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class l01 extends j1.b {
    public final Rect f28135o;
    public final n01 f28136p;

    public l01(n01 n01Var, n01 n01Var2) {
        super(n01Var2);
        this.f28136p = n01Var;
        this.f28135o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        n01 n01Var = this.f28136p;
        int childCount = n01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            g01 d = n01Var.d(i11);
            int i12 = d.f26551k;
            if (i12 > 0 && (i10 = d.f26552l) > 0) {
                int i13 = d.f26556p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f26557q;
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
        n01 n01Var = this.f28136p;
        int childCount = n01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            g01 d = n01Var.d(i10);
            if (d.f26551k > 0 && d.f26552l > 0) {
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
        Rect rect = this.f28135o;
        if (i10 >= 0) {
            n01 n01Var = this.f28136p;
            if (i10 < n01Var.getChildCount()) {
                g01 d = n01Var.d(i10);
                int i11 = d.f26556p;
                int i12 = d.f26557q;
                rect.set(i11, i12, d.f26551k + i11, d.f26552l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47677a.setEnabled(true);
                f01 f01Var = d.f26544b;
                if (f01Var != null) {
                    str = f01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f26545c;
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
