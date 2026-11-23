package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class yp extends NestedScrollView {
    public boolean f42486a0;
    public final cq f42487b0;

    public yp(cq cqVar, Context context) {
        super(context);
        this.f42487b0 = cqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cq cqVar = this.f42487b0;
        int scrollY = (int) ((getScrollY() + (cqVar.f34274r1 - cqVar.f30210t0)) - getTranslationY());
        Drawable drawable = cqVar.f34270m1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + cqVar.f34271o1.getMeasuredHeight() + scrollY + cqVar.f30210t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cq cqVar = this.f42487b0;
            if (cqVar.f34274r1 != 0 && motionEvent.getY() < cqVar.f34274r1) {
                cqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        cq.J0(this.f42487b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        cq.J0(this.f42487b0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42487b0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f42486a0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cq.J0(this.f42487b0);
    }
}
