package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p00 extends org.telegram.ui.Cells.m4 {
    public final TextView f36372r;
    public final o00 f36373s;
    public int v;
    public final org.telegram.ui.Components.h5 f36374w;
    public boolean f36375x;
    public final b10 f36376y;

    public p00(org.telegram.ui.b10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p00.<init>(org.telegram.ui.b10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        b10 b10Var = this.f36376y;
        if (b10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f36372r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.f19318r8;
            i12 = b10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        o00 o00Var = this.f36373s;
        if (!z11) {
            o00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f36374w.a(this.v, true);
        }
        if (z11 != this.f36375x) {
            this.f36375x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
            duration.setInterpolator(rrVar).start();
            ViewPropertyAnimator animate2 = o00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(rrVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        o00 o00Var = this.f36373s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, o00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        o00Var.c(replaceEmoji, z11, true);
    }
}
