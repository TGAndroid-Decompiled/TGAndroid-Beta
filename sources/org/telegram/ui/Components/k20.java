package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25620w = ViewConfiguration.getTapTimeout();
    public final int f25621a;
    public final int f25622b;
    public final int f25623c;
    public final int d;
    public final l20 f25624f;
    public final l20 f25625g;
    public boolean h;
    public boolean f25626i;
    public boolean f25627j;
    public boolean f25628k;
    public boolean f25629l;
    public MotionEvent f25630m;
    public MotionEvent f25631n;
    public boolean f25632o;
    public float f25633p;
    public float f25634q;
    public float f25635r;
    public float f25636s;
    public boolean f25637t;
    public VelocityTracker v;
    public long f25638u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25624f = l20Var;
        this.f25625g = l20Var;
        if (context != null) {
            this.f25637t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25623c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25621a = scaledTouchSlop * scaledTouchSlop;
            this.f25622b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
