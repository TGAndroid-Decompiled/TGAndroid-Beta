package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q60 extends FrameLayout {
    public final RectF f27552a;
    public boolean f27553b;
    public Boolean f27554c;
    public final e70 d;

    public q60(e70 e70Var, Context context) {
        super(context);
        this.d = e70Var;
        this.f27552a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q60.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e70 e70Var = this.d;
            if (e70Var.Z != 0 && motionEvent.getY() < e70Var.Z) {
                e70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e70.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        e70 e70Var = this.d;
        e70Var.f23911a0 = true;
        i12 = ((org.telegram.ui.ActionBar.e3) e70Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.e3) e70Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        e70Var.f23911a0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f27553b = true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.d.f23911a0) {
            return;
        }
        super.requestLayout();
    }
}
