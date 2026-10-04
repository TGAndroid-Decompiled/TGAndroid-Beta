package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final vb f27708a;
    public final Rect f27709b;
    public final GestureDetector f27710c;
    public boolean d;
    public boolean f27711e;
    public float f27712f;
    public float h;
    public float f27713n;
    public boolean f27714r;
    public boolean f27715s;
    public boolean v;
    public boolean f27716w;
    public final FrameLayout f27717x;
    public final rc f27718y;

    public jb(rc rcVar, vb vbVar, FrameLayout frameLayout) {
        super(vbVar.getContext());
        this.f27718y = rcVar;
        this.f27717x = frameLayout;
        this.f27709b = new Rect();
        this.f27708a = vbVar;
        GestureDetector gestureDetector = new GestureDetector(vbVar.getContext(), new gc(this, vbVar));
        this.f27710c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(vbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
