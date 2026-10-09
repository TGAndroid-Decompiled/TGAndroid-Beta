package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class g40 extends org.telegram.ui.Components.zu {
    public final g60 V;

    public g40(g60 g60Var, LaunchActivity launchActivity, k50 k50Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(launchActivity, k50Var, n2Var, 5, true, e6Var);
        this.V = g60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            g60 g60Var = this.V;
            g60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - g60Var.B3.f16345e);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.a00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f24464w0 = false;
            emojiView.f24466w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        me.e eVar = this.V.B3;
        if (eVar.f16345e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ph.i iVar = this.V.C1;
        if (this.f33652e) {
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
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
