package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class b31 extends View {
    public final c31 f23693a;
    public Utilities.Callback f23694b;
    public final org.telegram.ui.ActionBar.c6 f23695c;
    public int d;

    public b31(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23695c = c6Var;
        c31 c31Var = new c31(i10, this, c6Var, false);
        this.f23693a = c31Var;
        c31Var.f23939r = new lr0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.c6 c6Var = this.f23695c;
        if (c6Var != null) {
            c6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f23693a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23693a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23693a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23693a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        c31 c31Var = this.f23693a;
        c31Var.e(messageObject);
        if (isAttachedToWindow()) {
            c31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f23694b = callback;
    }
}
