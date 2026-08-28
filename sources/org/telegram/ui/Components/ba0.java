package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ba0 extends CharacterStyle {
    public final int f27134a;
    public final Object f27135b;

    public ba0(int i9, FrameLayout frameLayout) {
        this.f27134a = i9;
        this.f27135b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27134a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i9 = org.telegram.ui.ActionBar.f6.f23179n6;
                ((ca0) this.f27135b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.4f, ((fi0) this.f27135b).E)));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, ((qh.s5) this.f27135b).f46700a))));
                return;
        }
    }

    public ba0(fi0 fi0Var) {
        this.f27134a = 1;
        this.f27135b = fi0Var;
    }
}
