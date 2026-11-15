package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class nh extends rt {
    public boolean W;
    public int f37602a0;
    public int f37603b0;
    public ValueAnimator f37604c0;
    public final ki f37605d0;

    public nh(ki kiVar, Context context, xh xhVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xhVar, null, 1, true, e6Var);
        this.f37605d0 = kiVar;
    }

    @Override
    public final void c(float f10) {
        ki kiVar = this.f37605d0;
        kiVar.f36437e4 = f10;
        kh khVar = kiVar.B2;
        khVar.setTranslationY(f10);
        khVar.invalidate();
        kiVar.U0();
        kiVar.M1(kiVar.f36497w2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ft editText = this.f37605d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f37603b0 - editText.getScrollY()) + (this.f37602a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.v(14, this, editText));
            ValueAnimator valueAnimator = this.f37604c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f37604c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.f34419f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.u2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f37003x0 = false;
            emojiView.f37009y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f23606n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f37605d0.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) e2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.f37605d0;
        nh nhVar = kiVar.C2;
        if (!kiVar.f36482s3) {
            if (motionEvent.getX() > nhVar.getEditText().getLeft() && motionEvent.getX() < nhVar.getEditText().getRight() && motionEvent.getY() > nhVar.getEditText().getTop() && motionEvent.getY() < nhVar.getEditText().getBottom()) {
                kiVar.h1(nhVar.getEditText(), true);
            } else {
                kiVar.h1(nhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f37605d0.J1();
    }

    @Override
    public final void q(int i7, int i10) {
        ki kiVar = this.f37605d0;
        kh khVar = kiVar.B2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f37602a0 = getEditText().getMeasuredHeight();
            this.f37603b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!kiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            kiVar.B1(z10);
        }
        kiVar.U3 = khVar.getTop() + kiVar.T3;
        khVar.invalidate();
        kiVar.J1();
    }
}
