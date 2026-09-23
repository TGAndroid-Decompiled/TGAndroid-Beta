package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q00 extends org.telegram.ui.Cells.m4 {
    public final TextView f36233r;
    public final p00 f36234s;
    public int v;
    public final org.telegram.ui.Components.h5 f36235w;
    public boolean f36236x;
    public final c10 f36237y;

    public q00(org.telegram.ui.c10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q00.<init>(org.telegram.ui.c10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        c10 c10Var = this.f36237y;
        if (c10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f36233r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.f19046r8;
            i12 = c10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        p00 p00Var = this.f36234s;
        if (!z11) {
            p00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f36235w.a(this.v, true);
        }
        if (z11 != this.f36236x) {
            this.f36236x = z11;
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
            ViewPropertyAnimator animate2 = p00Var.animate();
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
        p00 p00Var = this.f36234s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, p00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        p00Var.c(replaceEmoji, z11, true);
    }
}
