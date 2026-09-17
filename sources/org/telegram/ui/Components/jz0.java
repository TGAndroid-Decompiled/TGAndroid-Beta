package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class jz0 extends j1.b {
    public final Rect f25470o;
    public final lz0 f25471p;

    public jz0(lz0 lz0Var, lz0 lz0Var2) {
        super(lz0Var2);
        this.f25471p = lz0Var;
        this.f25470o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        lz0 lz0Var = this.f25471p;
        int childCount = lz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ez0 d = lz0Var.d(i11);
            int i12 = d.f23708k;
            if (i12 > 0 && (i10 = d.f23709l) > 0) {
                int i13 = d.f23713p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f23714q;
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
        lz0 lz0Var = this.f25471p;
        int childCount = lz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ez0 d = lz0Var.d(i10);
            if (d.f23708k > 0 && d.f23709l > 0) {
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
        Rect rect = this.f25470o;
        if (i10 >= 0) {
            lz0 lz0Var = this.f25471p;
            if (i10 < lz0Var.getChildCount()) {
                ez0 d = lz0Var.d(i10);
                int i11 = d.f23713p;
                int i12 = d.f23714q;
                rect.set(i11, i12, d.f23708k + i11, d.f23709l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f42646a.setEnabled(true);
                dz0 dz0Var = d.f23702b;
                if (dz0Var != null) {
                    str = dz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f23703c;
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
