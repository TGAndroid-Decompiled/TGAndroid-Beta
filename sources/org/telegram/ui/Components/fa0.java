package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class fa0 extends CharacterStyle {

    public final int f28337a;

    public final Object f28338b;

    public fa0(int i10, FrameLayout frameLayout) {
        this.f28337a = i10;
        this.f28338b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f28337a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.g6.f23234n6;
                ((ga0) this.f28338b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, ((hi0) this.f28338b).E)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((rh.t5) this.f28338b).f47478a))));
                break;
        }
    }

    public fa0(hi0 hi0Var) {
        this.f28337a = 1;
        this.f28338b = hi0Var;
    }
}
