package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class wh extends wt {
    public boolean W;
    public int f41652a0;
    public int f41653b0;
    public ValueAnimator f41654c0;
    public final ti f41655d0;

    public wh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, giVar, null, 1, true, i6Var);
        this.f41655d0 = tiVar;
    }

    @Override
    public final void c(float f10) {
        ti tiVar = this.f41655d0;
        tiVar.f39969e4 = f10;
        th thVar = tiVar.B2;
        thVar.setTranslationY(f10);
        thVar.invalidate();
        tiVar.V0();
        tiVar.N1(tiVar.f40029w2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.f41655d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f41653b0 - editText.getScrollY()) + (this.f41652a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.w(14, this, editText));
            ValueAnimator valueAnimator = this.f41654c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f41654c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(kr.f36858f);
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
        qy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f39109x0 = false;
            emojiView.f39115y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24221n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41655d0.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f41655d0;
        wh whVar = tiVar.C2;
        if (!tiVar.f40014s3) {
            if (motionEvent.getX() > whVar.getEditText().getLeft() && motionEvent.getX() < whVar.getEditText().getRight() && motionEvent.getY() > whVar.getEditText().getTop() && motionEvent.getY() < whVar.getEditText().getBottom()) {
                tiVar.i1(whVar.getEditText(), true);
            } else {
                tiVar.i1(whVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f41655d0.K1();
    }

    @Override
    public final void q(int i7, int i10) {
        ti tiVar = this.f41655d0;
        th thVar = tiVar.B2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f41652a0 = getEditText().getMeasuredHeight();
            this.f41653b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!tiVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.C1(z10);
        }
        tiVar.U3 = thVar.getTop() + tiVar.T3;
        thVar.invalidate();
        tiVar.K1();
    }
}
