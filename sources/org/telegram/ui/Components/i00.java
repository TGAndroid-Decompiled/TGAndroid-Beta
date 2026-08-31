package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class i00 {
    public int f27634a;
    public CharSequence f27635b;
    public int f27636c;
    public int d;
    public boolean f27637e;
    public boolean f27638f;
    public boolean f27639g;
    public final l00 h;

    public i00(l00 l00Var, int i10, Spannable spannable, boolean z4) {
        this.h = l00Var;
        this.f27634a = i10;
        this.f27635b = spannable;
        this.f27639g = z4;
    }

    public final int a(boolean z4) {
        int i10;
        int i11;
        CharSequence charSequence = this.f27635b;
        l00 l00Var = this.h;
        int ceil = (int) Math.ceil(qh.f3.g(charSequence, l00Var.f28488b));
        this.f27636c = ceil;
        int i12 = 0;
        if (z4) {
            i10 = ((org.telegram.ui.pw) l00Var.G).a(this.f27634a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(l00Var.f28490c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f27637e && l00Var.f28503n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f28488b;
        if (TextUtils.equals(this.f27635b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f27635b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f27635b = replaceEmoji;
        this.f27635b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f27639g = false;
    }
}
