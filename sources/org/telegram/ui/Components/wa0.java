package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wa0 extends CharacterStyle {
    public final int f32712a;
    public final Object f32713b;

    public wa0(int i10, FrameLayout frameLayout) {
        this.f32712a = i10;
        this.f32713b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f32712a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.k6.f21839n6;
                ((xa0) this.f32713b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.k6.l1(0.4f, ((bj0) this.f32713b).F)));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.k6.l1(0.4f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, ((wh.v5) this.f32713b).f50110a))));
                return;
        }
    }

    public wa0(bj0 bj0Var) {
        this.f32712a = 1;
        this.f32713b = bj0Var;
    }
}
