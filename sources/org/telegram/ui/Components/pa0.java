package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pa0 extends CharacterStyle {
    public final int f31628a;
    public final Object f31629b;

    public pa0(int i10, FrameLayout frameLayout) {
        this.f31628a = i10;
        this.f31629b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f31628a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.g6.f23241n6;
                ((qa0) this.f31629b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, ((qi0) this.f31629b).E)));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((th.t5) this.f31629b).f48776a))));
                return;
        }
    }

    public pa0(qi0 qi0Var) {
        this.f31628a = 1;
        this.f31629b = qi0Var;
    }
}
