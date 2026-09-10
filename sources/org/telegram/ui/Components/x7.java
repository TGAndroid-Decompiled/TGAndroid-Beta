package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class x7 extends FrameLayout {
    public final RectF f28963a;
    public boolean f28964b;
    public int f28965c;
    public int d;
    public final j8 e;

    public x7(j8 j8Var, Context context) {
        super(context);
        this.e = j8Var;
        this.f28963a = new RectF();
        this.f28964b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pc.a(this, new bi.rd(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.e;
        j8.P(j8Var);
        j8Var.E0();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x7.onMeasure(int, int):void");
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
        if (this.f28964b) {
            return;
        }
        super.requestLayout();
    }
}
