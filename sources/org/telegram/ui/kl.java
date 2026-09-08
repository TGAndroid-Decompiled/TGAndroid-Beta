package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kl extends FrameLayout {
    public float f38112a;
    public float f38113b;
    public final co f38114c;

    public kl(co coVar, Activity activity) {
        super(activity);
        this.f38114c = coVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        co coVar = this.f38114c;
        if (view == coVar.f35527z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.j5[] j5VarArr = coVar.D2;
        if (view != j5VarArr[0] && view != j5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == coVar.f35527z2) {
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
        co coVar = this.f38114c;
        if (coVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = coVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    coVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f38112a = motionEvent.getY();
        int action = motionEvent.getAction();
        co coVar = this.f38114c;
        if (action == 1) {
            coVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f38113b - this.f38112a;
            coVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f38113b = this.f38112a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
