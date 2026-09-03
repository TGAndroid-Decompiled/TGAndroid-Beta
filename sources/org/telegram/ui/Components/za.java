package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final nb f31312a;
    public final Rect f31313b;
    public final GestureDetector f31314c;
    public boolean d;
    public boolean e;
    public float f31315f;
    public float h;
    public float f31316n;
    public boolean f31317r;
    public boolean f31318s;
    public boolean v;
    public boolean f31319w;
    public final FrameLayout f31320x;
    public final ic f31321y;

    public za(ic icVar, nb nbVar, FrameLayout frameLayout) {
        super(nbVar.getContext());
        this.f31321y = icVar;
        this.f31320x = frameLayout;
        this.f31313b = new Rect();
        this.f31312a = nbVar;
        GestureDetector gestureDetector = new GestureDetector(nbVar.getContext(), new xb(this, nbVar));
        this.f31314c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(nbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
