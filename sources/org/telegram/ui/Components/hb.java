package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class hb extends FrameLayout {
    public final tb f23561a;
    public final Rect f23562b;
    public final GestureDetector f23563c;
    public boolean d;
    public boolean e;
    public float f23564f;
    public float h;
    public float f23565n;
    public boolean f23566r;
    public boolean f23567s;
    public boolean v;
    public boolean f23568w;
    public final FrameLayout f23569x;
    public final pc f23570y;

    public hb(pc pcVar, tb tbVar, FrameLayout frameLayout) {
        super(tbVar.getContext());
        this.f23570y = pcVar;
        this.f23569x = frameLayout;
        this.f23562b = new Rect();
        this.f23561a = tbVar;
        GestureDetector gestureDetector = new GestureDetector(tbVar.getContext(), new ec(this, tbVar));
        this.f23563c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(tbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
