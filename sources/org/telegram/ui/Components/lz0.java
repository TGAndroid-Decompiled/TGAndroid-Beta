package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class lz0 extends j1.b {
    public final Rect f26898o;
    public final nz0 f26899p;

    public lz0(nz0 nz0Var, nz0 nz0Var2) {
        super(nz0Var2);
        this.f26899p = nz0Var;
        this.f26898o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i10;
        nz0 nz0Var = this.f26899p;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 d = nz0Var.d(i11);
            int i12 = d.f25268k;
            if (i12 > 0 && (i10 = d.f25269l) > 0) {
                int i13 = d.f25273p;
                if (f10 >= i13 && f10 < i13 + i12) {
                    int i14 = d.f25274q;
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
        nz0 nz0Var = this.f26899p;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gz0 d = nz0Var.d(i10);
            if (d.f25268k > 0 && d.f25269l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override
    public final void l(int i10, s0.e eVar) {
        String str;
        Rect rect = this.f26898o;
        if (i10 >= 0) {
            nz0 nz0Var = this.f26899p;
            if (i10 < nz0Var.getChildCount()) {
                gz0 d = nz0Var.d(i10);
                int i11 = d.f25273p;
                int i12 = d.f25274q;
                rect.set(i11, i12, d.f25268k + i11, d.f25269l + i12);
                eVar.h(rect);
                eVar.i("android.widget.TextView");
                eVar.f43904a.setEnabled(true);
                fz0 fz0Var = d.f25262b;
                if (fz0Var != null) {
                    str = fz0Var.getText();
                } else {
                    str = null;
                }
                eVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f25263c;
                if (pagetablecell != null && pagetablecell.header) {
                    eVar.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        eVar.h(rect);
        eVar.p(false);
        eVar.j("");
    }
}
