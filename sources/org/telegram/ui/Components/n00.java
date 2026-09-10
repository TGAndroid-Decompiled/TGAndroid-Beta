package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class n00 {
    public int f25349a;
    public CharSequence f25350b;
    public int f25351c;
    public int d;
    public boolean e;
    public boolean f25352f;
    public boolean f25353g;
    public final r00 h;

    public n00(r00 r00Var, int i10, Spannable spannable, boolean z10) {
        this.h = r00Var;
        this.f25349a = i10;
        this.f25350b = spannable;
        this.f25353g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f25350b;
        r00 r00Var = this.h;
        int ceil = (int) Math.ceil(bi.x4.g(charSequence, r00Var.f26514b));
        this.f25351c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.vw) r00Var.J).a(this.f25349a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(r00Var.f26516c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && r00Var.f26528n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f26514b;
        if (TextUtils.equals(this.f25350b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f25350b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f25350b = replaceEmoji;
        this.f25350b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f25353g = false;
    }
}
