package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class za0 {
    public SpannableStringBuilder f42841a;
    public int f42842b;
    public Drawable f42843c;
    public float d;
    public final int f42844e;
    public final int f42845f;
    public int f42846g = -1;
    public int h = -1;
    public float f42847i = 4.66f;

    public za0(int i7, int i10) {
        this.f42844e = i7;
        this.f42845f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f42841a;
        int i7 = this.f42845f;
        if (spannableStringBuilder != null && this.f42843c != null && org.telegram.messenger.g0.f24117p == this.d) {
            if (this.f42842b != org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) {
                Drawable drawable = this.f42843c;
                int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
                this.f42842b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f42841a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f24117p;
            Drawable mutate = context.getResources().getDrawable(this.f42844e).mutate();
            this.f42843c = mutate;
            int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            this.f42842b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f42846g;
            if (i10 <= 0) {
                L = this.f42843c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f42843c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f42847i);
            this.f42843c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f42843c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f42841a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
