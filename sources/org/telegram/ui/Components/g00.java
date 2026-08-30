package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class g00 {
    public int f25005a;
    public CharSequence f25006b;
    public int f25007c;
    public int d;
    public boolean e;
    public boolean f25008f;
    public boolean f25009g;
    public final j00 h;

    public g00(j00 j00Var, int i10, Spannable spannable, boolean z4) {
        this.h = j00Var;
        this.f25005a = i10;
        this.f25006b = spannable;
        this.f25009g = z4;
    }

    public final int a(boolean z4) {
        int i10;
        int i11;
        CharSequence charSequence = this.f25006b;
        j00 j00Var = this.h;
        int ceil = (int) Math.ceil(ph.f3.g(charSequence, j00Var.f25816b));
        this.f25007c = ceil;
        int i12 = 0;
        if (z4) {
            i10 = ((org.telegram.ui.ow) j00Var.G).a(this.f25005a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(j00Var.f25818c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && j00Var.f25830n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25816b;
        if (TextUtils.equals(this.f25006b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f25006b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f25006b = replaceEmoji;
        this.f25006b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f25009g = false;
    }
}
