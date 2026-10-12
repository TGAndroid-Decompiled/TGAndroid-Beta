package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f27805a;
    public final Rect f27806b;
    public final GestureDetector f27807c;
    public boolean d;
    public boolean f27808e;
    public float f27809f;
    public float h;
    public float f27810n;
    public boolean f27811r;
    public boolean f27812s;
    public boolean v;
    public boolean f27813w;
    public final FrameLayout f27814x;
    public final sc f27815y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f27815y = scVar;
        this.f27814x = frameLayout;
        this.f27806b = new Rect();
        this.f27805a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f27807c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
