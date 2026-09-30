package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f25033a;
    public final Rect f25034b;
    public final GestureDetector f25035c;
    public boolean d;
    public boolean e;
    public float f25036f;
    public float h;
    public float f25037n;
    public boolean f25038r;
    public boolean f25039s;
    public boolean v;
    public boolean f25040w;
    public final FrameLayout f25041x;
    public final qc f25042y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25042y = qcVar;
        this.f25041x = frameLayout;
        this.f25034b = new Rect();
        this.f25033a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f25035c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
