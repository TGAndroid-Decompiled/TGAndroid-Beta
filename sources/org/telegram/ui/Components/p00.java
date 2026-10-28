package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class p00 {
    public int f31417a;
    public CharSequence f31418b;
    public int f31419c;
    public int d;
    public boolean e;
    public boolean f31420f;
    public boolean f31421g;
    public final s00 h;

    public p00(s00 s00Var, int i10, Spannable spannable, boolean z10) {
        this.h = s00Var;
        this.f31417a = i10;
        this.f31418b = spannable;
        this.f31421g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f31418b;
        s00 s00Var = this.h;
        int ceil = (int) Math.ceil(fi.v3.g(charSequence, s00Var.f32418b));
        this.f31419c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.ux) s00Var.J).a(this.f31417a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(s00Var.f32420c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && s00Var.f32432n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f32418b;
        if (TextUtils.equals(this.f31418b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f31418b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f31418b = replaceEmoji;
        this.f31418b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f31421g = false;
    }
}
