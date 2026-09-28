package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class n20 {
    public static final int f26661w = ViewConfiguration.getTapTimeout();
    public final int f26662a;
    public final int f26663b;
    public final int f26664c;
    public final int d;
    public final o20 f26665f;
    public final o20 f26666g;
    public boolean h;
    public boolean f26667i;
    public boolean f26668j;
    public boolean f26669k;
    public boolean f26670l;
    public MotionEvent f26671m;
    public MotionEvent f26672n;
    public boolean f26673o;
    public float f26674p;
    public float f26675q;
    public float f26676r;
    public float f26677s;
    public boolean f26678t;
    public VelocityTracker v;
    public long f26679u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 8);

    public n20(Context context, o20 o20Var) {
        this.f26665f = o20Var;
        this.f26666g = o20Var;
        if (context != null) {
            this.f26678t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26664c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26662a = scaledTouchSlop * scaledTouchSlop;
            this.f26663b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
