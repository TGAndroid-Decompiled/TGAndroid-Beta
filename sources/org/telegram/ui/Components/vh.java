package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class vh extends wt {
    public boolean W;
    public int f40627a0;
    public int f40628b0;
    public ValueAnimator f40629c0;
    public final si f40630d0;

    public vh(si siVar, Context context, fi fiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, fiVar, null, 1, true, i6Var);
        this.f40630d0 = siVar;
    }

    @Override
    public final void c(float f10) {
        si siVar = this.f40630d0;
        siVar.f39672e4 = f10;
        sh shVar = siVar.B2;
        shVar.setTranslationY(f10);
        shVar.invalidate();
        siVar.V0();
        siVar.N1(siVar.f39732w2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            mt editText = this.f40630d0.C2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f40628b0 - editText.getScrollY()) + (this.f40627a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ch.w(14, this, editText));
            ValueAnimator valueAnimator = this.f40629c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40629c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(lr.f37208f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.x2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f39407x0 = false;
            emojiView.f39413y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f24113n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f40630d0.f39659a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) h2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si siVar = this.f40630d0;
        vh vhVar = siVar.C2;
        if (!siVar.f39717s3) {
            if (motionEvent.getX() > vhVar.getEditText().getLeft() && motionEvent.getX() < vhVar.getEditText().getRight() && motionEvent.getY() > vhVar.getEditText().getTop() && motionEvent.getY() < vhVar.getEditText().getBottom()) {
                siVar.i1(vhVar.getEditText(), true);
            } else {
                siVar.i1(vhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f40630d0.K1();
    }

    @Override
    public final void q(int i7, int i10) {
        si siVar = this.f40630d0;
        sh shVar = siVar.B2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f40627a0 = getEditText().getMeasuredHeight();
            this.f40628b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!siVar.X1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            siVar.C1(z10);
        }
        siVar.U3 = shVar.getTop() + siVar.T3;
        shVar.invalidate();
        siVar.K1();
    }
}
