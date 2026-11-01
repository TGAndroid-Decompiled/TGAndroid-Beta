package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class dh extends wt {
    public boolean V;
    public int W;
    public int f25486a0;
    public ValueAnimator f25487b0;
    public final bi f25488c0;

    public dh(bi biVar, Context context, ph phVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, phVar, null, 1, true, p6Var);
        this.f25488c0 = biVar;
    }

    @Override
    public final void c(float f7) {
        bi biVar = this.f25488c0;
        biVar.f24751a4 = f7;
        ah ahVar = biVar.f24832x2;
        ahVar.setTranslationY(f7);
        ahVar.invalidate();
        biVar.T0();
        biVar.L1(biVar.f24812s2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            mt editText = this.f25488c0.f24836y2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f25486a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ag.p2(14, this, editText));
            ValueAnimator valueAnimator = this.f25487b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f25487b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.f26523f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.z2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32005w0 = false;
            emojiView.f32011x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.i0.f16167n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f25488c0.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.x8(menu, ((org.telegram.ui.un) k2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.f25488c0;
        dh dhVar = biVar.f24836y2;
        if (!biVar.f24797o3) {
            if (motionEvent.getX() > dhVar.getEditText().getLeft() && motionEvent.getX() < dhVar.getEditText().getRight() && motionEvent.getY() > dhVar.getEditText().getTop() && motionEvent.getY() < dhVar.getEditText().getBottom()) {
                biVar.g1(dhVar.getEditText(), true);
            } else {
                biVar.g1(dhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25488c0.I1();
    }

    @Override
    public final void q(int i10, int i11) {
        bi biVar = this.f25488c0;
        ah ahVar = biVar.f24832x2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f25486a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!biVar.T1) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            biVar.A1(z10);
        }
        biVar.Q3 = ahVar.getTop() + biVar.P3;
        ahVar.invalidate();
        biVar.I1();
    }
}
