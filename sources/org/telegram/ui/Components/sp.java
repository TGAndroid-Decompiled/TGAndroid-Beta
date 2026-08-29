package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class sp extends NestedScrollView {
    public boolean S;
    public final wp T;

    public sp(wp wpVar, Context context) {
        super(context);
        this.T = wpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        wp wpVar = this.T;
        int i12 = wpVar.f34476f;
        i10 = ((org.telegram.ui.ActionBar.f3) wpVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = wpVar.f34473b;
        int measuredWidth = getMeasuredWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) wpVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + wpVar.f34474c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wp wpVar = this.T;
            if (wpVar.f34476f != 0 && motionEvent.getY() < wpVar.f34476f) {
                wpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        wp.m(this.T);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        wp.m(this.T);
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
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        wp.m(this.T);
    }
}
