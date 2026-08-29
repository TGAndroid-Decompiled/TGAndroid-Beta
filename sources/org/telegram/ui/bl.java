package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bl extends FrameLayout {
    public float f36824a;
    public float f36825b;
    public final tn f36826c;

    public bl(tn tnVar, Activity activity) {
        super(activity);
        this.f36826c = tnVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tn tnVar = this.f36826c;
        if (view == tnVar.f43001v2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = tnVar.f43052z2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == tnVar.f43001v2) {
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
        tn tnVar = this.f36826c;
        if (tnVar.f43015w2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = tnVar.D2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    tnVar.f43015w2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36824a = motionEvent.getY();
        int action = motionEvent.getAction();
        tn tnVar = this.f36826c;
        if (action == 1) {
            tnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f9 = this.f36825b - this.f36824a;
            tnVar.movePreviewFragment(f9);
            if (f9 < 0.0f) {
                this.f36825b = this.f36824a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
