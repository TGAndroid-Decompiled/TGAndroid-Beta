package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
public final class rs0 extends org.telegram.ui.h11 {
    public final wv0 H;

    public rs0(wv0 wv0Var, Context context, nw0 nw0Var, ci.v6 v6Var, qs0 qs0Var) {
        super(context, nw0Var, v6Var, qs0Var);
        this.H = wv0Var;
    }

    @Override
    public final void b() {
        vs0 vs0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        wv0 wv0Var = this.H;
        pu0[] pu0VarArr = wv0Var.f32386k0;
        if (pu0VarArr != null) {
            for (pu0 pu0Var : pu0VarArr) {
                if (pu0Var != null && (vs0Var = pu0Var.h) != null) {
                    int paddingTop = vs0Var.getPaddingTop();
                    vs0 vs0Var2 = pu0Var.h;
                    int paddingLeft = vs0Var2.getPaddingLeft();
                    int a02 = wv0Var.a0(pu0Var.F);
                    int paddingRight = pu0Var.h.getPaddingRight();
                    vs0 vs0Var3 = pu0Var.h;
                    int Z = wv0Var.Z(wv0Var.y0());
                    vs0Var3.f29392f3 = Z;
                    vs0Var2.setPadding(paddingLeft, a02, paddingRight, Z);
                    int paddingTop2 = paddingTop - pu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(pu0Var.h, new yr0(pu0Var, paddingTop2, 1));
                    }
                }
                if (pu0Var != null && pu0Var.v != null) {
                    wv0Var.v1(pu0Var);
                }
            }
        }
        wv0Var.L();
    }
}
