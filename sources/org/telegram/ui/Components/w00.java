package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class w00 {
    public int f32498a;
    public CharSequence f32499b;
    public int f32500c;
    public int d;
    public boolean f32501e;
    public boolean f32502f;
    public boolean f32503g;
    public final a10 h;

    public w00(a10 a10Var, int i10, Spannable spannable, boolean z10) {
        this.h = a10Var;
        this.f32498a = i10;
        this.f32499b = spannable;
        this.f32503g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f32499b;
        a10 a10Var = this.h;
        int ceil = (int) Math.ceil(ci.d4.g(charSequence, a10Var.f24500b));
        this.f32500c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.sw) a10Var.J).a(this.f32498a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(a10Var.f24502c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f32501e && a10Var.f24515n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f24500b;
        if (TextUtils.equals(this.f32499b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f32499b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f32499b = replaceEmoji;
        this.f32499b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f32503g = false;
    }
}
