package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final nb f33839a;
    public final Rect f33840b;
    public final GestureDetector f33841c;
    public boolean d;
    public boolean f33842e;
    public float f33843f;
    public float h;
    public float f33844n;
    public boolean f33845r;
    public boolean f33846s;
    public boolean v;
    public boolean f33847w;
    public final FrameLayout f33848x;
    public final ic f33849y;

    public za(ic icVar, nb nbVar, FrameLayout frameLayout) {
        super(nbVar.getContext());
        this.f33849y = icVar;
        this.f33848x = frameLayout;
        this.f33840b = new Rect();
        this.f33839a = nbVar;
        GestureDetector gestureDetector = new GestureDetector(nbVar.getContext(), new xb(this, nbVar));
        this.f33841c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(nbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
