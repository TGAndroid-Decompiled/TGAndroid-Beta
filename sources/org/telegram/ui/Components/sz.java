package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
public final class sz {
    public int f32572a;
    public CharSequence f32573b;
    public int f32574c;
    public int d;
    public boolean f32575e;
    public boolean f32576f;
    public boolean f32577g;
    public final vz h;

    public sz(vz vzVar, int i9, Spannable spannable, boolean z10) {
        this.h = vzVar;
        this.f32572a = i9;
        this.f32573b = spannable;
        this.f32577g = z10;
    }

    public final int a(boolean z10) {
        int i9;
        int i10;
        CharSequence charSequence = this.f32573b;
        vz vzVar = this.h;
        int ceil = (int) Math.ceil(kh.x3.g(charSequence, vzVar.f34032b));
        this.f32574c = ceil;
        int i11 = 0;
        if (z10) {
            i9 = ((org.telegram.ui.dw) vzVar.F).a(this.f32572a);
            if (i9 < 0) {
                i9 = 0;
            }
            if (z10) {
                this.d = i9;
            }
        } else {
            i9 = this.d;
        }
        if (i9 > 0) {
            i10 = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(vzVar.f34034c.measureText(String.format("%d", Integer.valueOf(i9)))));
        } else {
            if (!this.f32575e && vzVar.f34047n) {
                i11 = AndroidUtilities.dp(12.333f);
            }
            i10 = i11;
        }
        return Math.max(AndroidUtilities.dp(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f34032b;
        if (TextUtils.equals(this.f32573b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f32573b = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f32573b = replaceEmoji;
        this.f32573b = MessageObject.replaceAnimatedEmoji(replaceEmoji, null, textPaint.getFontMetricsInt());
        this.f32577g = false;
    }
}
