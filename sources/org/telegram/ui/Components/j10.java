package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class j10 extends FrameLayout {
    public float f34910a;
    public float f34911b;
    public boolean f34912c;
    public AnimatorSet d;
    public final i10 f34913e;
    public final go f34914f;
    public final float h;
    public final l10 f34915n;

    public j10(l10 l10Var, Context context, float f10) {
        super(context);
        this.f34915n = l10Var;
        this.h = f10;
        this.f34913e = new i10(this);
        this.f34914f = new go(4);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Point point = org.telegram.messenger.g0.f22608q;
        int i11 = point.x;
        l10 l10Var = this.f34915n;
        if (i11 != l10Var.J || l10Var.K != point.y) {
            l10Var.J = i11;
            l10Var.K = point.y;
            if (l10Var.L < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("groupcallpipconfig", 0);
                this.f34915n.L = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f34915n.M = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            l10 l10Var2 = l10.f35545e0;
            if (l10Var2 != null) {
                l10 l10Var3 = this.f34915n;
                float f10 = l10Var3.L;
                float f11 = l10Var3.M;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                l10Var2.f35557r.x = (int) com.google.android.recaptcha.internal.a.y(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                l10Var2.f35557r.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                l10Var2.h();
                j10 j10Var = l10Var2.f35547a;
                if (j10Var.getParent() != null) {
                    l10Var2.f35556n.updateViewLayout(j10Var, l10Var2.f35557r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
