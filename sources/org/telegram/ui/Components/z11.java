package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class z11 extends View {
    public final a21 f33046a;
    public Utilities.Callback f33047b;
    public final org.telegram.ui.ActionBar.f6 f33048c;
    public int d;

    public z11(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33048c = f6Var;
        a21 a21Var = new a21(i10, this, f6Var, false);
        this.f33046a = a21Var;
        a21Var.f24249r = new jq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f33048c;
        if (f6Var != null) {
            f6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f33046a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33046a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33046a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33046a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        a21 a21Var = this.f33046a;
        a21Var.f(messageObject);
        if (isAttachedToWindow()) {
            a21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f33047b = callback;
    }
}
