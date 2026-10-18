package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class el extends FrameLayout {
    public float f36550a;
    public float f36551b;
    public final sn f36552c;

    public el(sn snVar, Activity activity) {
        super(activity);
        this.f36552c = snVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sn snVar = this.f36552c;
        if (view == snVar.f41446z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.j5[] j5VarArr = snVar.D2;
        if (view != j5VarArr[0] && view != j5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == snVar.f41446z2) {
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
        sn snVar = this.f36552c;
        if (snVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = snVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    snVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36550a = motionEvent.getY();
        int action = motionEvent.getAction();
        sn snVar = this.f36552c;
        if (action == 1) {
            snVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f36551b - this.f36550a;
            snVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f36551b = this.f36550a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
