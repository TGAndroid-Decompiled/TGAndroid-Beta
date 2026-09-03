package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jl extends FrameLayout {
    public float f35316a;
    public float f35317b;
    public final zn f35318c;

    public jl(zn znVar, Activity activity) {
        super(activity);
        this.f35318c = znVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zn znVar = this.f35318c;
        if (view == znVar.f40788w2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = znVar.A2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == znVar.f40788w2) {
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
        zn znVar = this.f35318c;
        if (znVar.f40802x2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = znVar.E2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    znVar.f40802x2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f35316a = motionEvent.getY();
        int action = motionEvent.getAction();
        zn znVar = this.f35318c;
        if (action == 1) {
            znVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f35317b - this.f35316a;
            znVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f35317b = this.f35316a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
