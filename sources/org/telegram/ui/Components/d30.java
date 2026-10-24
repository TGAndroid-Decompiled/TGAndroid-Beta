package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class d30 extends FrameLayout {
    public float f25533a;
    public float f25534b;
    public boolean f25535c;
    public AnimatorSet d;
    public final c30 e;
    public final pc f25536f;
    public final float h;
    public final g30 f25537n;

    public d30(g30 g30Var, Context context, float f7) {
        super(context);
        this.f25537n = g30Var;
        this.h = f7;
        this.e = new c30(this);
        this.f25536f = new pc(11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        g30 g30Var = this.f25537n;
        if (i12 != g30Var.I || g30Var.J != point.y) {
            g30Var.I = i12;
            g30Var.J = point.y;
            if (g30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f25537n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f25537n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            g30 g30Var2 = g30.f26535d0;
            if (g30Var2 != null) {
                g30 g30Var3 = this.f25537n;
                float f7 = g30Var3.K;
                float f10 = g30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                g30Var2.f26545r.x = (int) com.google.android.gms.internal.play_billing.k3.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                g30Var2.f26545r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                g30Var2.h();
                d30 d30Var = g30Var2.f26537a;
                if (d30Var.getParent() != null) {
                    g30Var2.f26544n.updateViewLayout(d30Var, g30Var2.f26545r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
