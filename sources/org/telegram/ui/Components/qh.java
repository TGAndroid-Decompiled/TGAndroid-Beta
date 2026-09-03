package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class qh extends cu {
    public boolean S;
    public int T;
    public int U;
    public ValueAnimator V;
    public final li W;

    public qh(li liVar, Context context, bi biVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, biVar, null, 1, true, f6Var);
        this.W = liVar;
    }

    @Override
    public final void c(float f10) {
        li liVar = this.W;
        liVar.f26690d2 = f10;
        mh mhVar = liVar.A0;
        mhVar.setTranslationY(f10);
        mhVar.invalidate();
        liVar.g1();
        liVar.X1(liVar.f26744v0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            ut editText = this.W.B0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.U - editText.getScrollY()) + (this.T - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ag.a(13, this, editText));
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.V = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(mr.f27122f);
            ofFloat.start();
            this.S = false;
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
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26482t0 = false;
            emojiView.f26487u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.W.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) p2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        li liVar = this.W;
        qh qhVar = liVar.B0;
        if (!liVar.f26732r1) {
            if (motionEvent.getX() > qhVar.getEditText().getLeft() && motionEvent.getX() < qhVar.getEditText().getRight() && motionEvent.getY() > qhVar.getEditText().getTop() && motionEvent.getY() < qhVar.getEditText().getBottom()) {
                liVar.t1(qhVar.getEditText(), true);
            } else {
                liVar.t1(qhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W.U1();
    }

    @Override
    public final void q(int i10, int i11) {
        li liVar = this.W;
        mh mhVar = liVar.A0;
        boolean z4 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.S = true;
            this.T = getEditText().getMeasuredHeight();
            this.U = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.S = false;
        }
        if (!liVar.Z) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z4 = true;
            }
            liVar.M1(z4);
        }
        liVar.T1 = mhVar.getTop() + liVar.S1;
        mhVar.invalidate();
        liVar.U1();
    }
}
