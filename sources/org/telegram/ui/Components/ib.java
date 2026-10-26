package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f29255a;
    public final Rect f29256b;
    public final GestureDetector f29257c;
    public boolean d;
    public boolean e;
    public float f29258f;
    public float h;
    public float f29259n;
    public boolean f29260r;
    public boolean f29261s;
    public boolean v;
    public boolean f29262w;
    public final FrameLayout f29263x;
    public final qc f29264y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f29264y = qcVar;
        this.f29263x = frameLayout;
        this.f29256b = new Rect();
        this.f29255a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f29257c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
