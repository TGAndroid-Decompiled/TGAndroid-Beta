package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;

public final class vz {

    public int f34072a;

    public CharSequence f34073b;

    public int f34074c;
    public int d;

    public boolean f34075e;

    public boolean f34076f;

    public boolean f34077g;
    public final yz h;

    public vz(yz yzVar, int i10, Spannable spannable, boolean z10) {
        this.h = yzVar;
        this.f34072a = i10;
        this.f34073b = spannable;
        this.f34077g = z10;
    }

    public final int a(boolean z10) {
        int iA;
        int iDp;
        CharSequence charSequence = this.f34073b;
        yz yzVar = this.h;
        int iCeil = (int) Math.ceil(lh.w3.g(charSequence, yzVar.f35070b));
        this.f34074c = iCeil;
        int iDp2 = 0;
        if (z10) {
            iA = ((org.telegram.ui.gw) yzVar.F).a(this.f34072a);
            if (iA < 0) {
                iA = 0;
            }
            if (z10) {
                this.d = iA;
            }
        } else {
            iA = this.d;
        }
        if (iA > 0) {
            iDp = AndroidUtilities.dp(-2.0f) + AndroidUtilities.dp(10.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(yzVar.f35072c.measureText(String.format("%d", Integer.valueOf(iA)))));
        } else {
            if (!this.f34075e && yzVar.f35085n) {
                iDp2 = AndroidUtilities.dp(12.333f);
            }
            iDp = iDp2;
        }
        return Math.max(AndroidUtilities.dp(16.0f), iCeil + iDp);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f35070b;
        if (TextUtils.equals(this.f34073b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f34073b = spannableStringBuilder;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f34073b = charSequenceReplaceEmoji;
        this.f34073b = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, null, textPaint.getFontMetricsInt());
        this.f34077g = false;
    }
}
