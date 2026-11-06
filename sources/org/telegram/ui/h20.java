package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class h20 extends org.telegram.ui.Components.kt {
    public final c40 V;

    public h20(c40 c40Var, LaunchActivity launchActivity, i30 i30Var, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, i30Var, f2Var, 5, true, f6Var);
        this.V = c40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            c40 c40Var = this.V;
            c40Var.f44647y1.getEditText().setTranslationY(view.getMeasuredHeight() - c40Var.s5.f55400f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34093w0 = false;
            emojiView.f34099x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.f28616b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.V.s5;
        if (cVar.f55400f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.V.f44628t3;
        if (this.f35410e) {
            i7 = Math.max(0, getEmojiPadding());
        } else if (this.N) {
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
        this.V.f28616b.requestApplyInsets();
    }
}
