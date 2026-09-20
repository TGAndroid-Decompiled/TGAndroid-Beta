package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class hb extends FrameLayout {
    public final tb f24591a;
    public final Rect f24592b;
    public final GestureDetector f24593c;
    public boolean d;
    public boolean e;
    public float f24594f;
    public float h;
    public float f24595n;
    public boolean f24596r;
    public boolean f24597s;
    public boolean v;
    public boolean f24598w;
    public final FrameLayout f24599x;
    public final pc f24600y;

    public hb(pc pcVar, tb tbVar, FrameLayout frameLayout) {
        super(tbVar.getContext());
        this.f24600y = pcVar;
        this.f24599x = frameLayout;
        this.f24592b = new Rect();
        this.f24591a = tbVar;
        GestureDetector gestureDetector = new GestureDetector(tbVar.getContext(), new ec(this, tbVar));
        this.f24593c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(tbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
