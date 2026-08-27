package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class mh extends tt {
    public boolean R;
    public int S;
    public int T;
    public ValueAnimator U;
    public final gi V;

    public mh(gi giVar, Context context, wh whVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, whVar, null, 1, true, c6Var);
        this.V = giVar;
    }

    @Override
    public final void c(float f10) {
        gi giVar = this.V;
        giVar.f28641c2 = f10;
        ih ihVar = giVar.f28714z0;
        ihVar.setTranslationY(f10);
        ihVar.invalidate();
        giVar.g1();
        giVar.X1(giVar.f28696u0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R) {
            lt editText = this.V.A0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.T - editText.getScrollY()) + (this.S - editText.getMeasuredHeight())));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ag.t2(11, this, editText));
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(er.f28122f);
            valueAnimatorOfFloat.start();
            this.R = false;
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
        yy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f35035s0 = false;
            emojiView.f35040t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.V;
        mh mhVar = giVar.A0;
        if (!giVar.f28683q1) {
            if (motionEvent.getX() <= mhVar.getEditText().getLeft() || motionEvent.getX() >= mhVar.getEditText().getRight() || motionEvent.getY() <= mhVar.getEditText().getTop() || motionEvent.getY() >= mhVar.getEditText().getBottom()) {
                giVar.t1(mhVar.getEditText(), false);
            } else {
                giVar.t1(mhVar.getEditText(), true);
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
        gi giVar = this.V;
        ih ihVar = giVar.f28714z0;
        boolean z10 = false;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.R = false;
        } else {
            this.R = true;
            this.S = getEditText().getMeasuredHeight();
            this.T = getEditText().getScrollY();
            invalidate();
        }
        if (!giVar.Y) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            giVar.M1(z10);
        }
        giVar.S1 = ihVar.getTop() + giVar.R1;
        ihVar.invalidate();
        giVar.U1();
    }
}
