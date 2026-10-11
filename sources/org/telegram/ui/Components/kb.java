package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f27909a;
    public final Rect f27910b;
    public final GestureDetector f27911c;
    public boolean d;
    public boolean f27912e;
    public float f27913f;
    public float h;
    public float f27914n;
    public boolean f27915r;
    public boolean f27916s;
    public boolean v;
    public boolean f27917w;
    public final FrameLayout f27918x;
    public final sc f27919y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f27919y = scVar;
        this.f27918x = frameLayout;
        this.f27910b = new Rect();
        this.f27909a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f27911c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
