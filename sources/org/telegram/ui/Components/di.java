package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class di extends zu {
    public boolean V;
    public int W;
    public int f25709a0;
    public ValueAnimator f25710b0;
    public final yi f25711c0;

    public di(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, oiVar, null, 1, true, e6Var);
        this.f25711c0 = yiVar;
    }

    @Override
    public final void c(float f7) {
        yi yiVar = this.f25711c0;
        yiVar.f33242j2 = f7;
        ai aiVar = yiVar.G0;
        aiVar.setTranslationY(f7);
        aiVar.invalidate();
        yiVar.i1();
        yiVar.b2(yiVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ru editText = this.f25711c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f25709a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f25710b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f25710b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(hs.f27118f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.f3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        a00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f24464w0 = false;
            emojiView.f24466w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f25711c0.f33228f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.f25711c0;
        di diVar = yiVar.H0;
        if (!yiVar.f33286x1) {
            if (motionEvent.getX() > diVar.getEditText().getLeft() && motionEvent.getX() < diVar.getEditText().getRight() && motionEvent.getY() > diVar.getEditText().getTop() && motionEvent.getY() < diVar.getEditText().getBottom()) {
                yiVar.w1(diVar.getEditText(), true);
            } else {
                yiVar.w1(diVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25711c0.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        yi yiVar = this.f25711c0;
        ai aiVar = yiVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f25709a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!yiVar.f33217c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            yiVar.Q1(z10);
        }
        yiVar.Z1 = aiVar.getTop() + yiVar.Y1;
        aiVar.invalidate();
        yiVar.Y1();
    }
}
