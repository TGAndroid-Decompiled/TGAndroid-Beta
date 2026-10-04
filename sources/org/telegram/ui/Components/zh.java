package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class zh extends mu {
    public boolean V;
    public int W;
    public int f33494a0;
    public ValueAnimator f33495b0;
    public final xi f33496c0;

    public zh(xi xiVar, Context context, ki kiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kiVar, null, 1, true, d6Var);
        this.f33496c0 = xiVar;
    }

    @Override
    public final void c(float f7) {
        xi xiVar = this.f33496c0;
        xiVar.f32818g2 = f7;
        wh whVar = xiVar.D0;
        whVar.setTranslationY(f7);
        whVar.invalidate();
        xiVar.e1();
        xiVar.U1(xiVar.f32874y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            eu editText = this.f33496c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f33494a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f33495b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33495b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(tr.f31141f);
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
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f29155w0 = false;
            emojiView.f29157w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33496c0.f32813f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.f33496c0;
        zh zhVar = xiVar.E0;
        if (!xiVar.f32860u1) {
            if (motionEvent.getX() > zhVar.getEditText().getLeft() && motionEvent.getX() < zhVar.getEditText().getRight() && motionEvent.getY() > zhVar.getEditText().getTop() && motionEvent.getY() < zhVar.getEditText().getBottom()) {
                xiVar.q1(zhVar.getEditText(), true);
            } else {
                xiVar.q1(zhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33496c0.R1();
    }

    @Override
    public final void q(int i10, int i11) {
        xi xiVar = this.f33496c0;
        wh whVar = xiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f33494a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!xiVar.f32802c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            xiVar.J1(z10);
        }
        xiVar.W1 = whVar.getTop() + xiVar.V1;
        whVar.invalidate();
        xiVar.R1();
    }
}
