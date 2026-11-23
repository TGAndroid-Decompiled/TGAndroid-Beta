package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class ab0 {
    public SpannableStringBuilder f33479a;
    public int f33480b;
    public Drawable f33481c;
    public float d;
    public final int f33482e;
    public final int f33483f;
    public int f33484g = -1;
    public int h = -1;
    public float f33485i = 4.66f;

    public ab0(int i7, int i10) {
        this.f33482e = i7;
        this.f33483f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f33479a;
        int i7 = this.f33483f;
        if (spannableStringBuilder != null && this.f33481c != null && org.telegram.messenger.g0.f24045p == this.d) {
            if (this.f33480b != org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) {
                Drawable drawable = this.f33481c;
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                this.f33480b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f33479a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f24045p;
            Drawable mutate = context.getResources().getDrawable(this.f33482e).mutate();
            this.f33481c = mutate;
            int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.f33480b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f33484g;
            if (i10 <= 0) {
                L = this.f33481c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f33481c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f33485i);
            this.f33481c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f33481c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f33479a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
