package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends ju {
    public boolean V;
    public int W;
    public int f22617a0;
    public ValueAnimator f22618b0;
    public final vi f22619c0;

    public ai(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, liVar, null, 1, true, e6Var);
        this.f22619c0 = viVar;
    }

    @Override
    public final void c(float f7) {
        vi viVar = this.f22619c0;
        viVar.f29026g2 = f7;
        xh xhVar = viVar.D0;
        xhVar.setTranslationY(f7);
        xhVar.invalidate();
        viVar.g1();
        viVar.X1(viVar.f29082y0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            bu editText = this.f22619c0.E0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f22617a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ai.x(14, this, editText));
            ValueAnimator valueAnimator = this.f22618b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22618b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(qr.f27715f);
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
            emojiView.f25954w0 = false;
            emojiView.f25956w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f22619c0.f29021f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) n2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.f22619c0;
        ai aiVar = viVar.E0;
        if (!viVar.f29068u1) {
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
        this.f22619c0.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        vi viVar = this.f22619c0;
        xh xhVar = viVar.D0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f22617a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!viVar.f29011c0) {
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
