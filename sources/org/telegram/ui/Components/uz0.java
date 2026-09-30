package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class uz0 extends j1.b {
    public final Rect f28900o;
    public final wz0 f28901p;

    public uz0(wz0 wz0Var, wz0 wz0Var2) {
        super(wz0Var2);
        this.f28901p = wz0Var;
        this.f28900o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        wz0 wz0Var = this.f28901p;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 d = wz0Var.d(i11);
            int i12 = d.f27461k;
            if (i12 > 0 && (i10 = d.f27462l) > 0) {
                int i13 = d.f27466p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f27467q;
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
        wz0 wz0Var = this.f28901p;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            pz0 d = wz0Var.d(i10);
            if (d.f27461k > 0 && d.f27462l > 0) {
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
        Rect rect = this.f28900o;
        if (i10 >= 0) {
            wz0 wz0Var = this.f28901p;
            if (i10 < wz0Var.getChildCount()) {
                pz0 d = wz0Var.d(i10);
                int i11 = d.f27466p;
                int i12 = d.f27467q;
                rect.set(i11, i12, d.f27461k + i11, d.f27462l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f42911a.setEnabled(true);
                oz0 oz0Var = d.f27455b;
                if (oz0Var != null) {
                    str = oz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f27456c;
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
