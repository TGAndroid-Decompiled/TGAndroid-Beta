package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class lz {
    public int f37261a;
    public CharSequence f37262b;
    public int f37263c;
    public int d;
    public boolean f37264e;
    public boolean f37265f;
    public boolean f37266g;
    public final oz h;

    public lz(oz ozVar, int i7, Spannable spannable, boolean z10) {
        this.h = ozVar;
        this.f37261a = i7;
        this.f37262b = spannable;
        this.f37266g = z10;
    }

    public final int a(boolean z10) {
        int i7;
        int i10;
        CharSequence charSequence = this.f37262b;
        oz ozVar = this.h;
        int ceil = (int) Math.ceil(hi.u3.h(charSequence, ozVar.f38291b));
        this.f37263c = ceil;
        int i11 = 0;
        if (z10) {
            i7 = ((org.telegram.ui.sw) ozVar.K).a(this.f37261a);
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
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(ozVar.f38293c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f37264e && ozVar.f38306n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f38291b;
        if (TextUtils.equals(this.f37262b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f37262b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f37262b = m10;
        this.f37262b = org.telegram.messenger.fj.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f37266g = false;
    }
}
