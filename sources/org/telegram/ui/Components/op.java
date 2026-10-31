package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
public final class op extends NestedScrollView {
    public boolean W;
    public final sp f29112a0;

    public op(sp spVar, Context context) {
        super(context);
        this.f29112a0 = spVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sp spVar = this.f29112a0;
        int scrollY = (int) ((getScrollY() + (spVar.f30311n1 - spVar.f21614s0)) - getTranslationY());
        Drawable drawable = spVar.f30307i1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.i0.L(19.0f) + spVar.f30309k1.getMeasuredHeight() + scrollY + spVar.f21614s0);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            sp spVar = this.f29112a0;
            if (spVar.f30311n1 != 0 && motionEvent.getY() < spVar.f30311n1) {
                spVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sp.I0(this.f29112a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        sp.I0(this.f29112a0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29112a0.I && super.onTouchEvent(motionEvent)) {
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
        sp.I0(this.f29112a0);
    }
}
