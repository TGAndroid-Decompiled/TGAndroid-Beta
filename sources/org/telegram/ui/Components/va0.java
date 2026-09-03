package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class va0 extends CharacterStyle {
    public final int f29443a;
    public final Object f29444b;

    public va0(int i10, FrameLayout frameLayout) {
        this.f29443a = i10;
        this.f29444b = frameLayout;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29443a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.j6.f20060n6;
                ((wa0) this.f29444b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, ((aj0) this.f29444b).F)));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, ((vh.w5) this.f29444b).f46338a))));
                return;
        }
    }

    public va0(aj0 aj0Var) {
        this.f29443a = 1;
        this.f29444b = aj0Var;
    }
}
