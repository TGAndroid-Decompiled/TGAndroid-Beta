package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class p30 extends FrameLayout {
    public float f29715a;
    public float f29716b;
    public boolean f29717c;
    public AnimatorSet d;
    public final o30 f29718e;
    public final vh f29719f;
    public final float h;
    public final r30 f29720n;

    public p30(r30 r30Var, Context context, float f7) {
        super(context);
        this.f29720n = r30Var;
        this.h = f7;
        this.f29718e = new o30(this);
        this.f29719f = new vh(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        r30 r30Var = this.f29720n;
        if (i12 != r30Var.I || r30Var.J != point.y) {
            r30Var.I = i12;
            r30Var.J = point.y;
            if (r30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f29720n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f29720n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            r30 r30Var2 = r30.f30386d0;
            if (r30Var2 != null) {
                r30 r30Var3 = this.f29720n;
                float f7 = r30Var3.K;
                float f10 = r30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                r30Var2.f30397r.x = (int) com.google.android.gms.internal.vision.e2.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                r30Var2.f30397r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                r30Var2.h();
                p30 p30Var = r30Var2.f30388a;
                if (p30Var.getParent() != null) {
                    r30Var2.f30396n.updateViewLayout(p30Var, r30Var2.f30397r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
