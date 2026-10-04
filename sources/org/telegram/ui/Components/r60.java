package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r60 extends FrameLayout {
    public final RectF f30280a;
    public boolean f30281b;
    public Boolean f30282c;
    public final f70 d;

    public r60(f70 f70Var, Context context) {
        super(context);
        this.d = f70Var;
        this.f30280a = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r60.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f70 f70Var = this.d;
            if (f70Var.Z != 0 && motionEvent.getY() < f70Var.Z) {
                f70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f70.M(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        f70 f70Var = this.d;
        f70Var.f26342a0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) f70Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) f70Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        f70Var.f26342a0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f30281b = true;
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
        if (this.d.f26342a0) {
            return;
        }
        super.requestLayout();
    }
}
