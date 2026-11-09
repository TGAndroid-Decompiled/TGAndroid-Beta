package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class j20 extends org.telegram.ui.Components.lt {
    public final e40 V;

    public j20(e40 e40Var, LaunchActivity launchActivity, k30 k30Var, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(launchActivity, k30Var, f2Var, 5, true, g6Var);
        this.V = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            e40 e40Var = this.V;
            e40Var.f45290y1.getEditText().setTranslationY(view.getMeasuredHeight() - e40Var.s5.f55505f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.hy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34476w0 = false;
            emojiView.f34482x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.f28624b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.V.s5;
        if (cVar.f55505f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.V.f45271t3;
        if (this.f35844e) {
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
        this.V.f28624b.requestApplyInsets();
    }
}
