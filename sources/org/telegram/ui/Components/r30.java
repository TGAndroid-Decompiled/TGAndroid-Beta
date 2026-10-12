package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class r30 extends FrameLayout {
    public float f30024a;
    public float f30025b;
    public boolean f30026c;
    public AnimatorSet d;
    public final q30 f30027e;
    public final xh f30028f;
    public final float h;
    public final t30 f30029n;

    public r30(t30 t30Var, Context context, float f7) {
        super(context);
        this.f30029n = t30Var;
        this.h = f7;
        this.f30027e = new q30(this);
        this.f30028f = new xh(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        t30 t30Var = this.f30029n;
        if (i12 != t30Var.I || t30Var.J != point.y) {
            t30Var.I = i12;
            t30Var.J = point.y;
            if (t30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f30029n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f30029n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            t30 t30Var2 = t30.f30742d0;
            if (t30Var2 != null) {
                t30 t30Var3 = this.f30029n;
                float f7 = t30Var3.K;
                float f10 = t30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                t30Var2.f30753r.x = (int) com.google.android.gms.internal.vision.e2.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                t30Var2.f30753r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                t30Var2.h();
                r30 r30Var = t30Var2.f30744a;
                if (r30Var.getParent() != null) {
                    t30Var2.f30752n.updateViewLayout(r30Var, t30Var2.f30753r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
