package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class eb extends FrameLayout {
    public final rb f27988a;
    public final Rect f27989b;
    public final GestureDetector f27990c;
    public boolean d;
    public boolean f27991e;
    public float f27992f;
    public float h;
    public float f27993n;
    public boolean f27994r;
    public boolean f27995s;
    public boolean v;
    public boolean f27996w;
    public final FrameLayout f27997x;
    public final mc f27998y;

    public eb(mc mcVar, rb rbVar, FrameLayout frameLayout) {
        super(rbVar.getContext());
        this.f27998y = mcVar;
        this.f27997x = frameLayout;
        this.f27989b = new Rect();
        this.f27988a = rbVar;
        GestureDetector gestureDetector = new GestureDetector(rbVar.getContext(), new bc(this, rbVar));
        this.f27990c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(rbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
