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
    public int f34512a0;
    public ValueAnimator f34513b0;
    public final ti f34514c0;

    public wh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, giVar, null, 1, true, u6Var);
        this.f34514c0 = tiVar;
    }

    @Override
    public final void c(float f7) {
        ti tiVar = this.f34514c0;
        tiVar.f33004j2 = f7;
        th thVar = tiVar.G0;
        thVar.setTranslationY(f7);
        thVar.invalidate();
        tiVar.m1();
        tiVar.f2(tiVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            ju editText = this.f34514c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f34512a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bh.b0(15, this, editText));
            ValueAnimator valueAnimator = this.f34513b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f34513b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.f27530f);
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
            emojiView.f32775w0 = false;
            emojiView.f32781x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f34514c0.f32990f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.t8(menu, ((org.telegram.ui.wn) r2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f34514c0;
        wh whVar = tiVar.H0;
        if (!tiVar.f33048x1) {
            if (motionEvent.getX() > whVar.getEditText().getLeft() && motionEvent.getX() < whVar.getEditText().getRight() && motionEvent.getY() > whVar.getEditText().getTop() && motionEvent.getY() < whVar.getEditText().getBottom()) {
                tiVar.z1(whVar.getEditText(), true);
            } else {
                tiVar.z1(whVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f34514c0.c2();
    }

    @Override
    public final void q(int i10, int i11) {
        ti tiVar = this.f34514c0;
        th thVar = tiVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f34512a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!tiVar.f32980c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            tiVar.U1(z10);
        }
        tiVar.Z1 = thVar.getTop() + tiVar.Y1;
        thVar.invalidate();
        tiVar.c2();
    }
}
