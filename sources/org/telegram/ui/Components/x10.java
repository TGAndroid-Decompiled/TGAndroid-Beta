package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class x10 extends FrameLayout {
    public float f41858a;
    public float f41859b;
    public boolean f41860c;
    public AnimatorSet d;
    public final w10 f41861e;
    public final me f41862f;
    public final float h;
    public final z10 f41863n;

    public x10(z10 z10Var, Context context, float f10) {
        super(context);
        this.f41863n = z10Var;
        this.h = f10;
        this.f41861e = new w10(this);
        this.f41862f = new me(8);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.f24118q;
        int i11 = point.x;
        z10 z10Var = this.f41863n;
        if (i11 != z10Var.K || z10Var.L != point.y) {
            z10Var.K = i11;
            z10Var.L = point.y;
            if (z10Var.M < 0.0f) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("groupcallpipconfig", 0);
                this.f41863n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f41863n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            z10 z10Var2 = z10.f42710f0;
            if (z10Var2 != null) {
                z10 z10Var3 = this.f41863n;
                float f10 = z10Var3.M;
                float f11 = z10Var3.N;
                float f12 = -org.telegram.messenger.g0.L(36.0f);
                z10Var2.f42724s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
                z10Var2.f42724s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
                z10Var2.i();
                x10 x10Var = z10Var2.f42712a;
                if (x10Var.getParent() != null) {
                    z10Var2.f42722n.updateViewLayout(x10Var, z10Var2.f42724s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
