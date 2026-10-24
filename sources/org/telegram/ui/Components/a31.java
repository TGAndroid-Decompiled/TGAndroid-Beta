package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class a31 extends View {
    public final b31 f24616a;
    public Utilities.Callback f24617b;
    public final org.telegram.ui.ActionBar.g6 f24618c;
    public int d;

    public a31(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24618c = g6Var;
        b31 b31Var = new b31(i10, this, g6Var, false);
        this.f24616a = b31Var;
        b31Var.f24903s = new jr0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.g6 g6Var = this.f24618c;
        if (g6Var != null) {
            g6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f24616a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24616a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24616a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24616a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        b31 b31Var = this.f24616a;
        b31Var.e(messageObject);
        if (isAttachedToWindow()) {
            b31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f24617b = callback;
    }
}
