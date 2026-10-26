package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class k31 extends View {
    public final l31 f29801a;
    public Utilities.Callback f29802b;
    public final org.telegram.ui.ActionBar.u6 f29803c;
    public int d;

    public k31(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f29803c = u6Var;
        l31 l31Var = new l31(i10, this, u6Var, false);
        this.f29801a = l31Var;
        l31Var.f30053s = new mp0(this, 24);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.u6 u6Var = this.f29803c;
        if (u6Var != null) {
            u6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.y6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f29801a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29801a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29801a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29801a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        l31 l31Var = this.f29801a;
        l31Var.e(messageObject);
        if (isAttachedToWindow()) {
            l31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f29802b = callback;
    }
}
