package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class jk extends FrameLayout {
    public float f46632a;
    public float f46633b;
    public final wm f46634c;

    public jk(wm wmVar, Activity activity) {
        super(activity);
        this.f46634c = wmVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wm wmVar = this.f46634c;
        if (view == wmVar.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = wmVar.S2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == wmVar.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        wm wmVar = this.f46634c;
        if (wmVar.P2) {
            int i11 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = wmVar.W2;
                if (i11 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i11];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i11++;
                } else {
                    wmVar.P2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f46632a = motionEvent.getY();
        int action = motionEvent.getAction();
        wm wmVar = this.f46634c;
        if (action == 1) {
            wmVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f46633b - this.f46632a;
            wmVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f46633b = this.f46632a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
