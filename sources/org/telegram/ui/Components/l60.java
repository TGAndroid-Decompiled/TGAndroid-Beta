package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l60 extends FrameLayout {
    public final RectF f26041a;
    public boolean f26042b;
    public Boolean f26043c;
    public final z60 d;

    public l60(z60 z60Var, Context context) {
        super(context);
        this.d = z60Var;
        this.f26041a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l60.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z60 z60Var = this.d;
            if (z60Var.Z != 0 && motionEvent.getY() < z60Var.Z) {
                z60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z60.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        z60 z60Var = this.d;
        z60Var.f30746a0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) z60Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) z60Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        z60Var.f30746a0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f26042b = true;
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
        if (this.d.f30746a0) {
            return;
        }
        super.requestLayout();
    }
}
