package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class xh extends yt {
    public boolean W;
    public int f42090a0;
    public int f42091b0;
    public ValueAnimator f42092c0;
    public final ui f42093d0;

    public xh(ui uiVar, Context context, hi hiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, hiVar, null, 1, true, h6Var);
        this.f42093d0 = uiVar;
    }

    @Override
    public final void c(float f10) {
        ui uiVar = this.f42093d0;
        uiVar.f40380e4 = f10;
        uh uhVar = uiVar.B2;
        uhVar.setTranslationY(f10);
        uhVar.invalidate();
        uiVar.V0();
        uiVar.N1(uiVar.f40440w2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            ot editText = this.f42093d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f42091b0 - editText.getScrollY()) + (this.f42090a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.w(14, this, editText));
            ValueAnimator valueAnimator = this.f42092c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42092c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(nr.f37960f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.w2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f40153x0 = false;
            emojiView.f40159y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24041n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f42093d0.f40367a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.f42093d0;
        xh xhVar = uiVar.C2;
        if (!uiVar.f40425s3) {
            if (motionEvent.getX() > xhVar.getEditText().getLeft() && motionEvent.getX() < xhVar.getEditText().getRight() && motionEvent.getY() > xhVar.getEditText().getTop() && motionEvent.getY() < xhVar.getEditText().getBottom()) {
                uiVar.i1(xhVar.getEditText(), true);
            } else {
                uiVar.i1(xhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f42093d0.K1();
    }

    @Override
    public final void q(int i7, int i10) {
        ui uiVar = this.f42093d0;
        uh uhVar = uiVar.B2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f42090a0 = getEditText().getMeasuredHeight();
            this.f42091b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!uiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            uiVar.C1(z10);
        }
        uiVar.U3 = uhVar.getTop() + uiVar.T3;
        uhVar.invalidate();
        uiVar.K1();
    }
}
