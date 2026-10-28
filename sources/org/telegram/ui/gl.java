package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gl extends FrameLayout {
    public float f39640a;
    public float f39641b;
    public final wn f39642c;

    public gl(wn wnVar, Activity activity) {
        super(activity);
        this.f39642c = wnVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wn wnVar = this.f39642c;
        if (view == wnVar.L2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.b6[] b6VarArr = wnVar.P2;
        if (view != b6VarArr[0] && view != b6VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == wnVar.L2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        wn wnVar = this.f39642c;
        if (wnVar.M2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = wnVar.T2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    wnVar.M2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f39640a = motionEvent.getY();
        int action = motionEvent.getAction();
        wn wnVar = this.f39642c;
        if (action == 1) {
            wnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f39641b - this.f39640a;
            wnVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f39641b = this.f39640a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
