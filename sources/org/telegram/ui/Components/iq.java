package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class iq extends NestedScrollView {
    public boolean W;
    public final mq f27309a0;

    public iq(mq mqVar, Context context) {
        super(context);
        this.f27309a0 = mqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        mq mqVar = this.f27309a0;
        int i12 = mqVar.f28584f;
        i10 = ((org.telegram.ui.ActionBar.f3) mqVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = mqVar.f28582b;
        int measuredWidth = getMeasuredWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) mqVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + mqVar.f28583c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            mq mqVar = this.f27309a0;
            if (mqVar.f28584f != 0 && motionEvent.getY() < mqVar.f28584f) {
                mqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        mq.n(this.f27309a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iq.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        mq.n(this.f27309a0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27309a0.isDismissed() && super.onTouchEvent(motionEvent)) {
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
        mq.n(this.f27309a0);
    }
}
