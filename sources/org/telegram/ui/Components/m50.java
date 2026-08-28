package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m50 extends FrameLayout {
    public final RectF f30695a;
    public boolean f30696b;
    public Boolean f30697c;
    public final a60 d;

    public m50(a60 a60Var, Context context) {
        super(context);
        this.d = a60Var;
        this.f30695a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m50.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a60 a60Var = this.d;
            if (a60Var.V != 0 && motionEvent.getY() < a60Var.V) {
                a60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a60.N(this.d);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        a60 a60Var = this.d;
        a60Var.W = true;
        i11 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
        int i13 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
        setPadding(i11, i13, i12, 0);
        a60Var.W = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f30696b = true;
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
        if (this.d.W) {
            return;
        }
        super.requestLayout();
    }
}
