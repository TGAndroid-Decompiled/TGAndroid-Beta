package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class p00 {
    public int f29175a;
    public CharSequence f29176b;
    public int f29177c;
    public int d;
    public boolean e;
    public boolean f29178f;
    public boolean f29179g;
    public final s00 h;

    public p00(s00 s00Var, int i10, Spannable spannable, boolean z10) {
        this.h = s00Var;
        this.f29175a = i10;
        this.f29176b = spannable;
        this.f29179g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f29176b;
        s00 s00Var = this.h;
        int ceil = (int) Math.ceil(ei.x3.g(charSequence, s00Var.f30066b));
        this.f29177c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.bw) s00Var.J).a(this.f29175a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(s00Var.f30068c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && s00Var.f30080n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f30066b;
        if (TextUtils.equals(this.f29176b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f29176b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f29176b = replaceEmoji;
        this.f29176b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f29179g = false;
    }
}
