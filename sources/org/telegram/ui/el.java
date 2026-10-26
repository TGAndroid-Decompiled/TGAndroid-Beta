package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class el extends FrameLayout {
    public float f39130a;
    public float f39131b;
    public final un f39132c;

    public el(un unVar, Activity activity) {
        super(activity);
        this.f39132c = unVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        un unVar = this.f39132c;
        if (view == unVar.L2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.b6[] b6VarArr = unVar.P2;
        if (view != b6VarArr[0] && view != b6VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == unVar.L2) {
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
        un unVar = this.f39132c;
        if (unVar.M2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = unVar.T2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    unVar.M2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f39130a = motionEvent.getY();
        int action = motionEvent.getAction();
        un unVar = this.f39132c;
        if (action == 1) {
            unVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f39131b - this.f39130a;
            unVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f39131b = this.f39130a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
