package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class vp extends NestedScrollView {
    public boolean f41400a0;
    public final zp f41401b0;

    public vp(zp zpVar, Context context) {
        super(context);
        this.f41401b0 = zpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zp zpVar = this.f41401b0;
        int scrollY = (int) ((getScrollY() + (zpVar.f43012r1 - zpVar.f30260t0)) - getTranslationY());
        Drawable drawable = zpVar.f43008m1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + zpVar.f43009o1.getMeasuredHeight() + scrollY + zpVar.f30260t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            zp zpVar = this.f41401b0;
            if (zpVar.f43012r1 != 0 && motionEvent.getY() < zpVar.f43012r1) {
                zpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        zp.J0(this.f41401b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        zp.J0(this.f41401b0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41401b0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f41400a0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zp.J0(this.f41401b0);
    }
}
