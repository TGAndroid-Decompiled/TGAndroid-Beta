package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e00 extends org.telegram.ui.Cells.l4 {
    public final TextView f36770r;
    public final ai.ad f36771s;
    public int v;
    public final org.telegram.ui.Components.i5 f36772w;
    public boolean f36773x;
    public final q00 f36774y;

    public e00(org.telegram.ui.q00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e00.<init>(org.telegram.ui.q00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        q00 q00Var = this.f36774y;
        if (q00Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f36770r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f21442r8;
            i12 = q00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        ai.ad adVar = this.f36771s;
        if (!z11) {
            adVar.setEmojiColor(i12);
        }
        if (!z10) {
            this.f36772w.a(this.v, true);
        }
        if (z11 != this.f36773x) {
            this.f36773x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            duration.setInterpolator(bsVar).start();
            ViewPropertyAnimator animate2 = adVar.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(bsVar).start();
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
        ai.ad adVar = this.f36771s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, adVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        adVar.c(replaceEmoji, z11, true);
    }
}
