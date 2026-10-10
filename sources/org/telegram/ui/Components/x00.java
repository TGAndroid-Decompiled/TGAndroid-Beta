package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class x00 {
    public int f32794a;
    public CharSequence f32795b;
    public int f32796c;
    public int d;
    public boolean f32797e;
    public boolean f32798f;
    public boolean f32799g;
    public final b10 h;

    public x00(b10 b10Var, int i10, Spannable spannable, boolean z10) {
        this.h = b10Var;
        this.f32794a = i10;
        this.f32795b = spannable;
        this.f32799g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f32795b;
        b10 b10Var = this.h;
        int ceil = (int) Math.ceil(ci.d4.g(charSequence, b10Var.f24772b));
        this.f32796c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.sw) b10Var.J).a(this.f32794a);
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
            i11 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(b10Var.f24774c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.f32797e && b10Var.f24787n) {
                i12 = AndroidUtilities.dp(12.333f);
            }
            i11 = i12;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f24772b;
        if (TextUtils.equals(this.f32795b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f32795b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f32795b = replaceEmoji;
        this.f32795b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f32799g = false;
    }
}
