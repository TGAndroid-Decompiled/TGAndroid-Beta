package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f25036a;
    public final Rect f25037b;
    public final GestureDetector f25038c;
    public boolean d;
    public boolean e;
    public float f25039f;
    public float h;
    public float f25040n;
    public boolean f25041r;
    public boolean f25042s;
    public boolean v;
    public boolean f25043w;
    public final FrameLayout f25044x;
    public final qc f25045y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25045y = qcVar;
        this.f25044x = frameLayout;
        this.f25037b = new Rect();
        this.f25036a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f25038c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
