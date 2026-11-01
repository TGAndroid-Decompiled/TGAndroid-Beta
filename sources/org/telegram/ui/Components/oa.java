package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class oa extends FrameLayout {
    public final wb D;
    public final bb f29072a;
    public final Rect f29073b;
    public final GestureDetector f29074c;
    public boolean d;
    public boolean e;
    public float f29075f;
    public float h;
    public float f29076n;
    public boolean f29077r;
    public boolean f29078s;
    public boolean f29079w;
    public boolean f29080x;
    public final FrameLayout f29081y;

    public oa(wb wbVar, bb bbVar, FrameLayout frameLayout) {
        super(bbVar.getContext());
        this.D = wbVar;
        this.f29081y = frameLayout;
        this.f29073b = new Rect();
        this.f29072a = bbVar;
        GestureDetector gestureDetector = new GestureDetector(bbVar.getContext(), new lb(this, bbVar));
        this.f29074c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(bbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
