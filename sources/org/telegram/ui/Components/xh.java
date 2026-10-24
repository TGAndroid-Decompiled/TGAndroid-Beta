package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class xh extends ou {
    public boolean V;
    public int W;
    public int f32580a0;
    public ValueAnimator f32581b0;
    public final ri f32582c0;

    public xh(ri riVar, Context context, hi hiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, hiVar, null, 1, true, g6Var);
        this.f32582c0 = riVar;
    }

    @Override
    public final void c(float f7) {
        ri riVar = this.f32582c0;
        riVar.f30160j2 = f7;
        uh uhVar = riVar.G0;
        uhVar.setTranslationY(f7);
        uhVar.invalidate();
        riVar.l1();
        riVar.f2(riVar.B0, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            gu editText = this.f32582c0.H0.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.f32580a0 - editText.getScrollY()) + (this.W - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new ah.l0(16, this, editText));
            ValueAnimator valueAnimator = this.f32581b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32581b0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(zr.f33337f);
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
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30372w0 = false;
            emojiView.f30378x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32582c0.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ri riVar = this.f32582c0;
        xh xhVar = riVar.H0;
        if (!riVar.f30204x1) {
            if (motionEvent.getX() > xhVar.getEditText().getLeft() && motionEvent.getX() < xhVar.getEditText().getRight() && motionEvent.getY() > xhVar.getEditText().getTop() && motionEvent.getY() < xhVar.getEditText().getBottom()) {
                riVar.z1(xhVar.getEditText(), true);
            } else {
                riVar.z1(xhVar.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32582c0.c2();
    }

    @Override
    public final void q(int i10, int i11) {
        ri riVar = this.f32582c0;
        uh uhVar = riVar.G0;
        boolean z10 = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.V = true;
            this.W = getEditText().getMeasuredHeight();
            this.f32580a0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.V = false;
        }
        if (!riVar.f30136c0) {
            if (i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z10 = true;
            }
            riVar.U1(z10);
        }
        riVar.Z1 = uhVar.getTop() + riVar.Y1;
        uhVar.invalidate();
        riVar.c2();
    }
}
