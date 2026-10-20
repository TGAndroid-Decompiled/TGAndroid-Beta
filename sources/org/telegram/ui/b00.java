package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b00 extends org.telegram.ui.Cells.l4 {
    public final TextView f35463r;
    public final ai.zc f35464s;
    public int v;
    public final org.telegram.ui.Components.i5 f35465w;
    public boolean f35466x;
    public final n00 f35467y;

    public b00(org.telegram.ui.n00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b00.<init>(org.telegram.ui.n00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        n00 n00Var = this.f35467y;
        if (n00Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f35463r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.f21249r8;
            i12 = n00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        ai.zc zcVar = this.f35464s;
        if (!z11) {
            zcVar.setEmojiColor(i12);
        }
        if (!z10) {
            this.f35465w.a(this.v, true);
        }
        if (z11 != this.f35466x) {
            this.f35466x = z11;
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
            ViewPropertyAnimator animate2 = zcVar.animate();
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
        ai.zc zcVar = this.f35464s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, zcVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        zcVar.c(replaceEmoji, z11, true);
    }
}
