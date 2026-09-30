package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class n20 {
    public static final int f26659w = ViewConfiguration.getTapTimeout();
    public final int f26660a;
    public final int f26661b;
    public final int f26662c;
    public final int d;
    public final o20 f26663f;
    public final o20 f26664g;
    public boolean h;
    public boolean f26665i;
    public boolean f26666j;
    public boolean f26667k;
    public boolean f26668l;
    public MotionEvent f26669m;
    public MotionEvent f26670n;
    public boolean f26671o;
    public float f26672p;
    public float f26673q;
    public float f26674r;
    public float f26675s;
    public boolean f26676t;
    public VelocityTracker v;
    public long f26677u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public n20(Context context, o20 o20Var) {
        this.f26663f = o20Var;
        this.f26664g = o20Var;
        if (context != null) {
            this.f26676t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26662c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26660a = scaledTouchSlop * scaledTouchSlop;
            this.f26661b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
