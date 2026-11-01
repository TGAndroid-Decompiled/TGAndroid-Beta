package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class e20 extends FrameLayout {
    public float f25668a;
    public float f25669b;
    public boolean f25670c;
    public AnimatorSet d;
    public final d20 e;
    public final org.telegram.messenger.sz f25671f;
    public final float h;
    public final g20 f25672n;

    public e20(g20 g20Var, Context context, float f7) {
        super(context);
        this.f25672n = g20Var;
        this.h = f7;
        this.e = new d20(this);
        this.f25671f = new org.telegram.messenger.sz(21);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = org.telegram.messenger.i0.f16172q;
        int i12 = point.x;
        g20 g20Var = this.f25672n;
        if (i12 != g20Var.I || g20Var.J != point.y) {
            g20Var.I = i12;
            g20Var.J = point.y;
            if (g20Var.K < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("groupcallpipconfig", 0);
                this.f25672n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f25672n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            g20 g20Var2 = g20.f26296d0;
            if (g20Var2 != null) {
                g20 g20Var3 = this.f25672n;
                float f7 = g20Var3.K;
                float f10 = g20Var3.L;
                float f11 = -org.telegram.messenger.i0.L(36.0f);
                g20Var2.f26306r.x = (int) c3.i0.z(point.x - (2.0f * f11), org.telegram.messenger.i0.L(105.0f), f7, f11);
                g20Var2.f26306r.y = (int) ((point.y - org.telegram.messenger.i0.L(105.0f)) * f10);
                g20Var2.h();
                e20 e20Var = g20Var2.f26298a;
                if (e20Var.getParent() != null) {
                    g20Var2.f26305n.updateViewLayout(e20Var, g20Var2.f26306r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e20.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
