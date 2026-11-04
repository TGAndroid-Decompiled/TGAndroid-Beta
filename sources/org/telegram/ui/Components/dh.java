package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class dh extends jt {
    public boolean W;
    public int f33102a0;
    public int f33103b0;
    public ValueAnimator f33104c0;
    public final bi f33105d0;

    public dh(bi biVar, Context context, oh ohVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, ohVar, null, 1, true, e6Var);
        this.f33105d0 = biVar;
    }

    @Override
    public final void c(float f10) {
        bi biVar = this.f33105d0;
        biVar.f32217b4 = f10;
        ah ahVar = biVar.f32295y2;
        ahVar.setTranslationY(f10);
        ahVar.invalidate();
        biVar.U0();
        biVar.M1(biVar.f32275t2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xs editText = this.f33105d0.f32299z2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f33103b0 - editText.getScrollY()) + (this.f33102a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ci.uc(15, this, editText));
            ValueAnimator valueAnimator = this.f33104c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33104c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f40452f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.t2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f33592x0 = false;
            emojiView.f33598y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f22603n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f33105d0.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) d2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.f33105d0;
        dh dhVar = biVar.f32299z2;
        if (!biVar.f32260p3) {
            if (motionEvent.getX() > dhVar.getEditText().getLeft() && motionEvent.getX() < dhVar.getEditText().getRight() && motionEvent.getY() > dhVar.getEditText().getTop() && motionEvent.getY() < dhVar.getEditText().getBottom()) {
                biVar.h1(dhVar.getEditText(), true);
            } else {
                biVar.h1(dhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f33105d0.J1();
    }

    @Override
    public final void q(int i3, int i10) {
        bi biVar = this.f33105d0;
        ah ahVar = biVar.f32295y2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.f33102a0 = getEditText().getMeasuredHeight();
            this.f33103b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!biVar.U1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            biVar.B1(z10);
        }
        biVar.R3 = ahVar.getTop() + biVar.Q3;
        ahVar.invalidate();
        biVar.J1();
    }
}
