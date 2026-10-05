package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class j00 {
    public int f27637a;
    public CharSequence f27638b;
    public int f27639c;
    public int d;
    public boolean f27640e;
    public boolean f27641f;
    public boolean f27642g;
    public final n00 h;

    public j00(n00 n00Var, int i10, Spannable spannable, boolean z10) {
        this.h = n00Var;
        this.f27637a = i10;
        this.f27638b = spannable;
        this.f27642g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f27638b;
        n00 n00Var = this.h;
        int ceil = (int) Math.ceil(ci.e4.g(charSequence, n00Var.f28876b));
        this.f27639c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.ly) n00Var.J).a(this.f27637a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(n00Var.f28878c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f27640e && n00Var.f28891n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f28876b;
        if (TextUtils.equals(this.f27638b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f27638b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f27638b = replaceEmoji;
        this.f27638b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f27642g = false;
    }
}
