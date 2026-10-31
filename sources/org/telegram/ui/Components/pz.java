package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class pz {
    public int f29471a;
    public CharSequence f29472b;
    public int f29473c;
    public int d;
    public boolean e;
    public boolean f29474f;
    public boolean f29475g;
    public final tz h;

    public pz(tz tzVar, int i10, Spannable spannable, boolean z10) {
        this.h = tzVar;
        this.f29471a = i10;
        this.f29472b = spannable;
        this.f29475g = z10;
    }

    public final int a(boolean z10) {
        int i10;
        int i11;
        CharSequence charSequence = this.f29472b;
        tz tzVar = this.h;
        int ceil = (int) Math.ceil(vh.p2.g(charSequence, tzVar.f30703b));
        this.f29473c = ceil;
        int i12 = 0;
        if (z10) {
            i10 = ((org.telegram.ui.rx) tzVar.J).a(this.f29471a);
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
            i11 = org.telegram.messenger.i0.L(-2.0f) + org.telegram.messenger.i0.L(10.0f) + Math.max(org.telegram.messenger.i0.L(7.333f), (int) Math.ceil(tzVar.f30705c.measureText(String.format("%d", Integer.valueOf(i10)))));
        } else {
            if (!this.e && tzVar.f30717n) {
                i12 = org.telegram.messenger.i0.L(12.333f);
            }
            i11 = i12;
        }
        return Math.max(org.telegram.messenger.i0.L(16.0f), ceil + i11);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f30703b;
        if (TextUtils.equals(this.f29472b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f29472b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f29472b = m10;
        this.f29472b = org.telegram.messenger.jj.A5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f29475g = false;
    }
}
