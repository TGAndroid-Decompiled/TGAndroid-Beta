package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q00 extends org.telegram.ui.Cells.l4 {
    public final TextView f37265r;
    public final lh.x9 f37266s;
    public int v;
    public final org.telegram.ui.Components.c5 f37267w;
    public boolean f37268x;
    public final c10 f37269y;

    public q00(org.telegram.ui.c10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q00.<init>(org.telegram.ui.c10, android.content.Context):void");
    }

    public final void d(int i10, boolean z4) {
        int i11;
        boolean z10;
        float f10;
        c10 c10Var = this.f37269y;
        if (c10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f37265r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f20134r8;
            i12 = c10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        lh.x9 x9Var = this.f37266s;
        if (!z10) {
            x9Var.setEmojiColor(i12);
        }
        if (!z4) {
            this.f37267w.a(this.v, true);
        }
        if (z10 != this.f37268x) {
            this.f37268x = z10;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
            duration.setInterpolator(mrVar).start();
            ViewPropertyAnimator animate2 = x9Var.animate();
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(mrVar).start();
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
        lh.x9 x9Var = this.f37266s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x9Var.getPaint().getFontMetricsInt(), false);
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        x9Var.c(replaceEmoji, z10, true);
    }
}
