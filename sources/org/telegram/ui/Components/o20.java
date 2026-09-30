package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class o20 {
    public static final int f26945w = ViewConfiguration.getTapTimeout();
    public final int f26946a;
    public final int f26947b;
    public final int f26948c;
    public final int d;
    public final p20 f26949f;
    public final p20 f26950g;
    public boolean h;
    public boolean f26951i;
    public boolean f26952j;
    public boolean f26953k;
    public boolean f26954l;
    public MotionEvent f26955m;
    public MotionEvent f26956n;
    public boolean f26957o;
    public float f26958p;
    public float f26959q;
    public float f26960r;
    public float f26961s;
    public boolean f26962t;
    public VelocityTracker v;
    public long f26963u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public o20(Context context, p20 p20Var) {
        this.f26949f = p20Var;
        this.f26950g = p20Var;
        if (context != null) {
            this.f26962t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26948c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26946a = scaledTouchSlop * scaledTouchSlop;
            this.f26947b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
