package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class t20 {
    public static final int f27279w = ViewConfiguration.getTapTimeout();
    public final int f27280a;
    public final int f27281b;
    public final int f27282c;
    public final int d;
    public final u20 f27283f;
    public final u20 f27284g;
    public boolean h;
    public boolean f27285i;
    public boolean f27286j;
    public boolean f27287k;
    public boolean f27288l;
    public MotionEvent f27289m;
    public MotionEvent f27290n;
    public boolean f27291o;
    public float f27292p;
    public float f27293q;
    public float f27294r;
    public float f27295s;
    public boolean f27296t;
    public VelocityTracker v;
    public long f27297u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public t20(Context context, u20 u20Var) {
        this.f27283f = u20Var;
        this.f27284g = u20Var;
        if (context != null) {
            this.f27296t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27282c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27280a = scaledTouchSlop * scaledTouchSlop;
            this.f27281b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
