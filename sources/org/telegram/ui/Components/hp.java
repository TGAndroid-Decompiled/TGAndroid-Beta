package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class hp extends NestedScrollView {
    public boolean W;
    public final lp f34424a0;

    public hp(lp lpVar, Context context) {
        super(context);
        this.f34424a0 = lpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lp lpVar = this.f34424a0;
        int scrollY = (int) ((getScrollY() + (lpVar.f35713q1 - lpVar.f28704s0)) - getTranslationY());
        Drawable drawable = lpVar.l1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + lpVar.n1.getMeasuredHeight() + scrollY + lpVar.f28704s0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            lp lpVar = this.f34424a0;
            if (lpVar.f35713q1 != 0 && motionEvent.getY() < lpVar.f35713q1) {
                lpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        lp.I0(this.f34424a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        lp.I0(this.f34424a0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34424a0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        lp.I0(this.f34424a0);
    }
}
