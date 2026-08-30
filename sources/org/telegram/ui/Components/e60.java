package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e60 extends FrameLayout {
    public final RectF f24479a;
    public boolean f24480b;
    public Boolean f24481c;
    public final s60 d;

    public e60(s60 s60Var, Context context) {
        super(context);
        this.d = s60Var;
        this.f24479a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e60.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            s60 s60Var = this.d;
            if (s60Var.W != 0 && motionEvent.getY() < s60Var.W) {
                s60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        s60.O(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        s60 s60Var = this.d;
        s60Var.X = true;
        i12 = ((org.telegram.ui.ActionBar.g3) s60Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.g3) s60Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        s60Var.X = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f24480b = true;
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
        if (this.d.X) {
            return;
        }
        super.requestLayout();
    }
}
