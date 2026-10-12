package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pl extends FrameLayout {
    public float f39258a;
    public float f39259b;
    public final fo f39260c;

    public pl(fo foVar, Activity activity) {
        super(activity);
        this.f39260c = foVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fo foVar = this.f39260c;
        if (view == foVar.f36187z2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = foVar.D2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == foVar.f36187z2) {
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
        fo foVar = this.f39260c;
        if (foVar.A2) {
            int i12 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = foVar.H2;
                if (i12 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i12];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i12++;
                } else {
                    foVar.A2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f39258a = motionEvent.getY();
        int action = motionEvent.getAction();
        fo foVar = this.f39260c;
        if (action == 1) {
            foVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.f39259b - this.f39258a;
            foVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.f39259b = this.f39258a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
