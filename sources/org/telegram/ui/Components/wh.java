package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class wh extends ru {
    public boolean V;
    public int W;
    public int f34439a0;
    public ValueAnimator f34440b0;
    public final ti f34441c0;

    public wh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, giVar, null, 1, true, u6Var);
        this.f34441c0 = tiVar;
    }

    @Override
    public final void c(float f7) {
        ti tiVar = this.f34441c0;
        tiVar.f33035j2 = f7;
        th thVar = tiVar.G0;
        thVar.setTranslationY(f7);
        thVar.invalidate();
        tiVar.l1();
        tiVar.e2(tiVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.f34441c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f34439a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bh.b0(15, this, editText));
            ValueAnimator valueAnimator = this.f34440b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f34440b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f27586f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.k3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32781w0 = false;
            emojiView.f32787x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f34441c0.f33021f0;
        if (r2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) r2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f34441c0;
        wh whVar = tiVar.H0;
        if (!tiVar.f33079x1) {
            if (motionEvent.getX() > whVar.getEditText().getLeft() && motionEvent.getX() < whVar.getEditText().getRight() && motionEvent.getY() > whVar.getEditText().getTop() && motionEvent.getY() < whVar.getEditText().getBottom()) {
                tiVar.y1(whVar.getEditText(), true);
            } else {
                tiVar.y1(whVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f34441c0.b2();
    }

    @Override
    public final void q(int i10, int i11) {
        ti tiVar = this.f34441c0;
        th thVar = tiVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f34439a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!tiVar.f33011c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.T1(z10);
        }
        tiVar.Z1 = thVar.getTop() + tiVar.Y1;
        thVar.invalidate();
        tiVar.b2();
    }
}
