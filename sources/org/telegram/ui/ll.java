package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ll extends FrameLayout {
    public float f39728a;
    public float f39729b;
    public final zn f39730c;

    public ll(zn znVar, Activity activity) {
        super(activity);
        this.f39730c = znVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zn znVar = this.f39730c;
        if (view == znVar.f45049z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = znVar.D2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == znVar.f45049z2) {
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
        zn znVar = this.f39730c;
        if (znVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = znVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    znVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f39728a = motionEvent.getY();
        int action = motionEvent.getAction();
        zn znVar = this.f39730c;
        if (action == 1) {
            znVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f39729b - this.f39728a;
            znVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f39729b = this.f39728a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
