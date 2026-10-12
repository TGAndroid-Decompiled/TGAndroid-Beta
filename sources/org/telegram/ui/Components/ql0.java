package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ql0 extends FrameLayout {
    public final hf f29861a;
    public final rl0 f29862b;

    public ql0(rl0 rl0Var, Context context, hf hfVar) {
        super(context);
        this.f29862b = rl0Var;
        this.f29861a = hfVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(0.0f, this.f29862b.f30184r, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < this.f29862b.f30184r) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f29862b.F) {
            return this.f29861a.f26765a.g0(canvas, new oe(this, canvas, view, j3, 1));
        }
        return super.drawChild(canvas, view, j3);
    }
}
