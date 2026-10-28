package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h5 extends ClickableSpan {
    public final int f36657a;
    public final org.telegram.ui.ActionBar.u6 f36658b;
    public final Runnable f36659c;

    public h5(int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        this.f36657a = i10;
        this.f36658b = u6Var;
        this.f36659c = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f36659c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.f36657a, this.f36658b));
    }
}
