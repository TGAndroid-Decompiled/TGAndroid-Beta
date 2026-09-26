package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gl extends FrameLayout {
    public float f33957a;
    public float f33958b;
    public final wn f33959c;

    public gl(wn wnVar, Activity activity) {
        super(activity);
        this.f33959c = wnVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        wn wnVar = this.f33959c;
        if (view == wnVar.f39722z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = wnVar.D2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == wnVar.f39722z2) {
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
        wn wnVar = this.f33959c;
        if (wnVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = wnVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    wnVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f33957a = motionEvent.getY();
        int action = motionEvent.getAction();
        wn wnVar = this.f33959c;
        if (action == 1) {
            wnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f33958b - this.f33957a;
            wnVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f33958b = this.f33957a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
