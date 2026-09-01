package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class e40 extends org.telegram.ui.Components.fu {
    public final d60 S;

    public e40(d60 d60Var, LaunchActivity launchActivity, i50 i50Var, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(launchActivity, i50Var, p2Var, 5, true, g6Var);
        this.S = d60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            d60 d60Var = this.S;
            d60Var.E.getEditText().setTranslationY(view.getMeasuredHeight() - d60Var.f36116y3.f50510e);
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
        org.telegram.ui.Components.mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f29325t0 = false;
            emojiView.f29330u2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.S).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xd.c cVar = this.S.f36116y3;
        if (cVar.f50510e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        dh.i iVar = this.S.f36118z1;
        if (this.f27004e) {
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
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.S).containerView;
        viewGroup.requestApplyInsets();
    }
}
