package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class tz0 extends j1.b {
    public final Rect f28484o;
    public final vz0 f28485p;

    public tz0(vz0 vz0Var, vz0 vz0Var2) {
        super(vz0Var2);
        this.f28485p = vz0Var;
        this.f28484o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        vz0 vz0Var = this.f28485p;
        int childCount = vz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            oz0 d = vz0Var.d(i11);
            int i12 = d.f27091k;
            if (i12 > 0 && (i10 = d.f27092l) > 0) {
                int i13 = d.f27096p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27097q;
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
        vz0 vz0Var = this.f28485p;
        int childCount = vz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            oz0 d = vz0Var.d(i10);
            if (d.f27091k > 0 && d.f27092l > 0) {
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
        Rect rect = this.f28484o;
        if (i10 >= 0) {
            vz0 vz0Var = this.f28485p;
            if (i10 < vz0Var.getChildCount()) {
                oz0 d = vz0Var.d(i10);
                int i11 = d.f27096p;
                int i12 = d.f27097q;
                rect.set(i11, i12, d.f27091k + i11, d.f27092l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f42923a.setEnabled(true);
                nz0 nz0Var = d.f27085b;
                if (nz0Var != null) {
                    str = nz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27086c;
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
