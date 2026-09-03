package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class r7 extends FrameLayout {
    public final RectF f30674a;
    public boolean f30675b;
    public int f30676c;
    public int d;
    public final c8 f30677e;

    public r7(c8 c8Var, Context context) {
        super(context);
        this.f30677e = c8Var;
        this.f30674a = new RectF();
        this.f30675b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new lh.t0(this, 5));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        c8 c8Var = this.f30677e;
        c8.P(c8Var);
        c8Var.E0();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r7.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30677e.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f30675b) {
            return;
        }
        super.requestLayout();
    }
}
