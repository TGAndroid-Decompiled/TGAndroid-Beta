package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class g00 {
    public int f24220a;
    public CharSequence f24221b;
    public int f24222c;
    public int d;
    public boolean e;
    public boolean f24223f;
    public boolean f24224g;
    public final k00 h;

    public g00(k00 k00Var, int i10, Spannable spannable, boolean z10) {
        this.h = k00Var;
        this.f24220a = i10;
        this.f24221b = spannable;
        this.f24224g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f24221b;
        k00 k00Var = this.h;
        int ceil = (int) Math.ceil(ci.f4.g(charSequence, k00Var.f25572b));
        this.f24222c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.tw) k00Var.J).a(this.f24220a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(k00Var.f25574c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && k00Var.f25586n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25572b;
        if (TextUtils.equals(this.f24221b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f24221b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f24221b = replaceEmoji;
        this.f24221b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f24224g = false;
    }
}
