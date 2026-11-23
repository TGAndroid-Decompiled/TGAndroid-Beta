package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class j20 extends org.telegram.ui.Components.wt {
    public final e40 W;

    public j20(e40 e40Var, LaunchActivity launchActivity, k30 k30Var, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(launchActivity, k30Var, g2Var, 5, true, i6Var);
        this.W = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            e40 e40Var = this.W;
            e40Var.C1.getEditText().setTranslationY(view.getMeasuredHeight() - e40Var.A5.f57785f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.qy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f39109x0 = false;
            emojiView.f39115y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.f30226b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.W.A5;
        if (cVar.f57785f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.W.B3;
        if (this.f41722e) {
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
        this.W.f30226b.requestApplyInsets();
    }
}
