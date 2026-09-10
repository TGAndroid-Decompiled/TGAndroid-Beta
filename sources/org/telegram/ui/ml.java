package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ml extends FrameLayout {
    public float f34995a;
    public float f34996b;
    public final eo f34997c;

    public ml(eo eoVar, Activity activity) {
        super(activity);
        this.f34997c = eoVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eo eoVar = this.f34997c;
        if (view == eoVar.f32569z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.l5[] l5VarArr = eoVar.D2;
        if (view != l5VarArr[0] && view != l5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == eoVar.f32569z2) {
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
        eo eoVar = this.f34997c;
        if (eoVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = eoVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    eoVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f34995a = motionEvent.getY();
        int action = motionEvent.getAction();
        eo eoVar = this.f34997c;
        if (action == 1) {
            eoVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f34996b - this.f34995a;
            eoVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f34996b = this.f34995a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
