package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class z00 {
    public int f33234a;
    public CharSequence f33235b;
    public int f33236c;
    public int d;
    public boolean f33237e;
    public boolean f33238f;
    public boolean f33239g;
    public final d10 h;

    public z00(d10 d10Var, int i10, Spannable spannable, boolean z10) {
        this.h = d10Var;
        this.f33234a = i10;
        this.f33235b = spannable;
        this.f33239g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f33235b;
        d10 d10Var = this.h;
        int ceil = (int) Math.ceil(ci.d4.g(charSequence, d10Var.f25165b));
        this.f33236c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.uw) d10Var.J).a(this.f33234a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(d10Var.f25167c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f33237e && d10Var.f25180n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f25165b;
        if (TextUtils.equals(this.f33235b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f33235b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f33235b = replaceEmoji;
        this.f33235b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f33239g = false;
    }
}
