package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g01 extends j1.b {
    public final Rect f26497o;
    public final i01 f26498p;

    public g01(i01 i01Var, i01 i01Var2) {
        super(i01Var2);
        this.f26498p = i01Var;
        this.f26497o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        i01 i01Var = this.f26498p;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 d = i01Var.d(i11);
            int i12 = d.f24905k;
            if (i12 > 0 && (i10 = d.f24906l) > 0) {
                int i13 = d.f24910p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f24911q;
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
        i01 i01Var = this.f26498p;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            b01 d = i01Var.d(i10);
            if (d.f24905k > 0 && d.f24906l > 0) {
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
        Rect rect = this.f26497o;
        if (i10 >= 0) {
            i01 i01Var = this.f26498p;
            if (i10 < i01Var.getChildCount()) {
                b01 d = i01Var.d(i10);
                int i11 = d.f24910p;
                int i12 = d.f24911q;
                rect.set(i11, i12, d.f24905k + i11, d.f24906l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f46300a.setEnabled(true);
                a01 a01Var = d.f24899b;
                if (a01Var != null) {
                    str = a01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f24900c;
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
