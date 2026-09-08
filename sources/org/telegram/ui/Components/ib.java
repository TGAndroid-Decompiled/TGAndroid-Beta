package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27085a;
    public final Rect f27086b;
    public final GestureDetector f27087c;
    public boolean d;
    public boolean f27088e;
    public float f27089f;
    public float h;
    public float f27090n;
    public boolean f27091r;
    public boolean f27092s;
    public boolean v;
    public boolean f27093w;
    public final FrameLayout f27094x;
    public final qc f27095y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27095y = qcVar;
        this.f27094x = frameLayout;
        this.f27086b = new Rect();
        this.f27085a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27087c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
