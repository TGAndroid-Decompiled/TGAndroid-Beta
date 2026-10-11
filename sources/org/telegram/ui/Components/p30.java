package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class p30 extends FrameLayout {
    public float f29600a;
    public float f29601b;
    public boolean f29602c;
    public AnimatorSet d;
    public final o30 f29603e;
    public final vh f29604f;
    public final float h;
    public final r30 f29605n;

    public p30(r30 r30Var, Context context, float f7) {
        super(context);
        this.f29605n = r30Var;
        this.h = f7;
        this.f29603e = new o30(this);
        this.f29604f = new vh(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        r30 r30Var = this.f29605n;
        if (i12 != r30Var.I || r30Var.J != point.y) {
            r30Var.I = i12;
            r30Var.J = point.y;
            if (r30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f29605n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f29605n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            r30 r30Var2 = r30.f30317d0;
            if (r30Var2 != null) {
                r30 r30Var3 = this.f29605n;
                float f7 = r30Var3.K;
                float f10 = r30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                r30Var2.f30328r.x = (int) com.google.android.gms.internal.vision.e2.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                r30Var2.f30328r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                r30Var2.h();
                p30 p30Var = r30Var2.f30319a;
                if (p30Var.getParent() != null) {
                    r30Var2.f30327n.updateViewLayout(p30Var, r30Var2.f30328r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
