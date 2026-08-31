package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class mz0 extends j1.b {
    public final Rect f29349o;
    public final oz0 f29350p;

    public mz0(oz0 oz0Var, oz0 oz0Var2) {
        super(oz0Var2);
        this.f29350p = oz0Var;
        this.f29349o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i10;
        oz0 oz0Var = this.f29350p;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            hz0 d = oz0Var.d(i11);
            int i12 = d.f27620k;
            if (i12 > 0 && (i10 = d.f27621l) > 0) {
                int i13 = d.f27625p;
                if (f10 >= i13 && f10 < i13 + i12) {
                    int i14 = d.f27626q;
                    if (f11 >= i14 && f11 < i14 + i10) {
                        return i11;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        oz0 oz0Var = this.f29350p;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hz0 d = oz0Var.d(i10);
            if (d.f27620k > 0 && d.f27621l > 0) {
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
        Rect rect = this.f29349o;
        if (i10 >= 0) {
            oz0 oz0Var = this.f29350p;
            if (i10 < oz0Var.getChildCount()) {
                hz0 d = oz0Var.d(i10);
                int i11 = d.f27625p;
                int i12 = d.f27626q;
                rect.set(i11, i12, d.f27620k + i11, d.f27621l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f46850a.setEnabled(true);
                gz0 gz0Var = d.f27613b;
                if (gz0Var != null) {
                    str = gz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27614c;
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
