package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class lb extends FrameLayout {
    public final xb f28287a;
    public final Rect f28288b;
    public final GestureDetector f28289c;
    public boolean d;
    public boolean f28290e;
    public float f28291f;
    public float h;
    public float f28292n;
    public boolean f28293r;
    public boolean f28294s;
    public boolean v;
    public boolean f28295w;
    public final FrameLayout f28296x;
    public final tc f28297y;

    public lb(tc tcVar, xb xbVar, FrameLayout frameLayout) {
        super(xbVar.getContext());
        this.f28297y = tcVar;
        this.f28296x = frameLayout;
        this.f28288b = new Rect();
        this.f28287a = xbVar;
        GestureDetector gestureDetector = new GestureDetector(xbVar.getContext(), new ic(this, xbVar));
        this.f28289c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(xbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
