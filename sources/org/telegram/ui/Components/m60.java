package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m60 extends FrameLayout {
    public final RectF f25168a;
    public boolean f25169b;
    public Boolean f25170c;
    public final a70 d;

    public m60(a70 a70Var, Context context) {
        super(context);
        this.d = a70Var;
        this.f25168a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m60.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a70 a70Var = this.d;
            if (a70Var.Z != 0 && motionEvent.getY() < a70Var.Z) {
                a70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a70.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        a70 a70Var = this.d;
        a70Var.f21397a0 = true;
        i12 = ((org.telegram.ui.ActionBar.h3) a70Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) a70Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        a70Var.f21397a0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f25169b = true;
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
        if (this.d.f21397a0) {
            return;
        }
        super.requestLayout();
    }
}
