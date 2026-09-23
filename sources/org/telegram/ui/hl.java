package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hl extends FrameLayout {
    public float f33880a;
    public float f33881b;
    public final xn f33882c;

    public hl(xn xnVar, Activity activity) {
        super(activity);
        this.f33882c = xnVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xn xnVar = this.f33882c;
        if (view == xnVar.f39623z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.i5[] i5VarArr = xnVar.D2;
        if (view != i5VarArr[0] && view != i5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == xnVar.f39623z2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xn xnVar = this.f33882c;
        if (xnVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = xnVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    xnVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f33880a = motionEvent.getY();
        int action = motionEvent.getAction();
        xn xnVar = this.f33882c;
        if (action == 1) {
            xnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f33881b - this.f33880a;
            xnVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f33881b = this.f33880a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
