package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kl extends FrameLayout {
    public float f35302a;
    public float f35303b;
    public final bo f35304c;

    public kl(bo boVar, Activity activity) {
        super(activity);
        this.f35304c = boVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bo boVar = this.f35304c;
        if (view == boVar.f32529z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = boVar.D2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == boVar.f32529z2) {
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
        bo boVar = this.f35304c;
        if (boVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = boVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    boVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f35302a = motionEvent.getY();
        int action = motionEvent.getAction();
        bo boVar = this.f35304c;
        if (action == 1) {
            boVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f35303b - this.f35302a;
            boVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f35303b = this.f35302a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
