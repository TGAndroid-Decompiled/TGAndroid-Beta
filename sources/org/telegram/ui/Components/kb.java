package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f26336a;
    public final Rect f26337b;
    public final GestureDetector f26338c;
    public boolean d;
    public boolean e;
    public float f26339f;
    public float h;
    public float f26340n;
    public boolean f26341r;
    public boolean f26342s;
    public boolean v;
    public boolean f26343w;
    public final FrameLayout f26344x;
    public final sc f26345y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f26345y = scVar;
        this.f26344x = frameLayout;
        this.f26337b = new Rect();
        this.f26336a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f26338c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
