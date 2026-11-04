package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class hp extends NestedScrollView {
    public boolean f34467a0;
    public final lp f34468b0;

    public hp(lp lpVar, Context context) {
        super(context);
        this.f34468b0 = lpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lp lpVar = this.f34468b0;
        int scrollY = (int) ((getScrollY() + (lpVar.f35811o1 - lpVar.f28617t0)) - getTranslationY());
        Drawable drawable = lpVar.f35808j1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + lpVar.f35809l1.getMeasuredHeight() + scrollY + lpVar.f28617t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            lp lpVar = this.f34468b0;
            if (lpVar.f35811o1 != 0 && motionEvent.getY() < lpVar.f35811o1) {
                lpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        lp.I0(this.f34468b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        lp.I0(this.f34468b0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34468b0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34467a0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        lp.I0(this.f34468b0);
    }
}
