package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o10 {
    public static final int f38003w = ViewConfiguration.getTapTimeout();
    public final int f38004a;
    public final int f38005b;
    public final int f38006c;
    public final int d;
    public final p10 f38008f;
    public final p10 f38009g;
    public boolean h;
    public boolean f38010i;
    public boolean f38011j;
    public boolean f38012k;
    public boolean f38013l;
    public MotionEvent f38014m;
    public MotionEvent f38015n;
    public boolean f38016o;
    public float f38017p;
    public float f38018q;
    public float f38019r;
    public float f38020s;
    public boolean f38021t;
    public VelocityTracker v;
    public long f38022u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f38007e = new android.support.v4.media.session.q(this, 6);

    public o10(Context context, p10 p10Var) {
        this.f38008f = p10Var;
        this.f38009g = p10Var;
        if (context != null) {
            this.f38021t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f38006c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f38004a = scaledTouchSlop * scaledTouchSlop;
            this.f38005b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
