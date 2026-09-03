package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class i00 {
    public int f27676a;
    public CharSequence f27677b;
    public int f27678c;
    public int d;
    public boolean f27679e;
    public boolean f27680f;
    public boolean f27681g;
    public final l00 h;

    public i00(l00 l00Var, int i10, Spannable spannable, boolean z4) {
        this.h = l00Var;
        this.f27676a = i10;
        this.f27677b = spannable;
        this.f27681g = z4;
    }

    public final int a(boolean z4) {
        int i10;
        int i11;
        CharSequence charSequence = this.f27677b;
        l00 l00Var = this.h;
        int ceil = (int) Math.ceil(qh.e3.g(charSequence, l00Var.f28537b));
        this.f27678c = ceil;
        int i12 = 0;
        if (z4) {
            i10 = ((org.telegram.ui.pw) l00Var.G).a(this.f27676a);
            if (i10 < 0) {
                i10 = 0;
            }
            if (z4) {
                this.d = i10;
            }
        } else {
            i10 = this.d;
        }
        if (i10 > 0) {
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(l00Var.f28539c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f27679e && l00Var.f28552n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f28537b;
        if (TextUtils.equals(this.f27677b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f27677b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f27677b = replaceEmoji;
        this.f27677b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f27681g = false;
    }
}
