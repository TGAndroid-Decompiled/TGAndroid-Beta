package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f27304x;
    public static final int f27305y;
    public final int f27306a;
    public final int f27307b;
    public final int f27308c;
    public final int d;
    public final int f27309e;
    public final androidx.mediarouter.app.c f27310f;
    public final i20 f27311g;
    public h20 h;
    public boolean f27312i;
    public boolean f27313j;
    public boolean f27314k;
    public boolean f27315l;
    public boolean f27316m;
    public MotionEvent f27317n;
    public MotionEvent f27318o;
    public MotionEvent f27319p;
    public boolean f27320q;
    public float f27321r;
    public float f27322s;
    public float f27323t;
    public float f27324u;
    public boolean v;
    public VelocityTracker f27325w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f27304x = ViewConfiguration.getTapTimeout();
        f27305y = ViewConfiguration.getDoubleTapTimeout();
    }

    public j20(Context context, PhotoViewer photoViewer) {
        this(context, (i20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public j20(Context context, i20 i20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f27310f = new androidx.mediarouter.app.c(this, 7);
        this.f27311g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f27309e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f27309e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f27306a = i10 * i10;
        this.f27307b = scaledTouchSlop * scaledTouchSlop;
        this.f27308c = i11 * i11;
    }
}
