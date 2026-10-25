package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c00 extends org.telegram.ui.Cells.q4 {
    public final TextView f38192r;
    public final bi.qc f38193s;
    public int v;
    public final org.telegram.ui.Components.j5 f38194w;
    public boolean f38195x;
    public final o00 f38196y;

    public c00(org.telegram.ui.o00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c00.<init>(org.telegram.ui.o00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        o00 o00Var = this.f38196y;
        if (o00Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f38192r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.y6.f23614r8;
            i12 = o00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        bi.qc qcVar = this.f38193s;
        if (!z11) {
            qcVar.setEmojiColor(i12);
        }
        if (!z10) {
            this.f38194w.a(this.v, true);
        }
        if (z11 != this.f38195x) {
            this.f38195x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            duration.setInterpolator(dsVar).start();
            ViewPropertyAnimator animate2 = qcVar.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(dsVar).start();
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
        bi.qc qcVar = this.f38193s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, qcVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        qcVar.c(replaceEmoji, z11, true);
    }
}
