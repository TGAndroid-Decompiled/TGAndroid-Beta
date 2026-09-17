package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class g00 {
    public int f24051a;
    public CharSequence f24052b;
    public int f24053c;
    public int d;
    public boolean e;
    public boolean f24054f;
    public boolean f24055g;
    public final k00 h;

    public g00(k00 k00Var, int i10, Spannable spannable, boolean z10) {
        this.h = k00Var;
        this.f24051a = i10;
        this.f24052b = spannable;
        this.f24055g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f24052b;
        k00 k00Var = this.h;
        int ceil = (int) Math.ceil(ci.f4.g(charSequence, k00Var.f25478b));
        this.f24053c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.vw) k00Var.J).a(this.f24051a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(k00Var.f25480c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && k00Var.f25492n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25478b;
        if (TextUtils.equals(this.f24052b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f24052b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f24052b = replaceEmoji;
        this.f24052b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f24055g = false;
    }
}
