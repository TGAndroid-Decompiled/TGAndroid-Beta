package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class f30 extends FrameLayout {
    public float f26067a;
    public float f26068b;
    public boolean f26069c;
    public AnimatorSet d;
    public final e30 e;
    public final sc f26070f;
    public final float h;
    public final i30 f26071n;

    public f30(i30 i30Var, Context context, float f7) {
        super(context);
        this.f26071n = i30Var;
        this.h = f7;
        this.e = new e30(this);
        this.f26070f = new sc(10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        i30 i30Var = this.f26071n;
        if (i12 != i30Var.I || i30Var.J != point.y) {
            i30Var.I = i12;
            i30Var.J = point.y;
            if (i30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f26071n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f26071n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            i30 i30Var2 = i30.f27049d0;
            if (i30Var2 != null) {
                i30 i30Var3 = this.f26071n;
                float f7 = i30Var3.K;
                float f10 = i30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                i30Var2.f27059r.x = (int) com.google.android.gms.internal.play_billing.k3.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                i30Var2.f27059r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                i30Var2.h();
                f30 f30Var = i30Var2.f27051a;
                if (f30Var.getParent() != null) {
                    i30Var2.f27058n.updateViewLayout(f30Var, i30Var2.f27059r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
