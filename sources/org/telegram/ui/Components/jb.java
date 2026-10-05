package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final vb f27781a;
    public final Rect f27782b;
    public final GestureDetector f27783c;
    public boolean d;
    public boolean f27784e;
    public float f27785f;
    public float h;
    public float f27786n;
    public boolean f27787r;
    public boolean f27788s;
    public boolean v;
    public boolean f27789w;
    public final FrameLayout f27790x;
    public final rc f27791y;

    public jb(rc rcVar, vb vbVar, FrameLayout frameLayout) {
        super(vbVar.getContext());
        this.f27791y = rcVar;
        this.f27790x = frameLayout;
        this.f27782b = new Rect();
        this.f27781a = vbVar;
        GestureDetector gestureDetector = new GestureDetector(vbVar.getContext(), new gc(this, vbVar));
        this.f27783c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(vbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
