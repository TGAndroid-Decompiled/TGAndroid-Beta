package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final vb f27709a;
    public final Rect f27710b;
    public final GestureDetector f27711c;
    public boolean d;
    public boolean f27712e;
    public float f27713f;
    public float h;
    public float f27714n;
    public boolean f27715r;
    public boolean f27716s;
    public boolean v;
    public boolean f27717w;
    public final FrameLayout f27718x;
    public final rc f27719y;

    public jb(rc rcVar, vb vbVar, FrameLayout frameLayout) {
        super(vbVar.getContext());
        this.f27719y = rcVar;
        this.f27718x = frameLayout;
        this.f27710b = new Rect();
        this.f27709a = vbVar;
        GestureDetector gestureDetector = new GestureDetector(vbVar.getContext(), new gc(this, vbVar));
        this.f27711c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(vbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
