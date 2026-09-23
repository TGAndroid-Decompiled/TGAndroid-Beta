package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class h00 {
    public int f24468a;
    public CharSequence f24469b;
    public int f24470c;
    public int d;
    public boolean e;
    public boolean f24471f;
    public boolean f24472g;
    public final l00 h;

    public h00(l00 l00Var, int i10, Spannable spannable, boolean z10) {
        this.h = l00Var;
        this.f24468a = i10;
        this.f24469b = spannable;
        this.f24472g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f24469b;
        l00 l00Var = this.h;
        int ceil = (int) Math.ceil(ci.e4.g(charSequence, l00Var.f25735b));
        this.f24470c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.qw) l00Var.J).a(this.f24468a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(l00Var.f25737c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && l00Var.f25749n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25735b;
        if (TextUtils.equals(this.f24469b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f24469b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f24469b = replaceEmoji;
        this.f24469b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f24472g = false;
    }
}
