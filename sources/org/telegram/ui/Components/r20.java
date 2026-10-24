package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class r20 {
    public static final int f30036w = ViewConfiguration.getTapTimeout();
    public final int f30037a;
    public final int f30038b;
    public final int f30039c;
    public final int d;
    public final s20 f30040f;
    public final s20 f30041g;
    public boolean h;
    public boolean f30042i;
    public boolean f30043j;
    public boolean f30044k;
    public boolean f30045l;
    public MotionEvent f30046m;
    public MotionEvent f30047n;
    public boolean f30048o;
    public float f30049p;
    public float f30050q;
    public float f30051r;
    public float f30052s;
    public boolean f30053t;
    public VelocityTracker v;
    public long f30054u = ViewConfiguration.getLongPressTimeout();
    public final ab.o0 e = new ab.o0(this, 9);

    public r20(Context context, s20 s20Var) {
        this.f30040f = s20Var;
        this.f30041g = s20Var;
        if (context != null) {
            this.f30053t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f30039c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30037a = scaledTouchSlop * scaledTouchSlop;
            this.f30038b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
