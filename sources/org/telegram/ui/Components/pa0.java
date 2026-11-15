package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class pa0 {
    public SpannableStringBuilder f38254a;
    public int f38255b;
    public Drawable f38256c;
    public float d;
    public final int f38257e;
    public final int f38258f;
    public int f38259g = -1;
    public int h = -1;
    public float f38260i = 4.66f;

    public pa0(int i7, int i10) {
        this.f38257e = i7;
        this.f38258f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f38254a;
        int i7 = this.f38258f;
        if (spannableStringBuilder != null && this.f38256c != null && org.telegram.messenger.g0.f23608p == this.d) {
            if (this.f38255b != org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) {
                Drawable drawable = this.f38256c;
                int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                this.f38255b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f38254a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f23608p;
            Drawable mutate = context.getResources().getDrawable(this.f38257e).mutate();
            this.f38256c = mutate;
            int w03 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            this.f38255b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f38259g;
            if (i10 <= 0) {
                L = this.f38256c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f38256c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f38260i);
            this.f38256c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f38256c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f38254a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
