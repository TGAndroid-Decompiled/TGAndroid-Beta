package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends vu {
    public boolean V;
    public int W;
    public int f23247a0;
    public ValueAnimator f23248b0;
    public final vi f23249c0;

    public ai(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, liVar, null, 1, true, c6Var);
        this.f23249c0 = viVar;
    }

    @Override
    public final void c(float f7) {
        vi viVar = this.f23249c0;
        viVar.f29686j2 = f7;
        xh xhVar = viVar.G0;
        xhVar.setTranslationY(f7);
        xhVar.invalidate();
        viVar.i1();
        viVar.b2(viVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            nu editText = this.f23249c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f23247a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(15, this, editText));
            ValueAnimator valueAnimator = this.f23248b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f23248b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(es.f24465f);
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
        wz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30769w0 = false;
            emojiView.f30771w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23249c0.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.f23249c0;
        ai aiVar = viVar.H0;
        if (!viVar.f29730x1) {
            if (motionEvent.getX() > aiVar.getEditText().getLeft() && motionEvent.getX() < aiVar.getEditText().getRight() && motionEvent.getY() > aiVar.getEditText().getTop() && motionEvent.getY() < aiVar.getEditText().getBottom()) {
                viVar.w1(aiVar.getEditText(), true);
            } else {
                viVar.w1(aiVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23249c0.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        vi viVar = this.f23249c0;
        xh xhVar = viVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f23247a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!viVar.f29662c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            viVar.Q1(z10);
        }
        viVar.Z1 = xhVar.getTop() + viVar.Y1;
        xhVar.invalidate();
        viVar.Y1();
    }
}
