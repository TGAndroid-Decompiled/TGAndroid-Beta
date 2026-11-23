package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class vx0 extends k1.b {
    public final Rect f41442o;
    public final xx0 f41443p;

    public vx0(xx0 xx0Var, xx0 xx0Var2) {
        super(xx0Var2);
        this.f41443p = xx0Var;
        this.f41442o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        xx0 xx0Var = this.f41443p;
        int childCount = xx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qx0 d = xx0Var.d(i10);
            int i11 = d.f39025k;
            if (i11 > 0 && (i7 = d.f39026l) > 0) {
                int i12 = d.f39030p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f39031q;
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
        xx0 xx0Var = this.f41443p;
        int childCount = xx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            qx0 d = xx0Var.d(i7);
            if (d.f39025k > 0 && d.f39026l > 0) {
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
        Rect rect = this.f41442o;
        if (i7 >= 0) {
            xx0 xx0Var = this.f41443p;
            if (i7 < xx0Var.getChildCount()) {
                qx0 d = xx0Var.d(i7);
                int i10 = d.f39030p;
                int i11 = d.f39031q;
                rect.set(i10, i11, d.f39025k + i10, d.f39026l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f56863a.setEnabled(true);
                px0 px0Var = d.f39018b;
                if (px0Var != null) {
                    str = px0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f39019c;
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
