package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class i40 extends org.telegram.ui.Components.hu {
    public final j60 V;

    public i40(j60 j60Var, LaunchActivity launchActivity, n50 n50Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, n50Var, n2Var, 5, true, f6Var);
        this.V = j60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            j60 j60Var = this.V;
            j60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - j60Var.B3.f15376e);
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
        org.telegram.ui.Components.kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f27995w0 = false;
            emojiView.f28001x2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        le.e eVar = this.V.B3;
        if (eVar.f15376e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        qh.i iVar = this.V.C1;
        if (this.f26850e) {
            i10 = Math.max(0, getEmojiPadding());
        } else if (this.N) {
            i10 = Math.max(0, getKeyboardHeight());
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            iVar.f(i10);
        } else {
            iVar.h(false);
        }
    }

    @Override
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
