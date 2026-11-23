package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class oz {
    public int f38373a;
    public CharSequence f38374b;
    public int f38375c;
    public int d;
    public boolean f38376e;
    public boolean f38377f;
    public boolean f38378g;
    public final rz h;

    public oz(rz rzVar, int i7, Spannable spannable, boolean z10) {
        this.h = rzVar;
        this.f38373a = i7;
        this.f38374b = spannable;
        this.f38378g = z10;
    }

    public final int a(boolean z10) {
        int i7;
        int i10;
        CharSequence charSequence = this.f38374b;
        rz rzVar = this.h;
        int ceil = (int) Math.ceil(hi.l3.h(charSequence, rzVar.f39348b));
        this.f38375c = ceil;
        int i11 = 0;
        if (z10) {
            i7 = ((org.telegram.ui.tw) rzVar.K).a(this.f38373a);
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
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(rzVar.f39350c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f38376e && rzVar.f39363n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f39348b;
        if (TextUtils.equals(this.f38374b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f38374b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f38374b = m10;
        this.f38374b = org.telegram.messenger.gj.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f38378g = false;
    }
}
