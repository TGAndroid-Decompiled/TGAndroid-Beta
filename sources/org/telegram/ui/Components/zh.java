package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class zh extends qu {
    public boolean V;
    public int W;
    public int f32902a0;
    public ValueAnimator f32903b0;
    public final ti f32904c0;

    public zh(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, jiVar, null, 1, true, d6Var);
        this.f32904c0 = tiVar;
    }

    @Override
    public final void c(float f7) {
        ti tiVar = this.f32904c0;
        tiVar.f30563j2 = f7;
        wh whVar = tiVar.G0;
        whVar.setTranslationY(f7);
        whVar.invalidate();
        tiVar.i1();
        tiVar.b2(tiVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f32904c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f32902a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(16, this, editText));
            ValueAnimator valueAnimator = this.f32903b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32903b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25024f);
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
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30788w0 = false;
            emojiView.f30790w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32904c0.f30549f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f32904c0;
        zh zhVar = tiVar.H0;
        if (!tiVar.f30607x1) {
            if (motionEvent.getX() > zhVar.getEditText().getLeft() && motionEvent.getX() < zhVar.getEditText().getRight() && motionEvent.getY() > zhVar.getEditText().getTop() && motionEvent.getY() < zhVar.getEditText().getBottom()) {
                tiVar.w1(zhVar.getEditText(), true);
            } else {
                tiVar.w1(zhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32904c0.Y1();
    }

    @Override
    public final void q(int i10, int i11) {
        ti tiVar = this.f32904c0;
        wh whVar = tiVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f32902a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!tiVar.f30539c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.Q1(z10);
        }
        tiVar.Z1 = whVar.getTop() + tiVar.Y1;
        whVar.invalidate();
        tiVar.Y1();
    }
}
