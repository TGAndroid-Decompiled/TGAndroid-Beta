package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ci extends mu {
    public boolean V;
    public int W;
    public int f23319a0;
    public ValueAnimator f23320b0;
    public final xi f23321c0;

    public ci(xi xiVar, Context context, ni niVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, niVar, null, 1, true, d6Var);
        this.f23321c0 = xiVar;
    }

    @Override
    public final void c(float f7) {
        xi xiVar = this.f23321c0;
        xiVar.f30275g2 = f7;
        zh zhVar = xiVar.D0;
        zhVar.setTranslationY(f7);
        zhVar.invalidate();
        xiVar.g1();
        xiVar.X1(xiVar.f30331y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.f23321c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f23319a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f23320b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f23320b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f28636f);
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
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26880w0 = false;
            emojiView.f26882w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23321c0.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.f23321c0;
        ci ciVar = xiVar.E0;
        if (!xiVar.f30317u1) {
            if (motionEvent.getX() > ciVar.getEditText().getLeft() && motionEvent.getX() < ciVar.getEditText().getRight() && motionEvent.getY() > ciVar.getEditText().getTop() && motionEvent.getY() < ciVar.getEditText().getBottom()) {
                xiVar.t1(ciVar.getEditText(), true);
            } else {
                xiVar.t1(ciVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23321c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        xi xiVar = this.f23321c0;
        zh zhVar = xiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f23319a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!xiVar.f30260c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            xiVar.M1(z10);
        }
        xiVar.W1 = zhVar.getTop() + xiVar.V1;
        zhVar.invalidate();
        xiVar.U1();
    }
}
