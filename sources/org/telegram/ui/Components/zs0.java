package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends org.telegram.ui.l11 {
    public final aw0 f35400w;

    public zs0(aw0 aw0Var, Context context, di.v6 v6Var, ys0 ys0Var) {
        super(context, v6Var, ys0Var);
        this.f35400w = aw0Var;
    }

    @Override
    public final void b() {
        dt0 dt0Var;
        Rect rect = this.f41117s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        aw0 aw0Var = this.f35400w;
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr != null) {
            for (tu0 tu0Var : tu0VarArr) {
                if (tu0Var != null && (dt0Var = tu0Var.h) != null) {
                    int paddingTop = dt0Var.getPaddingTop();
                    dt0 dt0Var2 = tu0Var.h;
                    int paddingLeft = dt0Var2.getPaddingLeft();
                    int g02 = aw0Var.g0(tu0Var.E);
                    int paddingRight = tu0Var.h.getPaddingRight();
                    dt0 dt0Var3 = tu0Var.h;
                    int f02 = aw0Var.f0(aw0Var.D0());
                    dt0Var3.f32685i3 = f02;
                    dt0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
                    int paddingTop2 = paddingTop - tu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(tu0Var.h, new es0(tu0Var, paddingTop2, 2));
                    }
                }
                if (tu0Var != null && tu0Var.f33162s != null) {
                    aw0Var.E1(tu0Var);
                }
            }
        }
        aw0Var.R();
    }
}
