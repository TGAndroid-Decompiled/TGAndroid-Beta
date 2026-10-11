package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f28009a;
    public final Rect f28010b;
    public final GestureDetector f28011c;
    public boolean d;
    public boolean f28012e;
    public float f28013f;
    public float h;
    public float f28014n;
    public boolean f28015r;
    public boolean f28016s;
    public boolean v;
    public boolean f28017w;
    public final FrameLayout f28018x;
    public final sc f28019y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f28019y = scVar;
        this.f28018x = frameLayout;
        this.f28010b = new Rect();
        this.f28009a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f28011c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
