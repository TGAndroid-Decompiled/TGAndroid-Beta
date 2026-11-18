package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class l10 {
    public static final int f36954w = ViewConfiguration.getTapTimeout();
    public final int f36955a;
    public final int f36956b;
    public final int f36957c;
    public final int d;
    public final m10 f36959f;
    public final m10 f36960g;
    public boolean h;
    public boolean f36961i;
    public boolean f36962j;
    public boolean f36963k;
    public boolean f36964l;
    public MotionEvent f36965m;
    public MotionEvent f36966n;
    public boolean f36967o;
    public float f36968p;
    public float f36969q;
    public float f36970r;
    public float f36971s;
    public boolean f36972t;
    public VelocityTracker v;
    public long f36973u = ViewConfiguration.getLongPressTimeout();
    public final android.support.v4.media.session.q f36958e = new android.support.v4.media.session.q(this, 6);

    public l10(Context context, m10 m10Var) {
        this.f36959f = m10Var;
        this.f36960g = m10Var;
        if (context != null) {
            this.f36972t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f36957c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f36955a = scaledTouchSlop * scaledTouchSlop;
            this.f36956b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
