package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d00 extends org.telegram.ui.Cells.k4 {
    public final TextView f37250r;
    public final jh.w9 f37251s;
    public int v;
    public final org.telegram.ui.Components.f5 f37252w;
    public boolean f37253x;
    public final p00 f37254y;

    public d00(org.telegram.ui.p00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d00.<init>(org.telegram.ui.p00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f9;
        p00 p00Var = this.f37254y;
        if (p00Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f37250r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f23312r8;
            i12 = p00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        jh.w9 w9Var = this.f37251s;
        if (!z11) {
            w9Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f37252w.a(this.v, true);
        }
        if (z11 != this.f37253x) {
            this.f37253x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f9).setDuration(320L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            duration.setInterpolator(jrVar).start();
            ViewPropertyAnimator animate2 = w9Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(jrVar).start();
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
        jh.w9 w9Var = this.f37251s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, w9Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        w9Var.c(replaceEmoji, z11, true);
    }
}
