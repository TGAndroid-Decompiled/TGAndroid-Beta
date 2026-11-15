package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class fz {
    public int f34748a;
    public CharSequence f34749b;
    public int f34750c;
    public int d;
    public boolean f34751e;
    public boolean f34752f;
    public boolean f34753g;
    public final iz h;

    public fz(iz izVar, int i7, Spannable spannable, boolean z10) {
        this.h = izVar;
        this.f34748a = i7;
        this.f34749b = spannable;
        this.f34753g = z10;
    }

    public final int a(boolean z10) {
        int i7;
        int i10;
        CharSequence charSequence = this.f34749b;
        iz izVar = this.h;
        int ceil = (int) Math.ceil(hi.l3.h(charSequence, izVar.f35783b));
        this.f34750c = ceil;
        int i11 = 0;
        if (z10) {
            i7 = ((org.telegram.ui.pw) izVar.K).a(this.f34748a);
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
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(izVar.f35785c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f34751e && izVar.f35798n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f35783b;
        if (TextUtils.equals(this.f34749b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f34749b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f34749b = m10;
        this.f34749b = org.telegram.messenger.gj.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f34753g = false;
    }
}
