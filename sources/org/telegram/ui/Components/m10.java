package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class m10 extends FrameLayout {
    public float f35787a;
    public float f35788b;
    public boolean f35789c;
    public AnimatorSet d;
    public final l10 f35790e;
    public final us f35791f;
    public final float h;
    public final p10 f35792n;

    public m10(p10 p10Var, Context context, float f10) {
        super(context);
        this.f35792n = p10Var;
        this.h = f10;
        this.f35790e = new l10(this);
        this.f35791f = new us(2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f22567q;
        int i11 = point.x;
        p10 p10Var = this.f35792n;
        if (i11 != p10Var.J || p10Var.K != point.y) {
            p10Var.J = i11;
            p10Var.K = point.y;
            if (p10Var.L < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("groupcallpipconfig", 0);
                this.f35792n.L = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f35792n.M = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            p10 p10Var2 = p10.f36761e0;
            if (p10Var2 != null) {
                p10 p10Var3 = this.f35792n;
                float f10 = p10Var3.L;
                float f11 = p10Var3.M;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                p10Var2.f36774s.x = (int) com.google.android.recaptcha.internal.a.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                p10Var2.f36774s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                p10Var2.i();
                m10 m10Var = p10Var2.f36763a;
                if (m10Var.getParent() != null) {
                    p10Var2.f36772n.updateViewLayout(m10Var, p10Var2.f36774s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
