package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class bz {
    public int f32333a;
    public CharSequence f32334b;
    public int f32335c;
    public int d;
    public boolean f32336e;
    public boolean f32337f;
    public boolean f32338g;
    public final ez h;

    public bz(ez ezVar, int i7, Spannable spannable, boolean z9) {
        this.h = ezVar;
        this.f32333a = i7;
        this.f32334b = spannable;
        this.f32338g = z9;
    }

    public final int a(boolean z9) {
        int i7;
        int i10;
        CharSequence charSequence = this.f32334b;
        ez ezVar = this.h;
        int ceil = (int) Math.ceil(fi.m3.h(charSequence, ezVar.f33377b));
        this.f32335c = ceil;
        int i11 = 0;
        if (z9) {
            i7 = ((org.telegram.ui.nw) ezVar.J).a(this.f32333a);
            if (i7 < 0) {
                i7 = 0;
            }
            if (z9) {
                this.d = i7;
            }
        } else {
            i7 = this.d;
        }
        if (i7 > 0) {
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(ezVar.f33379c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f32336e && ezVar.f33392n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f33377b;
        if (TextUtils.equals(this.f32334b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f32334b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f32334b = m10;
        this.f32334b = org.telegram.messenger.ij.C5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f32338g = false;
    }
}
