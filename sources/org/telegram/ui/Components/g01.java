package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g01 extends j1.b {
    public final Rect f24858o;
    public final i01 f24859p;

    public g01(i01 i01Var, i01 i01Var2) {
        super(i01Var2);
        this.f24859p = i01Var;
        this.f24858o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        i01 i01Var = this.f24859p;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 d = i01Var.d(i11);
            int i12 = d.f23342k;
            if (i12 > 0 && (i10 = d.f23343l) > 0) {
                int i13 = d.f23347p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f23348q;
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
        i01 i01Var = this.f24859p;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            b01 d = i01Var.d(i10);
            if (d.f23342k > 0 && d.f23343l > 0) {
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
        Rect rect = this.f24858o;
        if (i10 >= 0) {
            i01 i01Var = this.f24859p;
            if (i10 < i01Var.getChildCount()) {
                b01 d = i01Var.d(i10);
                int i11 = d.f23347p;
                int i12 = d.f23348q;
                rect.set(i11, i12, d.f23342k + i11, d.f23343l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f44795a.setEnabled(true);
                a01 a01Var = d.f23336b;
                if (a01Var != null) {
                    str = a01Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f23337c;
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
