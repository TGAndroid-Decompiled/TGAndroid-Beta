package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hl extends FrameLayout {
    public float f34909a;
    public float f34910b;
    public final xn f34911c;

    public hl(xn xnVar, Activity activity) {
        super(activity);
        this.f34911c = xnVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        xn xnVar = this.f34911c;
        if (view == xnVar.f40222w2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = xnVar.A2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == xnVar.f40222w2) {
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
        xn xnVar = this.f34911c;
        if (xnVar.f40236x2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = xnVar.E2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    xnVar.f40236x2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f34909a = motionEvent.getY();
        int action = motionEvent.getAction();
        xn xnVar = this.f34911c;
        if (action == 1) {
            xnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f34910b - this.f34909a;
            xnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f34910b = this.f34909a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
