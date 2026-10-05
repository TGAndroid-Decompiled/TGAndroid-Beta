package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o20 {
    public static final int f29302w = ViewConfiguration.getTapTimeout();
    public final int f29303a;
    public final int f29304b;
    public final int f29305c;
    public final int d;
    public final p20 f29307f;
    public final p20 f29308g;
    public boolean h;
    public boolean f29309i;
    public boolean f29310j;
    public boolean f29311k;
    public boolean f29312l;
    public MotionEvent f29313m;
    public MotionEvent f29314n;
    public boolean f29315o;
    public float f29316p;
    public float f29317q;
    public float f29318r;
    public float f29319s;
    public boolean f29320t;
    public VelocityTracker v;
    public long f29321u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f29306e = new androidx.mediarouter.app.c(this, 8);

    public o20(Context context, p20 p20Var) {
        this.f29307f = p20Var;
        this.f29308g = p20Var;
        if (context != null) {
            this.f29320t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f29305c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29303a = scaledTouchSlop * scaledTouchSlop;
            this.f29304b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
