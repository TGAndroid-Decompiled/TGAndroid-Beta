package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final vb f27714a;
    public final Rect f27715b;
    public final GestureDetector f27716c;
    public boolean d;
    public boolean f27717e;
    public float f27718f;
    public float h;
    public float f27719n;
    public boolean f27720r;
    public boolean f27721s;
    public boolean v;
    public boolean f27722w;
    public final FrameLayout f27723x;
    public final rc f27724y;

    public jb(rc rcVar, vb vbVar, FrameLayout frameLayout) {
        super(vbVar.getContext());
        this.f27724y = rcVar;
        this.f27723x = frameLayout;
        this.f27715b = new Rect();
        this.f27714a = vbVar;
        GestureDetector gestureDetector = new GestureDetector(vbVar.getContext(), new gc(this, vbVar));
        this.f27716c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(vbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
