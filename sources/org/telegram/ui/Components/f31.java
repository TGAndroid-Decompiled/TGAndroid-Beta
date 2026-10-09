package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class f31 extends View {
    public final g31 f26234a;
    public Utilities.Callback f26235b;
    public final org.telegram.ui.ActionBar.e6 f26236c;
    public int d;

    public f31(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26236c = e6Var;
        g31 g31Var = new g31(i10, this, e6Var, false);
        this.f26234a = g31Var;
        g31Var.f26585r = new or0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.f26236c;
        if (e6Var != null) {
            e6Var.m(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.i6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f26234a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26234a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26234a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26234a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        g31 g31Var = this.f26234a;
        g31Var.e(messageObject);
        if (isAttachedToWindow()) {
            g31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f26235b = callback;
    }
}
