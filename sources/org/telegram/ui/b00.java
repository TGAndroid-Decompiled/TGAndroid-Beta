package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b00 extends org.telegram.ui.Cells.m4 {
    public final TextView f36584r;
    public final gh.ca f36585s;
    public int v;
    public final org.telegram.ui.Components.b5 f36586w;
    public boolean f36587x;
    public final n00 f36588y;

    public b00(org.telegram.ui.n00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b00.<init>(org.telegram.ui.n00, android.content.Context):void");
    }

    public final void d(int i9, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        n00 n00Var = this.f36588y;
        if (n00Var.getUserConfig().isPremium()) {
            i10 = R.string.FolderTagNoColor;
        } else {
            i10 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i10);
        TextView textView = this.f36584r;
        textView.setText(string);
        int i11 = 0;
        if (i9 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.f6.f23250r8;
            i11 = n00Var.getThemedColor(iArr[i9 % iArr.length]);
        }
        this.v = i11;
        gh.ca caVar = this.f36585s;
        if (!z11) {
            caVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f36586w.a(this.v, true);
        }
        if (z11 != this.f36587x) {
            this.f36587x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = caVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(grVar).start();
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
        gh.ca caVar = this.f36585s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, caVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        caVar.c(replaceEmoji, z11, true);
    }
}
