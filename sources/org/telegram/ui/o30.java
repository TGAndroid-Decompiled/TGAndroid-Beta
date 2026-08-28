package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class o30 extends org.telegram.ui.Components.ut {
    public final o50 R;

    public o30(o50 o50Var, LaunchActivity launchActivity, s40 s40Var, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(launchActivity, s40Var, o2Var, 5, true, b6Var);
        this.R = o50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            o50 o50Var = this.R;
            o50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - o50Var.f40981x3.f47780e);
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
        org.telegram.ui.Components.wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f34442s0 = false;
            emojiView.f34447t2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        td.c cVar = this.R.f40981x3;
        if (cVar.f47780e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i9;
        xg.i iVar = this.R.f40984y1;
        if (this.f33124e) {
            i9 = Math.max(0, getEmojiPadding());
        } else if (this.J) {
            i9 = Math.max(0, getKeyboardHeight());
        } else {
            i9 = 0;
        }
        if (i9 > 0) {
            iVar.f(i9);
        } else {
            iVar.h(false);
        }
    }

    @Override
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
        viewGroup.requestApplyInsets();
    }
}
