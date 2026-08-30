package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class c21 extends View {
    public final d21 f23820a;
    public Utilities.Callback f23821b;
    public final org.telegram.ui.ActionBar.f6 f23822c;
    public int d;

    public c21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23822c = f6Var;
        d21 d21Var = new d21(i10, this, f6Var, false);
        this.f23820a = d21Var;
        d21Var.f24121r = new nq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f23822c;
        if (f6Var != null) {
            f6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f23820a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23820a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23820a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23820a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        d21 d21Var = this.f23820a;
        d21Var.f(messageObject);
        if (isAttachedToWindow()) {
            d21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f23821b = callback;
    }
}
