package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class sz0 extends j1.b {
    public final Rect f28345o;
    public final uz0 f28346p;

    public sz0(uz0 uz0Var, uz0 uz0Var2) {
        super(uz0Var2);
        this.f28346p = uz0Var;
        this.f28345o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        uz0 uz0Var = this.f28346p;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            nz0 d = uz0Var.d(i11);
            int i12 = d.f26846k;
            if (i12 > 0 && (i10 = d.f26847l) > 0) {
                int i13 = d.f26851p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f26852q;
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
        uz0 uz0Var = this.f28346p;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            nz0 d = uz0Var.d(i10);
            if (d.f26846k > 0 && d.f26847l > 0) {
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
        Rect rect = this.f28345o;
        if (i10 >= 0) {
            uz0 uz0Var = this.f28346p;
            if (i10 < uz0Var.getChildCount()) {
                nz0 d = uz0Var.d(i10);
                int i11 = d.f26851p;
                int i12 = d.f26852q;
                rect.set(i11, i12, d.f26846k + i11, d.f26847l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f42910a.setEnabled(true);
                mz0 mz0Var = d.f26840b;
                if (mz0Var != null) {
                    str = mz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f26841c;
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
