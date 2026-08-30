package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ua0 extends CharacterStyle {
    public final int f29173a;
    public final Object f29174b;

    public ua0(int i10, FrameLayout frameLayout) {
        this.f29173a = i10;
        this.f29174b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29173a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.j6.f20085n6;
                ((va0) this.f29174b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, ((zi0) this.f29174b).F)));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, ((vh.v5) this.f29174b).f46237a))));
                return;
        }
    }

    public ua0(zi0 zi0Var) {
        this.f29173a = 1;
        this.f29174b = zi0Var;
    }
}
