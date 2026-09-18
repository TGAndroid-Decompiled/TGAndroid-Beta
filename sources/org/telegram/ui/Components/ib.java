package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f24888a;
    public final Rect f24889b;
    public final GestureDetector f24890c;
    public boolean d;
    public boolean e;
    public float f24891f;
    public float h;
    public float f24892n;
    public boolean f24893r;
    public boolean f24894s;
    public boolean v;
    public boolean f24895w;
    public final FrameLayout f24896x;
    public final qc f24897y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f24897y = qcVar;
        this.f24896x = frameLayout;
        this.f24889b = new Rect();
        this.f24888a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f24890c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
