package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class wp extends NestedScrollView {
    public boolean f41748a0;
    public final aq f41749b0;

    public wp(aq aqVar, Context context) {
        super(context);
        this.f41749b0 = aqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        aq aqVar = this.f41749b0;
        int scrollY = (int) ((getScrollY() + (aqVar.f33421r1 - aqVar.f30226t0)) - getTranslationY());
        Drawable drawable = aqVar.f33417m1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + aqVar.f33418o1.getMeasuredHeight() + scrollY + aqVar.f30226t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            aq aqVar = this.f41749b0;
            if (aqVar.f33421r1 != 0 && motionEvent.getY() < aqVar.f33421r1) {
                aqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        aq.J0(this.f41749b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        aq.J0(this.f41749b0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41749b0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f41748a0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        aq.J0(this.f41749b0);
    }
}
