package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class e30 {
    public static final int f25558w = ViewConfiguration.getTapTimeout();
    public final int f25559a;
    public final int f25560b;
    public final int f25561c;
    public final int d;
    public final f30 f25563f;
    public final f30 f25564g;
    public boolean h;
    public boolean f25565i;
    public boolean f25566j;
    public boolean f25567k;
    public boolean f25568l;
    public MotionEvent f25569m;
    public MotionEvent f25570n;
    public boolean f25571o;
    public float f25572p;
    public float f25573q;
    public float f25574r;
    public float f25575s;
    public boolean f25576t;
    public VelocityTracker v;
    public long f25577u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c f25562e = new androidx.mediarouter.app.c(this, 8);

    public e30(Context context, f30 f30Var) {
        this.f25563f = f30Var;
        this.f25564g = f30Var;
        if (context != null) {
            this.f25576t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f25561c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25559a = scaledTouchSlop * scaledTouchSlop;
            this.f25560b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
