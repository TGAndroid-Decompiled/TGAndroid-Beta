package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class k20 extends org.telegram.ui.Components.kt {
    public final f40 V;

    public k20(f40 f40Var, LaunchActivity launchActivity, l30 l30Var, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(launchActivity, l30Var, f2Var, 5, true, h6Var);
        this.V = f40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            f40 f40Var = this.V;
            f40Var.B1.getEditText().setTranslationY(view.getMeasuredHeight() - f40Var.f45596v5.f55504f);
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
            emojiView.f34077w0 = false;
            emojiView.f34083x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.f28672b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.V.f45596v5;
        if (cVar.f55504f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.V.f45599w3;
        if (this.f35436e) {
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
        this.V.f28672b.requestApplyInsets();
    }
}
