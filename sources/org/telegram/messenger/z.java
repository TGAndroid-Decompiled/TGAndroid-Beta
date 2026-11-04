package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class z extends ClickableSpan {
    public final int f26692a;
    public final Runnable f26693b;

    public z(int i3, Runnable runnable) {
        this.f26692a = i3;
        this.f26693b = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f26693b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f26692a);
    }
}
