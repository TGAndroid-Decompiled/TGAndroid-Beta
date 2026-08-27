package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class ry0 extends j1.b {

    public final Rect f32278o;

    public final ty0 f32279p;

    public ry0(ty0 ty0Var, ty0 ty0Var2) {
        super(ty0Var2);
        this.f32279p = ty0Var;
        this.f32278o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i10;
        ty0 ty0Var = this.f32279p;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            my0 my0VarD = ty0Var.d(i11);
            int i12 = my0VarD.f30786k;
            if (i12 > 0 && (i10 = my0VarD.f30787l) > 0) {
                int i13 = my0VarD.f30791p;
                if (f10 >= i13 && f10 < i13 + i12) {
                    int i14 = my0VarD.f30792q;
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
        ty0 ty0Var = this.f32279p;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 my0VarD = ty0Var.d(i10);
            if (my0VarD.f30786k > 0 && my0VarD.f30787l > 0) {
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
        Rect rect = this.f32278o;
        if (i10 >= 0) {
            ty0 ty0Var = this.f32279p;
            if (i10 < ty0Var.getChildCount()) {
                my0 my0VarD = ty0Var.d(i10);
                int i11 = my0VarD.f30791p;
                int i12 = my0VarD.f30792q;
                rect.set(i11, i12, my0VarD.f30786k + i11, my0VarD.f30787l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f47656a.setEnabled(true);
                ly0 ly0Var = my0VarD.f30779b;
                CharSequence text = ly0Var != null ? ly0Var.getText() : null;
                if (text == null || text.length() == 0) {
                    text = " ";
                }
                cVar.o(text);
                TL_iv.pageTableCell pagetablecell = my0VarD.f30780c;
                if (pagetablecell == null || !pagetablecell.header) {
                    return;
                }
                cVar.k(true);
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        cVar.h(rect);
        cVar.p(false);
        cVar.j("");
    }
}
