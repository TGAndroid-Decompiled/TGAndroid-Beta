package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class qh extends ut {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final ki V;

    public qh(ki kiVar, Context context, ai aiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, aiVar, null, 1, true, b6Var);
        this.V = kiVar;
    }

    @Override
    public final void c(float f10) {
        ki kiVar = this.V;
        kiVar.f30105c2 = f10;
        mh mhVar = kiVar.f30178z0;
        mhVar.setTranslationY(f10);
        mhVar.invalidate();
        kiVar.g1();
        kiVar.X1(kiVar.f30160u0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            mt editText = this.V.A0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new f2.g(10, this, editText));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f28844f);
            ofFloat.start();
            this.R = false;
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
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34442s0 = false;
            emojiView.f34447t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.V;
        qh qhVar = kiVar.A0;
        if (!kiVar.f30147q1) {
            if (motionEvent.getX() > qhVar.getEditText().getLeft() && motionEvent.getX() < qhVar.getEditText().getRight() && motionEvent.getY() > qhVar.getEditText().getTop() && motionEvent.getY() < qhVar.getEditText().getBottom()) {
                kiVar.t1(qhVar.getEditText(), true);
            } else {
                kiVar.t1(qhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.V.U1();
    }

    @Override
    public final void q(int i9, int i10) {
        ki kiVar = this.V;
        mh mhVar = kiVar.f30178z0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.R = true;
            this.S = getEditText().getMeasuredHeight();
            this.T = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.R = false;
        }
        if (!kiVar.Y) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            kiVar.M1(z10);
        }
        kiVar.S1 = mhVar.getTop() + kiVar.R1;
        mhVar.invalidate();
        kiVar.U1();
    }
}
