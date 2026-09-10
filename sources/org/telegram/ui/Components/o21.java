package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class o21 extends View {
    public final p21 f25647a;
    public Utilities.Callback f25648b;
    public final org.telegram.ui.ActionBar.f6 f25649c;
    public int d;

    public o21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f25649c = f6Var;
        p21 p21Var = new p21(i10, this, f6Var, false);
        this.f25647a = p21Var;
        p21Var.f26004r = new uq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f25649c;
        if (f6Var != null) {
            f6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f25647a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25647a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25647a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25647a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        p21 p21Var = this.f25647a;
        p21Var.f(messageObject);
        if (isAttachedToWindow()) {
            p21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f25648b = callback;
    }
}
