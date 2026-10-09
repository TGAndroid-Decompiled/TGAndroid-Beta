package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class o30 extends FrameLayout {
    public float f29373a;
    public float f29374b;
    public boolean f29375c;
    public AnimatorSet d;
    public final n30 f29376e;
    public final vh f29377f;
    public final float h;
    public final q30 f29378n;

    public o30(q30 q30Var, Context context, float f7) {
        super(context);
        this.f29378n = q30Var;
        this.h = f7;
        this.f29376e = new n30(this);
        this.f29377f = new vh(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        q30 q30Var = this.f29378n;
        if (i12 != q30Var.I || q30Var.J != point.y) {
            q30Var.I = i12;
            q30Var.J = point.y;
            if (q30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f29378n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f29378n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            q30 q30Var2 = q30.f30009d0;
            if (q30Var2 != null) {
                q30 q30Var3 = this.f29378n;
                float f7 = q30Var3.K;
                float f10 = q30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                q30Var2.f30020r.x = (int) com.google.android.gms.internal.vision.e2.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                q30Var2.f30020r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                q30Var2.h();
                o30 o30Var = q30Var2.f30011a;
                if (o30Var.getParent() != null) {
                    q30Var2.f30019n.updateViewLayout(o30Var, q30Var2.f30020r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o30.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
