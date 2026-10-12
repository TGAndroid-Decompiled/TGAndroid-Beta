package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f01 extends j1.b {
    public final Rect f24845o;
    public final h01 f24846p;

    public f01(h01 h01Var, h01 h01Var2) {
        super(h01Var2);
        this.f24846p = h01Var;
        this.f24845o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        h01 h01Var = this.f24846p;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 d = h01Var.d(i11);
            int i12 = d.f23375k;
            if (i12 > 0 && (i10 = d.f23376l) > 0) {
                int i13 = d.f23380p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f23381q;
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
        h01 h01Var = this.f24846p;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            a01 d = h01Var.d(i10);
            if (d.f23375k > 0 && d.f23376l > 0) {
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
        Rect rect = this.f24845o;
        if (i10 >= 0) {
            h01 h01Var = this.f24846p;
            if (i10 < h01Var.getChildCount()) {
                a01 d = h01Var.d(i10);
                int i11 = d.f23380p;
                int i12 = d.f23381q;
                rect.set(i11, i12, d.f23375k + i11, d.f23376l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f44795a.setEnabled(true);
                zz0 zz0Var = d.f23369b;
                if (zz0Var != null) {
                    str = zz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f23370c;
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
