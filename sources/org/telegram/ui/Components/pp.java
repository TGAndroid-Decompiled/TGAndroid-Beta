package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class pp extends NestedScrollView {
    public boolean f38378a0;
    public final tp f38379b0;

    public pp(tp tpVar, Context context) {
        super(context);
        this.f38379b0 = tpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tp tpVar = this.f38379b0;
        int scrollY = (int) ((getScrollY() + (tpVar.f39771r1 - tpVar.f29716t0)) - getTranslationY());
        Drawable drawable = tpVar.f39767m1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + tpVar.f39768o1.getMeasuredHeight() + scrollY + tpVar.f29716t0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            tp tpVar = this.f38379b0;
            if (tpVar.f39771r1 != 0 && motionEvent.getY() < tpVar.f39771r1) {
                tpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        tp.I0(this.f38379b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        tp.I0(this.f38379b0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38379b0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38378a0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        tp.I0(this.f38379b0);
    }
}
