package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hl extends FrameLayout {
    public float f34232a;
    public float f34233b;
    public final zn f34234c;

    public hl(zn znVar, Activity activity) {
        super(activity);
        this.f34234c = znVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zn znVar = this.f34234c;
        if (view == znVar.f40557z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.j5[] j5VarArr = znVar.D2;
        if (view != j5VarArr[0] && view != j5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == znVar.f40557z2) {
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
        zn znVar = this.f34234c;
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
        this.f34232a = motionEvent.getY();
        int action = motionEvent.getAction();
        zn znVar = this.f34234c;
        if (action == 1) {
            znVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f34233b - this.f34232a;
            znVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f34233b = this.f34232a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
