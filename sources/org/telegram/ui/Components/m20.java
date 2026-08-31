package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class m20 {
    public static final int f28895w = ViewConfiguration.getTapTimeout();
    public final int f28896a;
    public final int f28897b;
    public final int f28898c;
    public final int d;
    public final n20 f28900f;
    public final n20 f28901g;
    public boolean h;
    public boolean f28902i;
    public boolean f28903j;
    public boolean f28904k;
    public boolean f28905l;
    public MotionEvent f28906m;
    public MotionEvent f28907n;
    public boolean f28908o;
    public float f28909p;
    public float f28910q;
    public float f28911r;
    public float f28912s;
    public boolean f28913t;
    public VelocityTracker v;
    public long f28914u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.d f28899e = new androidx.mediarouter.app.d(this, 10);

    public m20(Context context, n20 n20Var) {
        this.f28900f = n20Var;
        this.f28901g = n20Var;
        if (context != null) {
            this.f28913t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f28898c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f28896a = scaledTouchSlop * scaledTouchSlop;
            this.f28897b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
