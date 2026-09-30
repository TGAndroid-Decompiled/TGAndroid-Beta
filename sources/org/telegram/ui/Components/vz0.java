package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class vz0 extends j1.b {
    public final Rect f29745o;
    public final xz0 f29746p;

    public vz0(xz0 xz0Var, xz0 xz0Var2) {
        super(xz0Var2);
        this.f29746p = xz0Var;
        this.f29745o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        xz0 xz0Var = this.f29746p;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            qz0 d = xz0Var.d(i11);
            int i12 = d.f27775k;
            if (i12 > 0 && (i10 = d.f27776l) > 0) {
                int i13 = d.f27780p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27781q;
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
        xz0 xz0Var = this.f29746p;
        int childCount = xz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qz0 d = xz0Var.d(i10);
            if (d.f27775k > 0 && d.f27776l > 0) {
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
        Rect rect = this.f29745o;
        if (i10 >= 0) {
            xz0 xz0Var = this.f29746p;
            if (i10 < xz0Var.getChildCount()) {
                qz0 d = xz0Var.d(i10);
                int i11 = d.f27780p;
                int i12 = d.f27781q;
                rect.set(i11, i12, d.f27775k + i11, d.f27776l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f43017a.setEnabled(true);
                pz0 pz0Var = d.f27769b;
                if (pz0Var != null) {
                    str = pz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27770c;
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
