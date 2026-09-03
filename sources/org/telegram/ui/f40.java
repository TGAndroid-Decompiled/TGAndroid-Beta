package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class f40 extends org.telegram.ui.Components.cu {
    public final e60 S;

    public f40(e60 e60Var, LaunchActivity launchActivity, j50 j50Var, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, j50Var, p2Var, 5, true, f6Var);
        this.S = e60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            e60 e60Var = this.S;
            e60Var.E.getEditText().setTranslationY(view.getMeasuredHeight() - e60Var.f33721y3.e);
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
            emojiView.f26482t0 = false;
            emojiView.f26487u2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.S).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xd.c cVar = this.S.f33721y3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ch.i iVar = this.S.f33723z1;
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
