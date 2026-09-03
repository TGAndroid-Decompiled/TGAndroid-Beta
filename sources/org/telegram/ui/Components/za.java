package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final nb f33882a;
    public final Rect f33883b;
    public final GestureDetector f33884c;
    public boolean d;
    public boolean f33885e;
    public float f33886f;
    public float h;
    public float f33887n;
    public boolean f33888r;
    public boolean f33889s;
    public boolean v;
    public boolean f33890w;
    public final FrameLayout f33891x;
    public final ic f33892y;

    public za(ic icVar, nb nbVar, FrameLayout frameLayout) {
        super(nbVar.getContext());
        this.f33892y = icVar;
        this.f33891x = frameLayout;
        this.f33883b = new Rect();
        this.f33882a = nbVar;
        GestureDetector gestureDetector = new GestureDetector(nbVar.getContext(), new xb(this, nbVar));
        this.f33884c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(nbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
