package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class k20 extends org.telegram.ui.Components.yt {
    public final f40 W;

    public k20(f40 f40Var, LaunchActivity launchActivity, l30 l30Var, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(launchActivity, l30Var, g2Var, 5, true, h6Var);
        this.W = f40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            f40 f40Var = this.W;
            f40Var.C1.getEditText().setTranslationY(view.getMeasuredHeight() - f40Var.A5.f57706f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.ty emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f40154x0 = false;
            emojiView.f40160y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.f30176b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.W.A5;
        if (cVar.f57706f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i7;
        rh.h hVar = this.W.B3;
        if (this.f42538e) {
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
        this.W.f30176b.requestApplyInsets();
    }
}
