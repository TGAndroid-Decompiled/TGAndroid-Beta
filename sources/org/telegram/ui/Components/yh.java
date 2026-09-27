package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends lu {
    public boolean V;
    public int W;
    public int f30665a0;
    public ValueAnimator f30666b0;
    public final wi f30667c0;

    public yh(wi wiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, jiVar, null, 1, true, e6Var);
        this.f30667c0 = wiVar;
    }

    @Override
    public final void c(float f7) {
        wi wiVar = this.f30667c0;
        wiVar.f29967g2 = f7;
        vh vhVar = wiVar.D0;
        vhVar.setTranslationY(f7);
        vhVar.invalidate();
        wiVar.e1();
        wiVar.U1(wiVar.f30023y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            du editText = this.f30667c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f30665a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f30666b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f30666b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(sr.f28359f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.g3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26636w0 = false;
            emojiView.f26638w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30667c0.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.f30667c0;
        yh yhVar = wiVar.E0;
        if (!wiVar.f30009u1) {
            if (motionEvent.getX() > yhVar.getEditText().getLeft() && motionEvent.getX() < yhVar.getEditText().getRight() && motionEvent.getY() > yhVar.getEditText().getTop() && motionEvent.getY() < yhVar.getEditText().getBottom()) {
                wiVar.q1(yhVar.getEditText(), true);
            } else {
                wiVar.q1(yhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f30667c0.R1();
    }

    @Override
    public final void q(int i10, int i11) {
        wi wiVar = this.f30667c0;
        vh vhVar = wiVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f30665a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!wiVar.f29952c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            wiVar.J1(z10);
        }
        wiVar.W1 = vhVar.getTop() + wiVar.V1;
        vhVar.invalidate();
        wiVar.R1();
    }
}
