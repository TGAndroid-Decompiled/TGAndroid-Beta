package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends FrameLayout {
    public final RectF f35221a;
    public boolean f35222b;
    public Boolean f35223c;
    public final n60 d;

    public z50(n60 n60Var, Context context) {
        super(context);
        this.d = n60Var;
        this.f35221a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z50.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n60 n60Var = this.d;
            if (n60Var.V != 0 && motionEvent.getY() < n60Var.V) {
                n60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n60.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        n60 n60Var = this.d;
        n60Var.W = true;
        i12 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        n60Var.W = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f35222b = true;
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
