package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f27679w = ViewConfiguration.getTapTimeout();
    public final int f27680a;
    public final int f27681b;
    public final int f27682c;
    public final int d;
    public final l20 f27684f;
    public final l20 f27685g;
    public boolean h;
    public boolean f27686i;
    public boolean f27687j;
    public boolean f27688k;
    public boolean f27689l;
    public MotionEvent f27690m;
    public MotionEvent f27691n;
    public boolean f27692o;
    public float f27693p;
    public float f27694q;
    public float f27695r;
    public float f27696s;
    public boolean f27697t;
    public VelocityTracker v;
    public long f27698u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f27683e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f27684f = l20Var;
        this.f27685g = l20Var;
        if (context != null) {
            this.f27697t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27682c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27680a = scaledTouchSlop * scaledTouchSlop;
            this.f27681b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
