package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends hu {
    public boolean V;
    public int W;
    public int f24396a0;
    public ValueAnimator f24397b0;
    public final vi f24398c0;

    public ai(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, liVar, null, 1, true, f6Var);
        this.f24398c0 = viVar;
    }

    @Override
    public final void c(float f7) {
        vi viVar = this.f24398c0;
        viVar.f31284g2 = f7;
        xh xhVar = viVar.D0;
        xhVar.setTranslationY(f7);
        xhVar.invalidate();
        viVar.g1();
        viVar.X1(viVar.f31340y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zt editText = this.f24398c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f24396a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.m0(15, this, editText));
            ValueAnimator valueAnimator = this.f24397b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f24397b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.f29466f);
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
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f27995w0 = false;
            emojiView.f28001x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24398c0.f31279f0;
        if (n2Var instanceof org.telegram.ui.co) {
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.f24398c0;
        ai aiVar = viVar.E0;
        if (!viVar.f31326u1) {
            if (motionEvent.getX() > aiVar.getEditText().getLeft() && motionEvent.getX() < aiVar.getEditText().getRight() && motionEvent.getY() > aiVar.getEditText().getTop() && motionEvent.getY() < aiVar.getEditText().getBottom()) {
                viVar.t1(aiVar.getEditText(), true);
            } else {
                viVar.t1(aiVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f24398c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        vi viVar = this.f24398c0;
        xh xhVar = viVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f24396a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!viVar.f31268c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            viVar.M1(z10);
        }
        viVar.W1 = xhVar.getTop() + viVar.V1;
        xhVar.invalidate();
        viVar.U1();
    }
}
