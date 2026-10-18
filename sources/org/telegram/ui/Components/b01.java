package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class b01 extends j1.b {
    public final Rect f24756o;
    public final d01 f24757p;

    public b01(d01 d01Var, d01 d01Var2) {
        super(d01Var2);
        this.f24757p = d01Var;
        this.f24756o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        d01 d01Var = this.f24757p;
        int childCount = d01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            wz0 d = d01Var.d(i11);
            int i12 = d.f32253k;
            if (i12 > 0 && (i10 = d.f32254l) > 0) {
                int i13 = d.f32258p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f32259q;
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
        d01 d01Var = this.f24757p;
        int childCount = d01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            wz0 d = d01Var.d(i10);
            if (d.f32253k > 0 && d.f32254l > 0) {
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
        Rect rect = this.f24756o;
        if (i10 >= 0) {
            d01 d01Var = this.f24757p;
            if (i10 < d01Var.getChildCount()) {
                wz0 d = d01Var.d(i10);
                int i11 = d.f32258p;
                int i12 = d.f32259q;
                rect.set(i11, i12, d.f32253k + i11, d.f32254l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f45867a.setEnabled(true);
                vz0 vz0Var = d.f32247b;
                if (vz0Var != null) {
                    str = vz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f32248c;
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
