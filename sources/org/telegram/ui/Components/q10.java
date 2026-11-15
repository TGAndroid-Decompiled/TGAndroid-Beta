package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class q10 extends FrameLayout {
    public float f38464a;
    public float f38465b;
    public boolean f38466c;
    public AnimatorSet d;
    public final p10 f38467e;
    public final ih f38468f;
    public final float h;
    public final s10 f38469n;

    public q10(s10 s10Var, Context context, float f10) {
        super(context);
        this.f38469n = s10Var;
        this.h = f10;
        this.f38467e = new p10(this);
        this.f38468f = new ih(6);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f23611q;
        int i11 = point.x;
        s10 s10Var = this.f38469n;
        if (i11 != s10Var.K || s10Var.L != point.y) {
            s10Var.K = i11;
            s10Var.L = point.y;
            if (s10Var.M < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26609b.getSharedPreferences("groupcallpipconfig", 0);
                this.f38469n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f38469n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            s10 s10Var2 = s10.f39139f0;
            if (s10Var2 != null) {
                s10 s10Var3 = this.f38469n;
                float f10 = s10Var3.M;
                float f11 = s10Var3.N;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                s10Var2.f39153s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                s10Var2.f39153s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                s10Var2.i();
                q10 q10Var = s10Var2.f39141a;
                if (q10Var.getParent() != null) {
                    s10Var2.f39151n.updateViewLayout(q10Var, s10Var2.f39153s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
