package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends cv {
    public boolean V;
    public int W;
    public int f26073a0;
    public ValueAnimator f26074b0;
    public final aj f26075c0;

    public fi(aj ajVar, Context context, qi qiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, qiVar, null, 1, true, c6Var);
        this.f26075c0 = ajVar;
    }

    @Override
    public final void c(float f7) {
        aj ajVar = this.f26075c0;
        ajVar.f24356j2 = f7;
        ci ciVar = ajVar.G0;
        ciVar.setTranslationY(f7);
        ciVar.invalidate();
        ajVar.i1();
        ajVar.b2(ajVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            uu editText = this.f26075c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f26073a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f26074b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26074b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(js.f27627f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.e3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        d00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f25143w0 = false;
            emojiView.f25145w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f26075c0.f24342f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo.n8(menu, ((org.telegram.ui.eo) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        aj ajVar = this.f26075c0;
        fi fiVar = ajVar.H0;
        if (!ajVar.f24400x1) {
            if (motionEvent.getX() > fiVar.getEditText().getLeft() && motionEvent.getX() < fiVar.getEditText().getRight() && motionEvent.getY() > fiVar.getEditText().getTop() && motionEvent.getY() < fiVar.getEditText().getBottom()) {
                ajVar.w1(fiVar.getEditText(), true);
            } else {
                ajVar.w1(fiVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26075c0.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        aj ajVar = this.f26075c0;
        ci ciVar = ajVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f26073a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!ajVar.f24331c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            ajVar.Q1(z10);
        }
        ajVar.Z1 = ciVar.getTop() + ajVar.Y1;
        ciVar.invalidate();
        ajVar.Y1();
    }
}
