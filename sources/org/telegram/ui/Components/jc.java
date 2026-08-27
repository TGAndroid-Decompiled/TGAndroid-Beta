package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class jc extends ClickableSpan {

    public final int f29662a;

    public final Runnable f29663b;

    public jc(int i10, Runnable runnable) {
        this.f29662a = i10;
        this.f29663b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29662a) {
            case 0:
                this.f29663b.run();
                break;
            case 1:
                Runnable runnable = this.f29663b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 2:
                Runnable runnable2 = this.f29663b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            default:
                Runnable runnable3 = this.f29663b;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29662a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                break;
        }
    }
}
