package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class a8 extends FrameLayout {
    public final RectF f23150a;
    public boolean f23151b;
    public int f23152c;
    public int d;
    public final m8 e;

    public a8(m8 m8Var, Context context) {
        super(context);
        this.e = m8Var;
        this.f23150a = new RectF();
        this.f23151b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sc.a(this, new ah.m0(this, 5));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.e;
        m8.Q(m8Var);
        m8Var.E0();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23151b) {
            return;
        }
        super.requestLayout();
    }
}
