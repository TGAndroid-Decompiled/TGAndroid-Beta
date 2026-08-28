package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class u10 {
    public static final int f32879x;
    public static final int f32880y;
    public final int f32881a;
    public final int f32882b;
    public final int f32883c;
    public final int d;
    public final int f32884e;
    public final androidx.mediarouter.app.d f32885f;
    public final t10 f32886g;
    public s10 h;
    public boolean f32887i;
    public boolean f32888j;
    public boolean f32889k;
    public boolean f32890l;
    public boolean f32891m;
    public MotionEvent f32892n;
    public MotionEvent f32893o;
    public MotionEvent f32894p;
    public boolean f32895q;
    public float f32896r;
    public float f32897s;
    public float f32898t;
    public float f32899u;
    public boolean v;
    public VelocityTracker f32900w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f32879x = ViewConfiguration.getTapTimeout();
        f32880y = ViewConfiguration.getDoubleTapTimeout();
    }

    public u10(Context context, PhotoViewer photoViewer) {
        this(context, (t10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public u10(Context context, t10 t10Var) {
        int scaledTouchSlop;
        int i9;
        int i10;
        this.f32885f = new androidx.mediarouter.app.d(this, 6);
        this.f32886g = t10Var;
        if (t10Var instanceof s10) {
            this.h = (s10) t10Var;
        }
        this.v = true;
        if (context == null) {
            i9 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f32884e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i9;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f32884e = viewConfiguration.getScaledMaximumFlingVelocity();
            i9 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f32881a = i9 * i9;
        this.f32882b = scaledTouchSlop * scaledTouchSlop;
        this.f32883c = i10 * i10;
    }
}
