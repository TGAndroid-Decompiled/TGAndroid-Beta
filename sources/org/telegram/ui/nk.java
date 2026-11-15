package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class nk extends FrameLayout {
    public float f49572a;
    public float f49573b;
    public final an f49574c;

    public nk(an anVar, Activity activity) {
        super(activity);
        this.f49574c = anVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        an anVar = this.f49574c;
        if (view == anVar.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.j5[] j5VarArr = anVar.S2;
        if (view != j5VarArr[0] && view != j5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == anVar.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        an anVar = this.f49574c;
        if (anVar.P2) {
            int i11 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = anVar.W2;
                if (i11 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i11];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i11++;
                } else {
                    anVar.P2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f49572a = motionEvent.getY();
        int action = motionEvent.getAction();
        an anVar = this.f49574c;
        if (action == 1) {
            anVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f49573b - this.f49572a;
            anVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f49573b = this.f49572a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
