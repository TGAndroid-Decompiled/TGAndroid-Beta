package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class al extends FrameLayout {

    public float f36557a;

    public float f36558b;

    public final rn f36559c;

    public al(rn rnVar, Activity activity) {
        super(activity);
        this.f36559c = rnVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rn rnVar = this.f36559c;
        if (view == rnVar.f42241v2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = rnVar.f42292z2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            if (view == rnVar.f42241v2) {
                canvas.restore();
            }
            return zDrawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean zDrawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild2;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        rn rnVar = this.f36559c;
        if (!rnVar.f42254w2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = rnVar.D2;
            if (i12 >= animatorSetArr.length) {
                rnVar.f42254w2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i12];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i12++;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36557a = motionEvent.getY();
        int action = motionEvent.getAction();
        rn rnVar = this.f36559c;
        if (action == 1) {
            rnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f36558b - this.f36557a;
            rnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f36558b = this.f36557a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
