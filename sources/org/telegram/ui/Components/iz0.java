package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class iz0 extends j1.b {
    public final Rect f25167o;
    public final kz0 f25168p;

    public iz0(kz0 kz0Var, kz0 kz0Var2) {
        super(kz0Var2);
        this.f25168p = kz0Var;
        this.f25167o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        kz0 kz0Var = this.f25168p;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            dz0 d = kz0Var.d(i11);
            int i12 = d.f23440k;
            if (i12 > 0 && (i10 = d.f23441l) > 0) {
                int i13 = d.f23445p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f23446q;
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
        kz0 kz0Var = this.f25168p;
        int childCount = kz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            dz0 d = kz0Var.d(i10);
            if (d.f23440k > 0 && d.f23441l > 0) {
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
        Rect rect = this.f25167o;
        if (i10 >= 0) {
            kz0 kz0Var = this.f25168p;
            if (i10 < kz0Var.getChildCount()) {
                dz0 d = kz0Var.d(i10);
                int i11 = d.f23445p;
                int i12 = d.f23446q;
                rect.set(i11, i12, d.f23440k + i11, d.f23441l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f42620a.setEnabled(true);
                cz0 cz0Var = d.f23434b;
                if (cz0Var != null) {
                    str = cz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f23435c;
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
