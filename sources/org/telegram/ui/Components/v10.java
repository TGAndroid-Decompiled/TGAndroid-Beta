package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class v10 {
    public static final int f33206w = ViewConfiguration.getTapTimeout();
    public final int f33207a;
    public final int f33208b;
    public final int f33209c;
    public final int d;
    public final w10 f33211f;
    public final w10 f33212g;
    public boolean h;
    public boolean f33213i;
    public boolean f33214j;
    public boolean f33215k;
    public boolean f33216l;
    public MotionEvent f33217m;
    public MotionEvent f33218n;
    public boolean f33219o;
    public float f33220p;
    public float f33221q;
    public float f33222r;
    public float f33223s;
    public boolean f33224t;
    public VelocityTracker v;
    public long f33225u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.d f33210e = new androidx.mediarouter.app.d(this, 7);

    public v10(Context context, w10 w10Var) {
        this.f33211f = w10Var;
        this.f33212g = w10Var;
        if (context != null) {
            this.f33224t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f33209c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f33207a = scaledTouchSlop * scaledTouchSlop;
            this.f33208b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
