package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class zh extends qu {
    public boolean V;
    public int W;
    public int f33222a0;
    public ValueAnimator f33223b0;
    public final ti f33224c0;

    public zh(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, jiVar, null, 1, true, g6Var);
        this.f33224c0 = tiVar;
    }

    @Override
    public final void c(float f7) {
        ti tiVar = this.f33224c0;
        tiVar.f30744j2 = f7;
        wh whVar = tiVar.G0;
        whVar.setTranslationY(f7);
        whVar.invalidate();
        tiVar.l1();
        tiVar.f2(tiVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            iu editText = this.f33224c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f33222a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(16, this, editText));
            ValueAnimator valueAnimator = this.f33223b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33223b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.f25133f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.h3*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f31028w0 = false;
            emojiView.f31034x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f33224c0.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f33224c0;
        zh zhVar = tiVar.H0;
        if (!tiVar.f30788x1) {
            if (motionEvent.getX() > zhVar.getEditText().getLeft() && motionEvent.getX() < zhVar.getEditText().getRight() && motionEvent.getY() > zhVar.getEditText().getTop() && motionEvent.getY() < zhVar.getEditText().getBottom()) {
                tiVar.z1(zhVar.getEditText(), true);
            } else {
                tiVar.z1(zhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33224c0.c2();
    }

    @Override
    public final void q(int i10, int i11) {
        ti tiVar = this.f33224c0;
        wh whVar = tiVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f33222a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!tiVar.f30720c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.U1(z10);
        }
        tiVar.Z1 = whVar.getTop() + tiVar.Y1;
        whVar.invalidate();
        tiVar.c2();
    }
}
