package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class h00 {
    public int f25280a;
    public CharSequence f25281b;
    public int f25282c;
    public int d;
    public boolean e;
    public boolean f25283f;
    public boolean f25284g;
    public final k00 h;

    public h00(k00 k00Var, int i10, Spannable spannable, boolean z4) {
        this.h = k00Var;
        this.f25280a = i10;
        this.f25281b = spannable;
        this.f25284g = z4;
    }

    public final int a(boolean z4) {
        int i10;
        int i11;
        CharSequence charSequence = this.f25281b;
        k00 k00Var = this.h;
        int ceil = (int) Math.ceil(ph.f3.g(charSequence, k00Var.f26092b));
        this.f25282c = ceil;
        int i12 = 0;
        if (z4) {
            i10 = ((org.telegram.ui.qw) k00Var.G).a(this.f25280a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(k00Var.f26094c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && k00Var.f26106n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f26092b;
        if (TextUtils.equals(this.f25281b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f25281b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f25281b = replaceEmoji;
        this.f25281b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f25284g = false;
    }
}
