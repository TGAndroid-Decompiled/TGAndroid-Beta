package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class mz {
    public int f37668a;
    public CharSequence f37669b;
    public int f37670c;
    public int d;
    public boolean f37671e;
    public boolean f37672f;
    public boolean f37673g;
    public final pz h;

    public mz(pz pzVar, int i7, Spannable spannable, boolean z10) {
        this.h = pzVar;
        this.f37668a = i7;
        this.f37669b = spannable;
        this.f37673g = z10;
    }

    public final int a(boolean z10) {
        int i7;
        int i10;
        CharSequence charSequence = this.f37669b;
        pz pzVar = this.h;
        int ceil = (int) Math.ceil(hi.m3.h(charSequence, pzVar.f38616b));
        this.f37670c = ceil;
        int i11 = 0;
        if (z10) {
            i7 = ((org.telegram.ui.tw) pzVar.K).a(this.f37668a);
            if (i7 < 0) {
                i7 = 0;
            }
            if (z10) {
                this.d = i7;
            }
        } else {
            i7 = this.d;
        }
        if (i7 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(pzVar.f38618c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f37671e && pzVar.f38631n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f38616b;
        if (TextUtils.equals(this.f37669b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f37669b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f37669b = m10;
        this.f37669b = org.telegram.messenger.fj.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f37673g = false;
    }
}
