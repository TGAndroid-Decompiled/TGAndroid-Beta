package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class pk extends FrameLayout {
    public float f48780a;
    public float f48781b;
    public final cn f48782c;

    public pk(cn cnVar, Activity activity) {
        super(activity);
        this.f48782c = cnVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cn cnVar = this.f48782c;
        if (view == cnVar.N2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.m5[] m5VarArr = cnVar.R2;
        if (view != m5VarArr[0] && view != m5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == cnVar.N2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        cn cnVar = this.f48782c;
        if (cnVar.O2) {
            int i11 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = cnVar.V2;
                if (i11 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i11];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i11++;
                } else {
                    cnVar.O2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f48780a = motionEvent.getY();
        int action = motionEvent.getAction();
        cn cnVar = this.f48782c;
        if (action == 1) {
            cnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f48781b - this.f48780a;
            cnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f48781b = this.f48780a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
