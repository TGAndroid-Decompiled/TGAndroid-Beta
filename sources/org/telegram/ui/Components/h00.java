package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class h00 {
    public int f24584a;
    public CharSequence f24585b;
    public int f24586c;
    public int d;
    public boolean e;
    public boolean f24587f;
    public boolean f24588g;
    public final l00 h;

    public h00(l00 l00Var, int i10, Spannable spannable, boolean z10) {
        this.h = l00Var;
        this.f24584a = i10;
        this.f24585b = spannable;
        this.f24588g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f24585b;
        l00 l00Var = this.h;
        int ceil = (int) Math.ceil(ci.e4.g(charSequence, l00Var.f25937b));
        this.f24586c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.pw) l00Var.J).a(this.f24584a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(l00Var.f25939c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && l00Var.f25951n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25937b;
        if (TextUtils.equals(this.f24585b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f24585b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f24585b = replaceEmoji;
        this.f24585b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f24588g = false;
    }
}
