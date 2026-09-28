package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f25053a;
    public final Rect f25054b;
    public final GestureDetector f25055c;
    public boolean d;
    public boolean e;
    public float f25056f;
    public float h;
    public float f25057n;
    public boolean f25058r;
    public boolean f25059s;
    public boolean v;
    public boolean f25060w;
    public final FrameLayout f25061x;
    public final qc f25062y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25062y = qcVar;
        this.f25061x = frameLayout;
        this.f25054b = new Rect();
        this.f25053a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f25055c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
