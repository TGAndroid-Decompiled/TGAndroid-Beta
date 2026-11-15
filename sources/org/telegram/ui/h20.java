package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class h20 extends org.telegram.ui.Components.rt {
    public final c40 W;

    public h20(c40 c40Var, LaunchActivity launchActivity, i30 i30Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(launchActivity, i30Var, e2Var, 5, true, e6Var);
        this.W = c40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            c40 c40Var = this.W;
            c40Var.C1.getEditText().setTranslationY(view.getMeasuredHeight() - c40Var.A5.f57087f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.ly emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f37003x0 = false;
            emojiView.f37009y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.f29682b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.W.A5;
        if (cVar.f57087f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.W.B3;
        if (this.f39059e) {
            i7 = Math.max(0, getEmojiPadding());
        } else if (this.O) {
            i7 = Math.max(0, getKeyboardHeight());
        } else {
            i7 = 0;
        }
        if (i7 > 0) {
            hVar.g(i7);
        } else {
            hVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.W.f29682b.requestApplyInsets();
    }
}
