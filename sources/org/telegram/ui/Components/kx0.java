package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class kx0 extends k1.b {
    public final Rect f35461o;
    public final mx0 f35462p;

    public kx0(mx0 mx0Var, mx0 mx0Var2) {
        super(mx0Var2);
        this.f35462p = mx0Var;
        this.f35461o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        mx0 mx0Var = this.f35462p;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            fx0 d = mx0Var.d(i10);
            int i11 = d.f33672k;
            if (i11 > 0 && (i7 = d.f33673l) > 0) {
                int i12 = d.f33677p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f33678q;
                    if (f11 >= i13 && f11 < i13 + i7) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        mx0 mx0Var = this.f35462p;
        int childCount = mx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            fx0 d = mx0Var.d(i7);
            if (d.f33672k > 0 && d.f33673l > 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return false;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        String str;
        Rect rect = this.f35461o;
        if (i7 >= 0) {
            mx0 mx0Var = this.f35462p;
            if (i7 < mx0Var.getChildCount()) {
                fx0 d = mx0Var.d(i7);
                int i10 = d.f33677p;
                int i11 = d.f33678q;
                rect.set(i10, i11, d.f33672k + i10, d.f33673l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f54612a.setEnabled(true);
                ex0 ex0Var = d.f33665b;
                if (ex0Var != null) {
                    str = ex0Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f33666c;
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
