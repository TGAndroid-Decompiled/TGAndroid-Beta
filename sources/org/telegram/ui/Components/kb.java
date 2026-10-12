package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f27802a;
    public final Rect f27803b;
    public final GestureDetector f27804c;
    public boolean d;
    public boolean f27805e;
    public float f27806f;
    public float h;
    public float f27807n;
    public boolean f27808r;
    public boolean f27809s;
    public boolean v;
    public boolean f27810w;
    public final FrameLayout f27811x;
    public final sc f27812y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f27812y = scVar;
        this.f27811x = frameLayout;
        this.f27803b = new Rect();
        this.f27802a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f27804c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
