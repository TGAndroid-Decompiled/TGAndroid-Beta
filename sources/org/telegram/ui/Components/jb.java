package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final vb f25388a;
    public final Rect f25389b;
    public final GestureDetector f25390c;
    public boolean d;
    public boolean e;
    public float f25391f;
    public float h;
    public float f25392n;
    public boolean f25393r;
    public boolean f25394s;
    public boolean v;
    public boolean f25395w;
    public final FrameLayout f25396x;
    public final rc f25397y;

    public jb(rc rcVar, vb vbVar, FrameLayout frameLayout) {
        super(vbVar.getContext());
        this.f25397y = rcVar;
        this.f25396x = frameLayout;
        this.f25389b = new Rect();
        this.f25388a = vbVar;
        GestureDetector gestureDetector = new GestureDetector(vbVar.getContext(), new gc(this, vbVar));
        this.f25390c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(vbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
