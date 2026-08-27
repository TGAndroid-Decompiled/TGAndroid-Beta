package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;

public final class mp extends NestedScrollView {
    public boolean S;
    public final qp T;

    public mp(qp qpVar, Context context) {
        super(context, null);
        this.T = qpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qp qpVar = this.T;
        int scrollY = (int) ((getScrollY() + (qpVar.f31956f - ((org.telegram.ui.ActionBar.e3) qpVar).backgroundPaddingTop)) - getTranslationY());
        Drawable drawable = qpVar.f31953b;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), AndroidUtilities.dp(19.0f) + ((org.telegram.ui.ActionBar.e3) qpVar).backgroundPaddingTop + qpVar.f31954c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            qp qpVar = this.T;
            if (qpVar.f31956f != 0 && motionEvent.getY() < qpVar.f31956f) {
                qpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qp.m(this.T);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        qp qpVar = this.T;
        measureChildWithMargins(qpVar.f31954c, i10, 0, i11, 0);
        int measuredHeight = qpVar.f31954c.getMeasuredHeight();
        int i12 = (size / 5) * 3;
        int i13 = size - i12;
        if (qpVar.f31955e || measuredHeight - i13 < AndroidUtilities.dp(90.0f)) {
            i12 = size - measuredHeight;
        } else {
            if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2)) {
                i12 = size - measuredHeight;
            } else {
                int iDp = AndroidUtilities.dp(108.0f) + (measuredHeight / 2);
                if (i13 < iDp) {
                    i12 = size - iDp;
                }
            }
        }
        if (getPaddingTop() != i12) {
            this.S = true;
            setPadding(0, i12, 0, 0);
            this.S = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        qp.m(this.T);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.T.isDismissed() && super.onTouchEvent(motionEvent);
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
        qp.m(this.T);
    }
}
