package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class y7 extends FrameLayout {
    public final RectF f32581a;
    public boolean f32582b;
    public int f32583c;
    public int d;
    public final k8 e;

    public y7(k8 k8Var, Context context) {
        super(context);
        this.e = k8Var;
        this.f32581a = new RectF();
        this.f32582b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new ah.m0(this, 5));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.e;
        k8.Q(k8Var);
        k8Var.E0();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.onMeasure(int, int):void");
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
        if (this.f32582b) {
            return;
        }
        super.requestLayout();
    }
}
