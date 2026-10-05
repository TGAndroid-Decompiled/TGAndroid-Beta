package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gl extends FrameLayout {
    public float f36697a;
    public float f36698b;
    public final yn f36699c;

    public gl(yn ynVar, Activity activity) {
        super(activity);
        this.f36699c = ynVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        yn ynVar = this.f36699c;
        if (view == ynVar.f43554x2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.i5[] i5VarArr = ynVar.B2;
        if (view != i5VarArr[0] && view != i5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == ynVar.f43554x2) {
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
        yn ynVar = this.f36699c;
        if (ynVar.f43567y2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = ynVar.F2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    ynVar.f43567y2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36697a = motionEvent.getY();
        int action = motionEvent.getAction();
        yn ynVar = this.f36699c;
        if (action == 1) {
            ynVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f36698b - this.f36697a;
            ynVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f36698b = this.f36697a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
