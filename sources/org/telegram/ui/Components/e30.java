package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class e30 {
    public static final int f25563w = ViewConfiguration.getTapTimeout();
    public final int f25564a;
    public final int f25565b;
    public final int f25566c;
    public final int d;
    public final f30 f25568f;
    public final f30 f25569g;
    public boolean h;
    public boolean f25570i;
    public boolean f25571j;
    public boolean f25572k;
    public boolean f25573l;
    public MotionEvent f25574m;
    public MotionEvent f25575n;
    public boolean f25576o;
    public float f25577p;
    public float f25578q;
    public float f25579r;
    public float f25580s;
    public boolean f25581t;
    public VelocityTracker v;
    public long f25582u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f25567e = new androidx.mediarouter.app.c(this, 8);

    public e30(Context context, f30 f30Var) {
        this.f25568f = f30Var;
        this.f25569g = f30Var;
        if (context != null) {
            this.f25581t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25566c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25564a = scaledTouchSlop * scaledTouchSlop;
            this.f25565b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
