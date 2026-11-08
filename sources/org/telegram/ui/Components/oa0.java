package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class oa0 {
    public SpannableStringBuilder f36600a;
    public int f36601b;
    public Drawable f36602c;
    public float d;
    public final int f36603e;
    public final int f36604f;
    public int f36605g = -1;
    public int h = -1;
    public float f36606i = 4.66f;

    public oa0(int i7, int i10) {
        this.f36603e = i7;
        this.f36604f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36600a;
        int i7 = this.f36604f;
        if (spannableStringBuilder != null && this.f36602c != null && org.telegram.messenger.g0.f22562p == this.d) {
            if (this.f36601b != org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) {
                Drawable drawable = this.f36602c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                this.f36601b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36600a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22562p;
            Drawable mutate = context.getResources().getDrawable(this.f36603e).mutate();
            this.f36602c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.f36601b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36605g;
            if (i10 <= 0) {
                L = this.f36602c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36602c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36606i);
            this.f36602c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36602c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36600a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
