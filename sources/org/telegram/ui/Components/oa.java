package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class oa extends FrameLayout {
    public final wb D;
    public final bb f29011a;
    public final Rect f29012b;
    public final GestureDetector f29013c;
    public boolean d;
    public boolean e;
    public float f29014f;
    public float h;
    public float f29015n;
    public boolean f29016r;
    public boolean f29017s;
    public boolean f29018w;
    public boolean f29019x;
    public final FrameLayout f29020y;

    public oa(wb wbVar, bb bbVar, FrameLayout frameLayout) {
        super(bbVar.getContext());
        this.D = wbVar;
        this.f29020y = frameLayout;
        this.f29012b = new Rect();
        this.f29011a = bbVar;
        GestureDetector gestureDetector = new GestureDetector(bbVar.getContext(), new lb(this, bbVar));
        this.f29013c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(bbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
