package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uc extends ClickableSpan {
    public final int f30887a;
    public final Runnable f30888b;

    public uc(int i10, Runnable runnable) {
        this.f30887a = i10;
        this.f30888b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30887a) {
            case 0:
                this.f30888b.run();
                return;
            case 1:
                Runnable runnable = this.f30888b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f30888b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f30888b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30887a) {
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
