package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class qa extends FrameLayout {
    public final xb E;
    public final cb f38592a;
    public final Rect f38593b;
    public final GestureDetector f38594c;
    public boolean d;
    public boolean f38595e;
    public float f38596f;
    public float h;
    public float f38597n;
    public boolean f38598r;
    public boolean f38599s;
    public boolean f38600w;
    public boolean f38601x;
    public final FrameLayout f38602y;

    public qa(xb xbVar, cb cbVar, FrameLayout frameLayout) {
        super(cbVar.getContext());
        this.E = xbVar;
        this.f38602y = frameLayout;
        this.f38593b = new Rect();
        this.f38592a = cbVar;
        GestureDetector gestureDetector = new GestureDetector(cbVar.getContext(), new mb(this, cbVar));
        this.f38594c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(cbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
