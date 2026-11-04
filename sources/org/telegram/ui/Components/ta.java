package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ta extends FrameLayout {
    public final ac E;
    public final fb f38364a;
    public final Rect f38365b;
    public final GestureDetector f38366c;
    public boolean d;
    public boolean f38367e;
    public float f38368f;
    public float h;
    public float f38369n;
    public boolean f38370r;
    public boolean f38371s;
    public boolean f38372w;
    public boolean f38373x;
    public final FrameLayout f38374y;

    public ta(ac acVar, fb fbVar, FrameLayout frameLayout) {
        super(fbVar.getContext());
        this.E = acVar;
        this.f38374y = frameLayout;
        this.f38365b = new Rect();
        this.f38364a = fbVar;
        GestureDetector gestureDetector = new GestureDetector(fbVar.getContext(), new pb(this, fbVar));
        this.f38366c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(fbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
