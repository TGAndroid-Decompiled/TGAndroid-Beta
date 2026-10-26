package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h5 extends ClickableSpan {
    public final int f36632a;
    public final org.telegram.ui.ActionBar.u6 f36633b;
    public final Runnable f36634c;

    public h5(int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        this.f36632a = i10;
        this.f36633b = u6Var;
        this.f36634c = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f36634c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.f36632a, this.f36633b));
    }
}
