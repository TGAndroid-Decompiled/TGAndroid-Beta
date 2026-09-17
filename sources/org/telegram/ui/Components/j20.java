package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f27305x;
    public static final int f27306y;
    public final int f27307a;
    public final int f27308b;
    public final int f27309c;
    public final int d;
    public final int f27310e;
    public final androidx.mediarouter.app.c f27311f;
    public final i20 f27312g;
    public h20 h;
    public boolean f27313i;
    public boolean f27314j;
    public boolean f27315k;
    public boolean f27316l;
    public boolean f27317m;
    public MotionEvent f27318n;
    public MotionEvent f27319o;
    public MotionEvent f27320p;
    public boolean f27321q;
    public float f27322r;
    public float f27323s;
    public float f27324t;
    public float f27325u;
    public boolean v;
    public VelocityTracker f27326w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f27305x = ViewConfiguration.getTapTimeout();
        f27306y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f27311f = new androidx.mediarouter.app.c(this, 7);
        this.f27312g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f27310e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f27310e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f27307a = i10 * i10;
        this.f27308b = scaledTouchSlop * scaledTouchSlop;
        this.f27309c = i11 * i11;
    }
}
