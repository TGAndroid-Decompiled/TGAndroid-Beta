package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ya extends FrameLayout {
    public final fc E;
    public final kb f42385a;
    public final Rect f42386b;
    public final GestureDetector f42387c;
    public boolean d;
    public boolean f42388e;
    public float f42389f;
    public float h;
    public float f42390n;
    public boolean f42391r;
    public boolean f42392s;
    public boolean f42393w;
    public boolean f42394x;
    public final FrameLayout f42395y;

    public ya(fc fcVar, kb kbVar, FrameLayout frameLayout) {
        super(kbVar.getContext());
        this.E = fcVar;
        this.f42395y = frameLayout;
        this.f42386b = new Rect();
        this.f42385a = kbVar;
        GestureDetector gestureDetector = new GestureDetector(kbVar.getContext(), new ub(this, kbVar));
        this.f42387c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(kbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ya.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
