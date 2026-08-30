package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class d40 extends org.telegram.ui.Components.du {
    public final c60 S;

    public d40(c60 c60Var, LaunchActivity launchActivity, h50 h50Var, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, h50Var, p2Var, 5, true, f6Var);
        this.S = c60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            c60 c60Var = this.S;
            c60Var.E.getEditText().setTranslationY(view.getMeasuredHeight() - c60Var.f33202y3.e);
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
        org.telegram.ui.Components.kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f26470t0 = false;
            emojiView.f26475u2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.S).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xd.c cVar = this.S.f33202y3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ch.i iVar = this.S.f33204z1;
        if (this.e) {
            i10 = Math.max(0, getEmojiPadding());
        } else if (this.K) {
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
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.S).containerView;
        viewGroup.requestApplyInsets();
    }
}
