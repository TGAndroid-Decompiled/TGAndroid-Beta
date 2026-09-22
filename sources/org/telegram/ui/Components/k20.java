package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class k20 {
    public static final int f25509w = ViewConfiguration.getTapTimeout();
    public final int f25510a;
    public final int f25511b;
    public final int f25512c;
    public final int d;
    public final l20 f25513f;
    public final l20 f25514g;
    public boolean h;
    public boolean f25515i;
    public boolean f25516j;
    public boolean f25517k;
    public boolean f25518l;
    public MotionEvent f25519m;
    public MotionEvent f25520n;
    public boolean f25521o;
    public float f25522p;
    public float f25523q;
    public float f25524r;
    public float f25525s;
    public boolean f25526t;
    public VelocityTracker v;
    public long f25527u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public k20(Context context, l20 l20Var) {
        this.f25513f = l20Var;
        this.f25514g = l20Var;
        if (context != null) {
            this.f25526t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25512c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25510a = scaledTouchSlop * scaledTouchSlop;
            this.f25511b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
