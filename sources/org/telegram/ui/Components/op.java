package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class op extends NestedScrollView {
    public boolean S;
    public final sp T;

    public op(sp spVar, Context context) {
        super(context);
        this.T = spVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        sp spVar = this.T;
        int i11 = spVar.f32536f;
        i9 = ((org.telegram.ui.ActionBar.f3) spVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i11 - i9)) - getTranslationY());
        Drawable drawable = spVar.f32533b;
        int measuredWidth = getMeasuredWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) spVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i10 + spVar.f32534c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            sp spVar = this.T;
            if (spVar.f32536f != 0 && motionEvent.getY() < spVar.f32536f) {
                spVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        sp.m(this.T);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        sp.m(this.T);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.T.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sp.m(this.T);
    }
}
