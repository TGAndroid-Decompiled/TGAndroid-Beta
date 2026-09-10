package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class di extends nu {
    public boolean V;
    public int W;
    public int f22423a0;
    public ValueAnimator f22424b0;
    public final yi f22425c0;

    public di(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, oiVar, null, 1, true, f6Var);
        this.f22425c0 = yiVar;
    }

    @Override
    public final void c(float f7) {
        yi yiVar = this.f22425c0;
        yiVar.f29371g2 = f7;
        ai aiVar = yiVar.D0;
        aiVar.setTranslationY(f7);
        aiVar.invalidate();
        yiVar.g1();
        yiVar.X1(yiVar.f29427y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            fu editText = this.f22425c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22423a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new gg.t1(12, this, editText));
            ValueAnimator valueAnimator = this.f22424b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22424b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wr.f28819f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.h3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26867w0 = false;
            emojiView.f26873x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f22425c0.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) p2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.f22425c0;
        di diVar = yiVar.E0;
        if (!yiVar.f29413u1) {
            if (motionEvent.getX() > diVar.getEditText().getLeft() && motionEvent.getX() < diVar.getEditText().getRight() && motionEvent.getY() > diVar.getEditText().getTop() && motionEvent.getY() < diVar.getEditText().getBottom()) {
                yiVar.t1(diVar.getEditText(), true);
            } else {
                yiVar.t1(diVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22425c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        yi yiVar = this.f22425c0;
        ai aiVar = yiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22423a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!yiVar.f29356c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            yiVar.M1(z10);
        }
        yiVar.W1 = aiVar.getTop() + yiVar.V1;
        aiVar.invalidate();
        yiVar.U1();
    }
}
