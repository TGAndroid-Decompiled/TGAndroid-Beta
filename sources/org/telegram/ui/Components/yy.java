package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class yy {
    public int f40853a;
    public CharSequence f40854b;
    public int f40855c;
    public int d;
    public boolean f40856e;
    public boolean f40857f;
    public boolean f40858g;
    public final bz h;

    public yy(bz bzVar, int i3, Spannable spannable, boolean z10) {
        this.h = bzVar;
        this.f40853a = i3;
        this.f40854b = spannable;
        this.f40858g = z10;
    }

    public final int a(boolean z10) {
        int i3;
        int i10;
        CharSequence charSequence = this.f40854b;
        bz bzVar = this.h;
        int ceil = (int) Math.ceil(gi.l3.h(charSequence, bzVar.f32444b));
        this.f40855c = ceil;
        int i11 = 0;
        if (z10) {
            i3 = ((org.telegram.ui.kw) bzVar.K).a(this.f40853a);
            if (i3 < 0) {
                i3 = 0;
            }
            if (z10) {
                this.d = i3;
            }
        } else {
            i3 = this.d;
        }
        if (i3 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(bzVar.f32446c.measureText(String.format("%d", Integer.valueOf(i3)))));
        } else {
            if (!this.f40856e && bzVar.f32459n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f32444b;
        if (TextUtils.equals(this.f40854b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f40854b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f40854b = m10;
        this.f40854b = org.telegram.messenger.zi.C5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f40858g = false;
    }
}
