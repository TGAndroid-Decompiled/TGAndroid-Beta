package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class bi extends ku {
    public boolean V;
    public int W;
    public int f22761a0;
    public ValueAnimator f22762b0;
    public final wi f22763c0;

    public bi(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.f22763c0 = wiVar;
    }

    @Override
    public final void c(float f7) {
        wi wiVar = this.f22763c0;
        wiVar.f29670g2 = f7;
        yh yhVar = wiVar.D0;
        yhVar.setTranslationY(f7);
        yhVar.invalidate();
        wiVar.g1();
        wiVar.X1(wiVar.f29726y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            cu editText = this.f22763c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22761a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f22762b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22762b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.f27701f);
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
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26030w0 = false;
            emojiView.f26032w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f22763c0.f29665f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.f22763c0;
        bi biVar = wiVar.E0;
        if (!wiVar.f29712u1) {
            if (motionEvent.getX() > biVar.getEditText().getLeft() && motionEvent.getX() < biVar.getEditText().getRight() && motionEvent.getY() > biVar.getEditText().getTop() && motionEvent.getY() < biVar.getEditText().getBottom()) {
                wiVar.t1(biVar.getEditText(), true);
            } else {
                wiVar.t1(biVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22763c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        wi wiVar = this.f22763c0;
        yh yhVar = wiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22761a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!wiVar.f29655c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            wiVar.M1(z10);
        }
        wiVar.W1 = yhVar.getTop() + wiVar.V1;
        yhVar.invalidate();
        wiVar.U1();
    }
}
