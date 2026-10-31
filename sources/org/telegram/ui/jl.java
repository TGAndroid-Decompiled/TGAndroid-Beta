package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class jl extends FrameLayout {
    public float f38541a;
    public float f38542b;
    public final un f38543c;

    public jl(un unVar, Activity activity) {
        super(activity);
        this.f38543c = unVar;
        setOnLongClickListener(new s(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        un unVar = this.f38543c;
        if (view == unVar.N2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(48.0f));
        }
        org.telegram.ui.ActionBar.u5[] u5VarArr = unVar.R2;
        if (view != u5VarArr[0] && view != u5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == unVar.N2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.i0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        un unVar = this.f38543c;
        if (unVar.O2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = unVar.V2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    unVar.O2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f38541a = motionEvent.getY();
        int action = motionEvent.getAction();
        un unVar = this.f38543c;
        if (action == 1) {
            unVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f38542b - this.f38541a;
            unVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f38542b = this.f38541a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
