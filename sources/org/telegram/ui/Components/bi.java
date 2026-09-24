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
    public int f22987a0;
    public ValueAnimator f22988b0;
    public final wi f22989c0;

    public bi(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.f22989c0 = wiVar;
    }

    @Override
    public final void c(float f7) {
        wi wiVar = this.f22989c0;
        wiVar.f29990g2 = f7;
        yh yhVar = wiVar.D0;
        yhVar.setTranslationY(f7);
        yhVar.invalidate();
        wiVar.g1();
        wiVar.X1(wiVar.f30046y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            cu editText = this.f22989c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22987a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f22988b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22988b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.f28022f);
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
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26291w0 = false;
            emojiView.f26293w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f22989c0.f29985f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) m2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.f22989c0;
        bi biVar = wiVar.E0;
        if (!wiVar.f30032u1) {
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
        this.f22989c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        wi wiVar = this.f22989c0;
        yh yhVar = wiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22987a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!wiVar.f29975c0) {
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
