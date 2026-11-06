package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class n10 extends FrameLayout {
    public float f36206a;
    public float f36207b;
    public boolean f36208c;
    public AnimatorSet d;
    public final m10 f36209e;
    public final l10 f36210f;
    public final float h;
    public final p10 f36211n;

    public n10(p10 p10Var, Context context, float f10) {
        super(context);
        this.f36211n = p10Var;
        this.h = f10;
        this.f36209e = new m10(this);
        this.f36210f = new l10(0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f22537q;
        int i11 = point.x;
        p10 p10Var = this.f36211n;
        if (i11 != p10Var.J || p10Var.K != point.y) {
            p10Var.J = i11;
            p10Var.K = point.y;
            if (p10Var.L < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("groupcallpipconfig", 0);
                this.f36211n.L = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f36211n.M = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            p10 p10Var2 = p10.f36845e0;
            if (p10Var2 != null) {
                p10 p10Var3 = this.f36211n;
                float f10 = p10Var3.L;
                float f11 = p10Var3.M;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                p10Var2.f36858s.x = (int) com.google.android.recaptcha.internal.a.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                p10Var2.f36858s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                p10Var2.i();
                n10 n10Var = p10Var2.f36847a;
                if (n10Var.getParent() != null) {
                    p10Var2.f36856n.updateViewLayout(n10Var, p10Var2.f36858s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
