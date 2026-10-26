package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class kq extends NestedScrollView {
    public boolean W;
    public final oq f29955a0;

    public kq(oq oqVar, Context context) {
        super(context);
        this.f29955a0 = oqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        oq oqVar = this.f29955a0;
        int i12 = oqVar.h;
        i10 = ((org.telegram.ui.ActionBar.k3) oqVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = oqVar.f31355b;
        int measuredWidth = getMeasuredWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) oqVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + oqVar.d.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            oq oqVar = this.f29955a0;
            if (oqVar.h != 0 && motionEvent.getY() < oqVar.h) {
                oqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        oq.m(this.f29955a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        oq.m(this.f29955a0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29955a0.isDismissed() && super.onTouchEvent(motionEvent)) {
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
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        oq.m(this.f29955a0);
    }
}
