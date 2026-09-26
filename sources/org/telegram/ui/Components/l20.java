package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l20 {
    public static final int f25992w = ViewConfiguration.getTapTimeout();
    public final int f25993a;
    public final int f25994b;
    public final int f25995c;
    public final int d;
    public final m20 f25996f;
    public final m20 f25997g;
    public boolean h;
    public boolean f25998i;
    public boolean f25999j;
    public boolean f26000k;
    public boolean f26001l;
    public MotionEvent f26002m;
    public MotionEvent f26003n;
    public boolean f26004o;
    public float f26005p;
    public float f26006q;
    public float f26007r;
    public float f26008s;
    public boolean f26009t;
    public VelocityTracker v;
    public long f26010u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public l20(Context context, m20 m20Var) {
        this.f25996f = m20Var;
        this.f25997g = m20Var;
        if (context != null) {
            this.f26009t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25995c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25993a = scaledTouchSlop * scaledTouchSlop;
            this.f25994b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
