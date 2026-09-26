package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class m20 {
    public static final int f26285w = ViewConfiguration.getTapTimeout();
    public final int f26286a;
    public final int f26287b;
    public final int f26288c;
    public final int d;
    public final n20 f26289f;
    public final n20 f26290g;
    public boolean h;
    public boolean f26291i;
    public boolean f26292j;
    public boolean f26293k;
    public boolean f26294l;
    public MotionEvent f26295m;
    public MotionEvent f26296n;
    public boolean f26297o;
    public float f26298p;
    public float f26299q;
    public float f26300r;
    public float f26301s;
    public boolean f26302t;
    public VelocityTracker v;
    public long f26303u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public m20(Context context, n20 n20Var) {
        this.f26289f = n20Var;
        this.f26290g = n20Var;
        if (context != null) {
            this.f26302t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26288c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26286a = scaledTouchSlop * scaledTouchSlop;
            this.f26287b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
