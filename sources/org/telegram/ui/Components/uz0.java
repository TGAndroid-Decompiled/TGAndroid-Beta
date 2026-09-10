package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class uz0 extends j1.b {
    public final Rect f27766o;
    public final wz0 f27767p;

    public uz0(wz0 wz0Var, wz0 wz0Var2) {
        super(wz0Var2);
        this.f27767p = wz0Var;
        this.f27766o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        wz0 wz0Var = this.f27767p;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 d = wz0Var.d(i11);
            int i12 = d.f26281k;
            if (i12 > 0 && (i10 = d.f26282l) > 0) {
                int i13 = d.f26286p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f26287q;
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
        wz0 wz0Var = this.f27767p;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            pz0 d = wz0Var.d(i10);
            if (d.f26281k > 0 && d.f26282l > 0) {
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
        Rect rect = this.f27766o;
        if (i10 >= 0) {
            wz0 wz0Var = this.f27767p;
            if (i10 < wz0Var.getChildCount()) {
                pz0 d = wz0Var.d(i10);
                int i11 = d.f26286p;
                int i12 = d.f26287q;
                rect.set(i11, i12, d.f26281k + i11, d.f26282l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f41559a.setEnabled(true);
                oz0 oz0Var = d.f26275b;
                if (oz0Var != null) {
                    str = oz0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f26276c;
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
