package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class hb extends FrameLayout {
    public final tb f24765a;
    public final Rect f24766b;
    public final GestureDetector f24767c;
    public boolean d;
    public boolean e;
    public float f24768f;
    public float h;
    public float f24769n;
    public boolean f24770r;
    public boolean f24771s;
    public boolean v;
    public boolean f24772w;
    public final FrameLayout f24773x;
    public final pc f24774y;

    public hb(pc pcVar, tb tbVar, FrameLayout frameLayout) {
        super(tbVar.getContext());
        this.f24774y = pcVar;
        this.f24773x = frameLayout;
        this.f24766b = new Rect();
        this.f24765a = tbVar;
        GestureDetector gestureDetector = new GestureDetector(tbVar.getContext(), new ec(this, tbVar));
        this.f24767c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(tbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
