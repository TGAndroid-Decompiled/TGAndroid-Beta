package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class j5 extends ClickableSpan {
    public final int f34642a;
    public final org.telegram.ui.ActionBar.g6 f34643b;
    public final Runnable f34644c;

    public j5(int i10, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        this.f34642a = i10;
        this.f34643b = g6Var;
        this.f34644c = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f34644c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f34642a, this.f34643b));
    }
}
