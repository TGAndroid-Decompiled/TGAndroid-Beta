package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class aq extends NestedScrollView {
    public boolean W;
    public final eq f22732a0;

    public aq(eq eqVar, Context context) {
        super(context);
        this.f22732a0 = eqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        eq eqVar = this.f22732a0;
        int i12 = eqVar.f24104f;
        i10 = ((org.telegram.ui.ActionBar.g3) eqVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = eqVar.f24102b;
        int measuredWidth = getMeasuredWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) eqVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + eqVar.f24103c.getMeasuredHeight() + scrollY);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            eq eqVar = this.f22732a0;
            if (eqVar.f24104f != 0 && motionEvent.getY() < eqVar.f24104f) {
                eqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        eq.m(this.f22732a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aq.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        eq.m(this.f22732a0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f22732a0.isDismissed() && super.onTouchEvent(motionEvent)) {
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
        eq.m(this.f22732a0);
    }
}
