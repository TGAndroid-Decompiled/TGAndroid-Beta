package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p00 extends org.telegram.ui.Cells.m4 {
    public final TextView f39844r;
    public final mh.x9 f39845s;
    public int v;
    public final org.telegram.ui.Components.c5 f39846w;
    public boolean f39847x;
    public final b10 f39848y;

    public p00(org.telegram.ui.b10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p00.<init>(org.telegram.ui.b10, android.content.Context):void");
    }

    public final void d(int i10, boolean z4) {
        int i11;
        boolean z10;
        float f10;
        b10 b10Var = this.f39848y;
        if (b10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f39844r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f21916r8;
            i12 = b10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        mh.x9 x9Var = this.f39845s;
        if (!z10) {
            x9Var.setEmojiColor(i12);
        }
        if (!z4) {
            this.f39846w.a(this.v, true);
        }
        if (z10 != this.f39847x) {
            this.f39847x = z10;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            duration.setInterpolator(prVar).start();
            ViewPropertyAnimator animate2 = x9Var.animate();
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(prVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z4) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        mh.x9 x9Var = this.f39845s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x9Var.getPaint().getFontMetricsInt(), false);
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        x9Var.c(replaceEmoji, z10, true);
    }
}
