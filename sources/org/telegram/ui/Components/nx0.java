package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class nx0 extends k1.b {
    public final Rect f37735o;
    public final px0 f37736p;

    public nx0(px0 px0Var, px0 px0Var2) {
        super(px0Var2);
        this.f37736p = px0Var;
        this.f37735o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        px0 px0Var = this.f37736p;
        int childCount = px0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ix0 d = px0Var.d(i10);
            int i11 = d.f35755k;
            if (i11 > 0 && (i7 = d.f35756l) > 0) {
                int i12 = d.f35760p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f35761q;
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
        px0 px0Var = this.f37736p;
        int childCount = px0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ix0 d = px0Var.d(i7);
            if (d.f35755k > 0 && d.f35756l > 0) {
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
        Rect rect = this.f37735o;
        if (i7 >= 0) {
            px0 px0Var = this.f37736p;
            if (i7 < px0Var.getChildCount()) {
                ix0 d = px0Var.d(i7);
                int i10 = d.f35760p;
                int i11 = d.f35761q;
                rect.set(i10, i11, d.f35755k + i10, d.f35756l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f56166a.setEnabled(true);
                hx0 hx0Var = d.f35748b;
                if (hx0Var != null) {
                    str = hx0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f35749c;
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
