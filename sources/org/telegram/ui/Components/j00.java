package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class j00 {
    public int f25251a;
    public CharSequence f25252b;
    public int f25253c;
    public int d;
    public boolean e;
    public boolean f25254f;
    public boolean f25255g;
    public final n00 h;

    public j00(n00 n00Var, int i10, Spannable spannable, boolean z10) {
        this.h = n00Var;
        this.f25251a = i10;
        this.f25252b = spannable;
        this.f25255g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f25252b;
        n00 n00Var = this.h;
        int ceil = (int) Math.ceil(ci.e4.g(charSequence, n00Var.f26478b));
        this.f25253c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.pw) n00Var.J).a(this.f25251a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(n00Var.f26480c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && n00Var.f26492n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f26478b;
        if (TextUtils.equals(this.f25252b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f25252b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f25252b = replaceEmoji;
        this.f25252b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f25255g = false;
    }
}
