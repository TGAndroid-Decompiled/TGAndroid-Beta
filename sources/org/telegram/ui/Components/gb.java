package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final sb f24158a;
    public final Rect f24159b;
    public final GestureDetector f24160c;
    public boolean d;
    public boolean e;
    public float f24161f;
    public float h;
    public float f24162n;
    public boolean f24163r;
    public boolean f24164s;
    public boolean v;
    public boolean f24165w;
    public final FrameLayout f24166x;
    public final oc f24167y;

    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.f24167y = ocVar;
        this.f24166x = frameLayout;
        this.f24159b = new Rect();
        this.f24158a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.f24160c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
