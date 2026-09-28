package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class n20 {
    public static final int f26660w = ViewConfiguration.getTapTimeout();
    public final int f26661a;
    public final int f26662b;
    public final int f26663c;
    public final int d;
    public final o20 f26664f;
    public final o20 f26665g;
    public boolean h;
    public boolean f26666i;
    public boolean f26667j;
    public boolean f26668k;
    public boolean f26669l;
    public MotionEvent f26670m;
    public MotionEvent f26671n;
    public boolean f26672o;
    public float f26673p;
    public float f26674q;
    public float f26675r;
    public float f26676s;
    public boolean f26677t;
    public VelocityTracker v;
    public long f26678u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public n20(Context context, o20 o20Var) {
        this.f26664f = o20Var;
        this.f26665g = o20Var;
        if (context != null) {
            this.f26677t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26663c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26661a = scaledTouchSlop * scaledTouchSlop;
            this.f26662b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
