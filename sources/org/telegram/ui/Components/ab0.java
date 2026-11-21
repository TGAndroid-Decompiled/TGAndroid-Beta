package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class ab0 {
    public SpannableStringBuilder f33466a;
    public int f33467b;
    public Drawable f33468c;
    public float d;
    public final int f33469e;
    public final int f33470f;
    public int f33471g = -1;
    public int h = -1;
    public float f33472i = 4.66f;

    public ab0(int i7, int i10) {
        this.f33469e = i7;
        this.f33470f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f33466a;
        int i7 = this.f33470f;
        if (spannableStringBuilder != null && this.f33468c != null && org.telegram.messenger.g0.f24145p == this.d) {
            if (this.f33467b != org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) {
                Drawable drawable = this.f33468c;
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                this.f33467b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f33466a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f24145p;
            Drawable mutate = context.getResources().getDrawable(this.f33469e).mutate();
            this.f33468c = mutate;
            int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.f33467b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f33471g;
            if (i10 <= 0) {
                L = this.f33468c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f33468c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f33472i);
            this.f33468c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f33468c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f33466a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
