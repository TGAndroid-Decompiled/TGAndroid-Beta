package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class in0 extends org.telegram.ui.Cells.z9 {
    public final int H = 1;

    public in0(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10) {
        super(context, z4Var, i10);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 0:
                if (canvas.isHardwareAccelerated()) {
                    super.draw(canvas);
                    return;
                } else {
                    rf.e0.a(canvas, this, new s3(this, 16));
                    return;
                }
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public in0(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, z4Var, i10, j10, p6Var);
    }
}
