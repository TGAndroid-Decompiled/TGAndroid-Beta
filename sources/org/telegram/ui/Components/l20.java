package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class l20 {
    public static final int f28550x;
    public static final int f28551y;
    public final int f28552a;
    public final int f28553b;
    public final int f28554c;
    public final int d;
    public final int f28555e;
    public final androidx.mediarouter.app.d f28556f;
    public final k20 f28557g;
    public j20 h;
    public boolean f28558i;
    public boolean f28559j;
    public boolean f28560k;
    public boolean f28561l;
    public boolean f28562m;
    public MotionEvent f28563n;
    public MotionEvent f28564o;
    public MotionEvent f28565p;
    public boolean f28566q;
    public float f28567r;
    public float f28568s;
    public float f28569t;
    public float f28570u;
    public boolean v;
    public VelocityTracker f28571w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28550x = ViewConfiguration.getTapTimeout();
        f28551y = ViewConfiguration.getDoubleTapTimeout();
    }

    public l20(Context context, PhotoViewer photoViewer) {
        this(context, (k20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public l20(Context context, k20 k20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f28556f = new androidx.mediarouter.app.d(this, 9);
        this.f28557g = k20Var;
        if (k20Var instanceof j20) {
            this.h = (j20) k20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28555e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28555e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28552a = i10 * i10;
        this.f28553b = scaledTouchSlop * scaledTouchSlop;
        this.f28554c = i11 * i11;
    }
}
