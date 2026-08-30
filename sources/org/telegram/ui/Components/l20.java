package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l20 {
    public static final int f26521w = ViewConfiguration.getTapTimeout();
    public final int f26522a;
    public final int f26523b;
    public final int f26524c;
    public final int d;
    public final m20 f26525f;
    public final m20 f26526g;
    public boolean h;
    public boolean f26527i;
    public boolean f26528j;
    public boolean f26529k;
    public boolean f26530l;
    public MotionEvent f26531m;
    public MotionEvent f26532n;
    public boolean f26533o;
    public float f26534p;
    public float f26535q;
    public float f26536r;
    public float f26537s;
    public boolean f26538t;
    public VelocityTracker v;
    public long f26539u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.d e = new androidx.mediarouter.app.d(this, 10);

    public l20(Context context, m20 m20Var) {
        this.f26525f = m20Var;
        this.f26526g = m20Var;
        if (context != null) {
            this.f26538t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f26524c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26522a = scaledTouchSlop * scaledTouchSlop;
            this.f26523b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
