package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uc extends ClickableSpan {
    public final int f28639a;
    public final Runnable f28640b;

    public uc(int i10, Runnable runnable) {
        this.f28639a = i10;
        this.f28640b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28639a) {
            case 0:
                this.f28640b.run();
                return;
            case 1:
                Runnable runnable = this.f28640b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f28640b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f28640b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f28639a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                return;
            case 2:
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setUnderlineText(false);
                return;
        }
    }
}
