package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class gh extends lt {
    public boolean V;
    public int W;
    public int f33948a0;
    public ValueAnimator f33949b0;
    public final di f33950c0;

    public gh(di diVar, Context context, qh qhVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, qhVar, null, 1, true, g6Var);
        this.f33950c0 = diVar;
    }

    @Override
    public final void c(float f10) {
        di diVar = this.f33950c0;
        diVar.f32989a4 = f10;
        dh dhVar = diVar.f33067x2;
        dhVar.setTranslationY(f10);
        dhVar.invalidate();
        diVar.U0();
        diVar.M1(diVar.f33047s2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            zs editText = this.f33950c0.f33071y2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f33948a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new bi.de(15, this, editText));
            ValueAnimator valueAnimator = this.f33949b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33949b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.f40458f);
            ofFloat.start();
            this.V = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*org.telegram.ui.ActionBar.v2*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        hy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34476w0 = false;
            emojiView.f34482x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.f22558n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f33950c0.W1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) f2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        di diVar = this.f33950c0;
        gh ghVar = diVar.f33071y2;
        if (!diVar.f33033o3) {
            if (motionEvent.getX() > ghVar.getEditText().getLeft() && motionEvent.getX() < ghVar.getEditText().getRight() && motionEvent.getY() > ghVar.getEditText().getTop() && motionEvent.getY() < ghVar.getEditText().getBottom()) {
                diVar.h1(ghVar.getEditText(), true);
            } else {
                diVar.h1(ghVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f33950c0.J1();
    }

    @Override
    public final void q(int i7, int i10) {
        di diVar = this.f33950c0;
        dh dhVar = diVar.f33067x2;
        boolean z9 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f33948a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!diVar.T1) {
            if (i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z9 = true;
            }
            diVar.B1(z9);
        }
        diVar.Q3 = dhVar.getTop() + diVar.P3;
        dhVar.invalidate();
        diVar.J1();
    }
}
