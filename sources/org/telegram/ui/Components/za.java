package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final nb f31293a;
    public final Rect f31294b;
    public final GestureDetector f31295c;
    public boolean d;
    public boolean e;
    public float f31296f;
    public float h;
    public float f31297n;
    public boolean f31298r;
    public boolean f31299s;
    public boolean v;
    public boolean f31300w;
    public final FrameLayout f31301x;
    public final ic f31302y;

    public za(ic icVar, nb nbVar, FrameLayout frameLayout) {
        super(nbVar.getContext());
        this.f31302y = icVar;
        this.f31301x = frameLayout;
        this.f31294b = new Rect();
        this.f31293a = nbVar;
        GestureDetector gestureDetector = new GestureDetector(nbVar.getContext(), new xb(this, nbVar));
        this.f31295c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(nbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
