package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class n10 extends FrameLayout {
    public float f36194a;
    public float f36195b;
    public boolean f36196c;
    public AnimatorSet d;
    public final m10 f36197e;
    public final vs f36198f;
    public final float h;
    public final q10 f36199n;

    public n10(q10 q10Var, Context context, float f10) {
        super(context);
        this.f36199n = q10Var;
        this.h = f10;
        this.f36197e = new m10(this);
        this.f36198f = new vs(2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f22563q;
        int i11 = point.x;
        q10 q10Var = this.f36199n;
        if (i11 != q10Var.J || q10Var.K != point.y) {
            q10Var.J = i11;
            q10Var.K = point.y;
            if (q10Var.L < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("groupcallpipconfig", 0);
                this.f36199n.L = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f36199n.M = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            q10 q10Var2 = q10.f37162e0;
            if (q10Var2 != null) {
                q10 q10Var3 = this.f36199n;
                float f10 = q10Var3.L;
                float f11 = q10Var3.M;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                q10Var2.f37175s.x = (int) com.google.android.recaptcha.internal.a.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                q10Var2.f37175s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                q10Var2.i();
                n10 n10Var = q10Var2.f37164a;
                if (n10Var.getParent() != null) {
                    q10Var2.f37173n.updateViewLayout(n10Var, q10Var2.f37175s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
