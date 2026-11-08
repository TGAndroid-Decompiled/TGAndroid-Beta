package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class z extends ClickableSpan {
    public final int f26788a;
    public final Runnable f26789b;

    public z(int i7, Runnable runnable) {
        this.f26788a = i7;
        this.f26789b = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f26789b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f26788a);
    }
}
