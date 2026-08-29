package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class v7 extends FrameLayout {
    public final RectF f33483a;
    public boolean f33484b;
    public int f33485c;
    public int d;
    public final g8 f33486e;

    public v7(g8 g8Var, Context context) {
        super(context);
        this.f33486e = g8Var;
        this.f33483a = new RectF();
        this.f33484b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.a(this, new ih.u0(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g8 g8Var = this.f33486e;
        g8.P(g8Var);
        g8Var.E0();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33486e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33484b) {
            return;
        }
        super.requestLayout();
    }
}
