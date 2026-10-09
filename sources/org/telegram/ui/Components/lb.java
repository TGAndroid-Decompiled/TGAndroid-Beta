package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class lb extends FrameLayout {
    public final xb f28406a;
    public final Rect f28407b;
    public final GestureDetector f28408c;
    public boolean d;
    public boolean f28409e;
    public float f28410f;
    public float h;
    public float f28411n;
    public boolean f28412r;
    public boolean f28413s;
    public boolean v;
    public boolean f28414w;
    public final FrameLayout f28415x;
    public final tc f28416y;

    public lb(tc tcVar, xb xbVar, FrameLayout frameLayout) {
        super(xbVar.getContext());
        this.f28416y = tcVar;
        this.f28415x = frameLayout;
        this.f28407b = new Rect();
        this.f28406a = xbVar;
        GestureDetector gestureDetector = new GestureDetector(xbVar.getContext(), new ic(this, xbVar));
        this.f28408c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(xbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
