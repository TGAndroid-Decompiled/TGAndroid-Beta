package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class i40 extends org.telegram.ui.Components.cv {
    public final i60 V;

    public i40(i60 i60Var, LaunchActivity launchActivity, m50 m50Var, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, m50Var, m2Var, 5, true, c6Var);
        this.V = i60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            i60 i60Var = this.V;
            i60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - i60Var.B3.f16096e);
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
        org.telegram.ui.Components.d00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f25135w0 = false;
            emojiView.f25137w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        me.e eVar = this.V.B3;
        if (eVar.f16096e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ph.i iVar = this.V.C1;
        if (this.f25018e) {
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
