package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class qa extends FrameLayout {
    public final xb E;
    public final cb f38590a;
    public final Rect f38591b;
    public final GestureDetector f38592c;
    public boolean d;
    public boolean f38593e;
    public float f38594f;
    public float h;
    public float f38595n;
    public boolean f38596r;
    public boolean f38597s;
    public boolean f38598w;
    public boolean f38599x;
    public final FrameLayout f38600y;

    public qa(xb xbVar, cb cbVar, FrameLayout frameLayout) {
        super(cbVar.getContext());
        this.E = xbVar;
        this.f38600y = frameLayout;
        this.f38591b = new Rect();
        this.f38590a = cbVar;
        GestureDetector gestureDetector = new GestureDetector(cbVar.getContext(), new mb(this, cbVar));
        this.f38592c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(cbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
