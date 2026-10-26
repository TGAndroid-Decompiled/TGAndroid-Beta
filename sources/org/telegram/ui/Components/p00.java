package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class p00 {
    public int f31401a;
    public CharSequence f31402b;
    public int f31403c;
    public int d;
    public boolean e;
    public boolean f31404f;
    public boolean f31405g;
    public final s00 h;

    public p00(s00 s00Var, int i10, Spannable spannable, boolean z10) {
        this.h = s00Var;
        this.f31401a = i10;
        this.f31402b = spannable;
        this.f31405g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f31402b;
        s00 s00Var = this.h;
        int ceil = (int) Math.ceil(fi.v3.g(charSequence, s00Var.f32363b));
        this.f31403c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.rx) s00Var.J).a(this.f31401a);
            if (i10 < 0) {
                i10 = 0;
            }
            if (z10) {
                this.d = i10;
            }
        } else {
            i10 = this.d;
        }
        if (i10 > 0) {
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(s00Var.f32365c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && s00Var.f32377n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f32363b;
        if (TextUtils.equals(this.f31402b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f31402b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f31402b = replaceEmoji;
        this.f31402b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f31405g = false;
    }
}
