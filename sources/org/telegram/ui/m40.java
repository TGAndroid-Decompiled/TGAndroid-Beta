package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class m40 extends org.telegram.ui.Components.vu {
    public final n60 V;

    public m40(n60 n60Var, LaunchActivity launchActivity, r50 r50Var, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, r50Var, m2Var, 5, true, c6Var);
        this.V = n60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            n60 n60Var = this.V;
            n60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - n60Var.B3.e);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.wz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f30769w0 = false;
            emojiView.f30771w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ne.e eVar = this.V.B3;
        if (eVar.e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        qh.i iVar = this.V.C1;
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
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
