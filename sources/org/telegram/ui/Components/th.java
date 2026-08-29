package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class th extends au {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final ni V;

    public th(ni niVar, Context context, di diVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, diVar, null, 1, true, c6Var);
        this.V = niVar;
    }

    @Override
    public final void c(float f9) {
        ni niVar = this.V;
        niVar.f30996c2 = f9;
        ph phVar = niVar.f31069z0;
        phVar.setTranslationY(f9);
        phVar.invalidate();
        niVar.g1();
        niVar.X1(niVar.f31051u0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            st editText = this.V.A0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bg.b3(12, this, editText));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(jr.f29800f);
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
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f28633s0 = false;
            emojiView.f28638t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.V;
        th thVar = niVar.A0;
        if (!niVar.f31038q1) {
            if (motionEvent.getX() > thVar.getEditText().getLeft() && motionEvent.getX() < thVar.getEditText().getRight() && motionEvent.getY() > thVar.getEditText().getTop() && motionEvent.getY() < thVar.getEditText().getBottom()) {
                niVar.t1(thVar.getEditText(), true);
            } else {
                niVar.t1(thVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        ni niVar = this.V;
        ph phVar = niVar.f31069z0;
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
        if (!niVar.Y) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            niVar.M1(z10);
        }
        niVar.S1 = phVar.getTop() + niVar.R1;
        phVar.invalidate();
        niVar.U1();
    }
}
