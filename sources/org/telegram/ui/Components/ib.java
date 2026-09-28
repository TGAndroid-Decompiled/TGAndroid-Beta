package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f25054a;
    public final Rect f25055b;
    public final GestureDetector f25056c;
    public boolean d;
    public boolean e;
    public float f25057f;
    public float h;
    public float f25058n;
    public boolean f25059r;
    public boolean f25060s;
    public boolean v;
    public boolean f25061w;
    public final FrameLayout f25062x;
    public final qc f25063y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25063y = qcVar;
        this.f25062x = frameLayout;
        this.f25055b = new Rect();
        this.f25054a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f25056c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
