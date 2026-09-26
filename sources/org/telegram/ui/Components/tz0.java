package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class tz0 extends j1.b {
    public final Rect f28630o;
    public final vz0 f28631p;

    public tz0(vz0 vz0Var, vz0 vz0Var2) {
        super(vz0Var2);
        this.f28631p = vz0Var;
        this.f28630o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        vz0 vz0Var = this.f28631p;
        int childCount = vz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            oz0 d = vz0Var.d(i11);
            int i12 = d.f27160k;
            if (i12 > 0 && (i10 = d.f27161l) > 0) {
                int i13 = d.f27165p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27166q;
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
        vz0 vz0Var = this.f28631p;
        int childCount = vz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            oz0 d = vz0Var.d(i10);
            if (d.f27160k > 0 && d.f27161l > 0) {
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
        Rect rect = this.f28630o;
        if (i10 >= 0) {
            vz0 vz0Var = this.f28631p;
            if (i10 < vz0Var.getChildCount()) {
                oz0 d = vz0Var.d(i10);
                int i11 = d.f27165p;
                int i12 = d.f27166q;
                rect.set(i11, i12, d.f27160k + i11, d.f27161l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f42908a.setEnabled(true);
                nz0 nz0Var = d.f27154b;
                if (nz0Var != null) {
                    str = nz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27155c;
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
