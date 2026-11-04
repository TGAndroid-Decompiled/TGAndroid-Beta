package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class c20 extends org.telegram.ui.Components.jt {
    public final x30 W;

    public c20(x30 x30Var, LaunchActivity launchActivity, d30 d30Var, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(launchActivity, d30Var, d2Var, 5, true, e6Var);
        this.W = x30Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            x30 x30Var = this.W;
            x30Var.f51822z1.getEditText().setTranslationY(view.getMeasuredHeight() - x30Var.f51800t5.f53846f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f33592x0 = false;
            emojiView.f33598y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.f28586b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        qe.c cVar = this.W.f51800t5;
        if (cVar.f53846f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i3;
        sh.h hVar = this.W.f51803u3;
        if (this.f35191e) {
            i3 = Math.max(0, getEmojiPadding());
        } else if (this.O) {
            i3 = Math.max(0, getKeyboardHeight());
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            hVar.g(i3);
        } else {
            hVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.W.f28586b.requestApplyInsets();
    }
}
