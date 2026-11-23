package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class m10 {
    public static final int f37319w = ViewConfiguration.getTapTimeout();
    public final int f37320a;
    public final int f37321b;
    public final int f37322c;
    public final int d;
    public final n10 f37324f;
    public final n10 f37325g;
    public boolean h;
    public boolean f37326i;
    public boolean f37327j;
    public boolean f37328k;
    public boolean f37329l;
    public MotionEvent f37330m;
    public MotionEvent f37331n;
    public boolean f37332o;
    public float f37333p;
    public float f37334q;
    public float f37335r;
    public float f37336s;
    public boolean f37337t;
    public VelocityTracker v;
    public long f37338u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f37323e = new android.support.v4.media.session.q(this, 6);

    public m10(Context context, n10 n10Var) {
        this.f37324f = n10Var;
        this.f37325g = n10Var;
        if (context != null) {
            this.f37337t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f37322c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f37320a = scaledTouchSlop * scaledTouchSlop;
            this.f37321b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
