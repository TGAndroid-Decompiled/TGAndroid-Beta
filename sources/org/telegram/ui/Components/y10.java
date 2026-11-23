package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class y10 extends FrameLayout {
    public float f42288a;
    public float f42289b;
    public boolean f42290c;
    public AnimatorSet d;
    public final x10 f42291e;
    public final ne f42292f;
    public final float h;
    public final a20 f42293n;

    public y10(a20 a20Var, Context context, float f10) {
        super(context);
        this.f42293n = a20Var;
        this.h = f10;
        this.f42291e = new x10(this);
        this.f42292f = new ne(8);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f24226q;
        int i11 = point.x;
        a20 a20Var = this.f42293n;
        if (i11 != a20Var.K || a20Var.L != point.y) {
            a20Var.K = i11;
            a20Var.L = point.y;
            if (a20Var.M < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("groupcallpipconfig", 0);
                this.f42293n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f42293n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            a20 a20Var2 = a20.f33323f0;
            if (a20Var2 != null) {
                a20 a20Var3 = this.f42293n;
                float f10 = a20Var3.M;
                float f11 = a20Var3.N;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                a20Var2.f33337s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                a20Var2.f33337s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                a20Var2.i();
                y10 y10Var = a20Var2.f33325a;
                if (y10Var.getParent() != null) {
                    a20Var2.f33335n.updateViewLayout(y10Var, a20Var2.f33337s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
