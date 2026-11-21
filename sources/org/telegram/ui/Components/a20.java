package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class a20 extends FrameLayout {
    public float f33272a;
    public float f33273b;
    public boolean f33274c;
    public AnimatorSet d;
    public final z10 f33275e;
    public final me f33276f;
    public final float h;
    public final c20 f33277n;

    public a20(c20 c20Var, Context context, float f10) {
        super(context);
        this.f33277n = c20Var;
        this.h = f10;
        this.f33275e = new z10(this);
        this.f33276f = new me(8);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f24146q;
        int i11 = point.x;
        c20 c20Var = this.f33277n;
        if (i11 != c20Var.K || c20Var.L != point.y) {
            c20Var.K = i11;
            c20Var.L = point.y;
            if (c20Var.M < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26941b.getSharedPreferences("groupcallpipconfig", 0);
                this.f33277n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f33277n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            c20 c20Var2 = c20.f33987f0;
            if (c20Var2 != null) {
                c20 c20Var3 = this.f33277n;
                float f10 = c20Var3.M;
                float f11 = c20Var3.N;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                c20Var2.f34001s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                c20Var2.f34001s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                c20Var2.i();
                a20 a20Var = c20Var2.f33989a;
                if (a20Var.getParent() != null) {
                    c20Var2.f33999n.updateViewLayout(a20Var, c20Var2.f34001s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a20.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
