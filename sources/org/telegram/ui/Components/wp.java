package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class wp extends NestedScrollView {
    public boolean T;
    public final aq U;

    public wp(aq aqVar, Context context) {
        super(context);
        this.U = aqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        aq aqVar = this.U;
        int i12 = aqVar.f23494f;
        i10 = ((org.telegram.ui.ActionBar.g3) aqVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = aqVar.f23492b;
        int measuredWidth = getMeasuredWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) aqVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + aqVar.f23493c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            aq aqVar = this.U;
            if (aqVar.f23494f != 0 && motionEvent.getY() < aqVar.f23494f) {
                aqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        aq.m(this.U);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        aq.m(this.U);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.U.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        aq.m(this.U);
    }
}
