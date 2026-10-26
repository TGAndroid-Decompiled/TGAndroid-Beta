package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class h30 extends FrameLayout {
    public float f28793a;
    public float f28794b;
    public boolean f28795c;
    public AnimatorSet d;
    public final g30 e;
    public final k5 f28796f;
    public final float h;
    public final k30 f28797n;

    public h30(k30 k30Var, Context context, float f7) {
        super(context);
        this.f28797n = k30Var;
        this.h = f7;
        this.e = new g30(this);
        this.f28796f = new k5(13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        k30 k30Var = this.f28797n;
        if (i12 != k30Var.I || k30Var.J != point.y) {
            k30Var.I = i12;
            k30Var.J = point.y;
            if (k30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f28797n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f28797n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            k30 k30Var2 = k30.f29786d0;
            if (k30Var2 != null) {
                k30 k30Var3 = this.f28797n;
                float f7 = k30Var3.K;
                float f10 = k30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                k30Var2.f29796r.x = (int) c3.h0.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                k30Var2.f29796r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                k30Var2.h();
                h30 h30Var = k30Var2.f29788a;
                if (h30Var.getParent() != null) {
                    k30Var2.f29795n.updateViewLayout(h30Var, k30Var2.f29796r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
