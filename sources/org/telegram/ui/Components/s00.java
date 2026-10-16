package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class s00 {
    public int f28686a;
    public CharSequence f28687b;
    public int f28688c;
    public int d;
    public boolean e;
    public boolean f28689f;
    public boolean f28690g;
    public final w00 h;

    public s00(w00 w00Var, int i10, Spannable spannable, boolean z10) {
        this.h = w00Var;
        this.f28686a = i10;
        this.f28687b = spannable;
        this.f28690g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f28687b;
        w00 w00Var = this.h;
        int ceil = (int) Math.ceil(di.d4.g(charSequence, w00Var.f30363b));
        this.f28688c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.xw) w00Var.J).a(this.f28686a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(w00Var.f30365c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && w00Var.f30377n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f30363b;
        if (TextUtils.equals(this.f28687b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f28687b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f28687b = replaceEmoji;
        this.f28687b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f28690g = false;
    }
}
