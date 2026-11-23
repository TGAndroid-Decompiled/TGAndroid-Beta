package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class wx0 extends k1.b {
    public final Rect f41912o;
    public final yx0 f41913p;

    public wx0(yx0 yx0Var, yx0 yx0Var2) {
        super(yx0Var2);
        this.f41913p = yx0Var;
        this.f41912o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        yx0 yx0Var = this.f41913p;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            rx0 d = yx0Var.d(i10);
            int i11 = d.f39376k;
            if (i11 > 0 && (i7 = d.f39377l) > 0) {
                int i12 = d.f39381p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f39382q;
                    if (f11 >= i13 && f11 < i13 + i7) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        yx0 yx0Var = this.f41913p;
        int childCount = yx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            rx0 d = yx0Var.d(i7);
            if (d.f39376k > 0 && d.f39377l > 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return false;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        String str;
        Rect rect = this.f41912o;
        if (i7 >= 0) {
            yx0 yx0Var = this.f41913p;
            if (i7 < yx0Var.getChildCount()) {
                rx0 d = yx0Var.d(i7);
                int i10 = d.f39381p;
                int i11 = d.f39382q;
                rect.set(i10, i11, d.f39376k + i10, d.f39377l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f56785a.setEnabled(true);
                qx0 qx0Var = d.f39369b;
                if (qx0Var != null) {
                    str = qx0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f39370c;
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
