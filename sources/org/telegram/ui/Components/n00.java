package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class n00 {
    public int f28740a;
    public CharSequence f28741b;
    public int f28742c;
    public int d;
    public boolean e;
    public boolean f28743f;
    public boolean f28744g;
    public final q00 h;

    public n00(q00 q00Var, int i10, Spannable spannable, boolean z10) {
        this.h = q00Var;
        this.f28740a = i10;
        this.f28741b = spannable;
        this.f28744g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f28741b;
        q00 q00Var = this.h;
        int ceil = (int) Math.ceil(ei.x3.g(charSequence, q00Var.f29707b));
        this.f28742c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.dw) q00Var.J).a(this.f28740a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(q00Var.f29709c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && q00Var.f29721n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f29707b;
        if (TextUtils.equals(this.f28741b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f28741b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f28741b = replaceEmoji;
        this.f28741b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f28744g = false;
    }
}
