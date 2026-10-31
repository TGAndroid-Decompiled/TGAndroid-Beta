package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class e20 extends FrameLayout {
    public float f25623a;
    public float f25624b;
    public boolean f25625c;
    public AnimatorSet d;
    public final d20 e;
    public final org.telegram.messenger.rz f25626f;
    public final float h;
    public final g20 f25627n;

    public e20(g20 g20Var, Context context, float f7) {
        super(context);
        this.f25627n = g20Var;
        this.h = f7;
        this.e = new d20(this);
        this.f25626f = new org.telegram.messenger.rz(21);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = org.telegram.messenger.i0.f16026q;
        int i12 = point.x;
        g20 g20Var = this.f25627n;
        if (i12 != g20Var.I || g20Var.J != point.y) {
            g20Var.I = i12;
            g20Var.J = point.y;
            if (g20Var.K < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("groupcallpipconfig", 0);
                this.f25627n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f25627n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            g20 g20Var2 = g20.f26224d0;
            if (g20Var2 != null) {
                g20 g20Var3 = this.f25627n;
                float f7 = g20Var3.K;
                float f10 = g20Var3.L;
                float f11 = -org.telegram.messenger.i0.L(36.0f);
                g20Var2.f26234r.x = (int) c3.i0.z(point.x - (2.0f * f11), org.telegram.messenger.i0.L(105.0f), f7, f11);
                g20Var2.f26234r.y = (int) ((point.y - org.telegram.messenger.i0.L(105.0f)) * f10);
                g20Var2.h();
                e20 e20Var = g20Var2.f26226a;
                if (e20Var.getParent() != null) {
                    g20Var2.f26233n.updateViewLayout(e20Var, g20Var2.f26234r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e20.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
