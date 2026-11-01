package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class f30 extends org.telegram.ui.Components.wt {
    public final a50 V;

    public f30(a50 a50Var, LaunchActivity launchActivity, f40 f40Var, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(launchActivity, f40Var, k2Var, 5, true, p6Var);
        this.V = a50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            a50 a50Var = this.V;
            a50Var.f35683y1.getEditText().setTranslationY(view.getMeasuredHeight() - a50Var.f35661s5.f7032f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32005w0 = false;
            emojiView.f32011x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.f21587b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fe.f fVar = this.V.f35661s5;
        if (fVar.f7032f == 0.0f) {
            fVar.c(getMeasuredHeight());
        } else {
            fVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        hh.i iVar = this.V.f35664t3;
        if (this.e) {
            i10 = Math.max(0, getEmojiPadding());
        } else if (this.N) {
            i10 = Math.max(0, getKeyboardHeight());
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            iVar.g(i10);
        } else {
            iVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.V.f21587b.requestApplyInsets();
    }
}
