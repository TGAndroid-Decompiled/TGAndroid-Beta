package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class c31 extends View {
    public final d31 f23628a;
    public Utilities.Callback f23629b;
    public final org.telegram.ui.ActionBar.c6 f23630c;
    public int d;

    public c31(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23630c = c6Var;
        d31 d31Var = new d31(i10, this, c6Var, false);
        this.f23628a = d31Var;
        d31Var.f23974r = new kr0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.c6 c6Var = this.f23630c;
        if (c6Var != null) {
            c6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f23628a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23628a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23628a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23628a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        d31 d31Var = this.f23628a;
        d31Var.e(messageObject);
        if (isAttachedToWindow()) {
            d31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f23629b = callback;
    }
}
