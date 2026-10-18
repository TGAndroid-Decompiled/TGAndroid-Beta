package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27158a;
    public final Rect f27159b;
    public final GestureDetector f27160c;
    public boolean d;
    public boolean e;
    public float f27161f;
    public float h;
    public float f27162n;
    public boolean f27163r;
    public boolean f27164s;
    public boolean v;
    public boolean f27165w;
    public final FrameLayout f27166x;
    public final qc f27167y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27167y = qcVar;
        this.f27166x = frameLayout;
        this.f27159b = new Rect();
        this.f27158a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27160c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
