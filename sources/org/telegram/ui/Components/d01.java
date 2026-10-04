package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d01 extends j1.b {
    public final Rect f25503o;
    public final f01 f25504p;

    public d01(f01 f01Var, f01 f01Var2) {
        super(f01Var2);
        this.f25504p = f01Var;
        this.f25503o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        f01 f01Var = this.f25504p;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 d = f01Var.d(i11);
            int i12 = d.f33320k;
            if (i12 > 0 && (i10 = d.f33321l) > 0) {
                int i13 = d.f33325p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f33326q;
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
        f01 f01Var = this.f25504p;
        int childCount = f01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            yz0 d = f01Var.d(i10);
            if (d.f33320k > 0 && d.f33321l > 0) {
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
        Rect rect = this.f25503o;
        if (i10 >= 0) {
            f01 f01Var = this.f25504p;
            if (i10 < f01Var.getChildCount()) {
                yz0 d = f01Var.d(i10);
                int i11 = d.f33325p;
                int i12 = d.f33326q;
                rect.set(i11, i12, d.f33320k + i11, d.f33321l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f46478a.setEnabled(true);
                xz0 xz0Var = d.f33313b;
                if (xz0Var != null) {
                    str = xz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f33314c;
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
