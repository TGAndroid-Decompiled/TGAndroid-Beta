package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class d40 extends org.telegram.ui.Components.ku {
    public final d60 V;

    public d40(d60 d60Var, LaunchActivity launchActivity, h50 h50Var, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(launchActivity, h50Var, m2Var, 5, true, d6Var);
        this.V = d60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == getEditText()) {
            canvas.save();
            d60 d60Var = this.V;
            d60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - d60Var.B3.e);
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
        org.telegram.ui.Components.lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26299w0 = false;
            emojiView.f26301w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        le.f fVar = this.V.B3;
        if (fVar.e == 0.0f) {
            fVar.c(getMeasuredHeight());
        } else {
            fVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ph.i iVar = this.V.C1;
        if (this.e) {
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
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
