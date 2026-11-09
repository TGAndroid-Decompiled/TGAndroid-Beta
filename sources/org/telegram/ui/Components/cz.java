package org.telegram.ui.Components;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class cz {
    public int f32790a;
    public CharSequence f32791b;
    public int f32792c;
    public int d;
    public boolean f32793e;
    public boolean f32794f;
    public boolean f32795g;
    public final fz h;

    public cz(fz fzVar, int i7, Spannable spannable, boolean z9) {
        this.h = fzVar;
        this.f32790a = i7;
        this.f32791b = spannable;
        this.f32795g = z9;
    }

    public final int a(boolean z9) {
        int i7;
        int i10;
        CharSequence charSequence = this.f32791b;
        fz fzVar = this.h;
        int ceil = (int) Math.ceil(fi.m3.h(charSequence, fzVar.f33767b));
        this.f32792c = ceil;
        int i11 = 0;
        if (z9) {
            i7 = ((org.telegram.ui.pw) fzVar.J).a(this.f32790a);
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
            i10 = org.telegram.messenger.g0.L(-2.0f) + org.telegram.messenger.g0.L(10.0f) + Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(fzVar.f33769c.measureText(String.format("%d", Integer.valueOf(i7)))));
        } else {
            if (!this.f32793e && fzVar.f33782n) {
                i11 = org.telegram.messenger.g0.L(12.333f);
            }
            i10 = i11;
        }
        return Math.max(org.telegram.messenger.g0.L(16.0f), ceil + i10);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.f33767b;
        if (TextUtils.equals(this.f32791b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.f32791b = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f32791b = m10;
        this.f32791b = org.telegram.messenger.ij.B5(m10, null, textPaint.getFontMetricsInt(), false);
        this.f32795g = false;
    }
}
