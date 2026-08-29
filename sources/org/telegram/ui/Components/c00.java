package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class c00 {
    public int f27251a;
    public CharSequence f27252b;
    public int f27253c;
    public int d;
    public boolean f27254e;
    public boolean f27255f;
    public boolean f27256g;
    public final f00 h;

    public c00(f00 f00Var, int i10, Spannable spannable, boolean z10) {
        this.h = f00Var;
        this.f27251a = i10;
        this.f27252b = spannable;
        this.f27256g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f27252b;
        f00 f00Var = this.h;
        int ceil = (int) Math.ceil(nh.t3.g(charSequence, f00Var.f28228b));
        this.f27253c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.fw) f00Var.F).a(this.f27251a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(f00Var.f28230c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f27254e && f00Var.f28243n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f28228b;
        if (TextUtils.equals(this.f27252b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f27252b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f27252b = replaceEmoji;
        this.f27252b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f27256g = false;
    }
}
