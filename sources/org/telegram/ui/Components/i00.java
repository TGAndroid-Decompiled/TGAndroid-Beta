package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class i00 {
    public int f24959a;
    public CharSequence f24960b;
    public int f24961c;
    public int d;
    public boolean e;
    public boolean f24962f;
    public boolean f24963g;
    public final m00 h;

    public i00(m00 m00Var, int i10, Spannable spannable, boolean z10) {
        this.h = m00Var;
        this.f24959a = i10;
        this.f24960b = spannable;
        this.f24963g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f24960b;
        m00 m00Var = this.h;
        int ceil = (int) Math.ceil(ci.e4.g(charSequence, m00Var.f26188b));
        this.f24961c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.pw) m00Var.J).a(this.f24959a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(m00Var.f26190c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && m00Var.f26202n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f26188b;
        if (TextUtils.equals(this.f24960b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f24960b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f24960b = replaceEmoji;
        this.f24960b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f24963g = false;
    }
}
