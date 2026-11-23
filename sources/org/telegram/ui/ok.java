package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ok extends FrameLayout {
    public float f50592a;
    public float f50593b;
    public final bn f50594c;

    public ok(bn bnVar, Activity activity) {
        super(activity);
        this.f50594c = bnVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bn bnVar = this.f50594c;
        if (view == bnVar.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.m5[] m5VarArr = bnVar.S2;
        if (view != m5VarArr[0] && view != m5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == bnVar.O2) {
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
        bn bnVar = this.f50594c;
        if (bnVar.P2) {
            int i11 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = bnVar.W2;
                if (i11 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i11];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i11++;
                } else {
                    bnVar.P2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f50592a = motionEvent.getY();
        int action = motionEvent.getAction();
        bn bnVar = this.f50594c;
        if (action == 1) {
            bnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f50593b - this.f50592a;
            bnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f50593b = this.f50592a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
