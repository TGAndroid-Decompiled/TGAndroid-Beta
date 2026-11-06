package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class oa0 {
    public SpannableStringBuilder f36580a;
    public int f36581b;
    public Drawable f36582c;
    public float d;
    public final int f36583e;
    public final int f36584f;
    public int f36585g = -1;
    public int h = -1;
    public float f36586i = 4.66f;

    public oa0(int i7, int i10) {
        this.f36583e = i7;
        this.f36584f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36580a;
        int i7 = this.f36584f;
        if (spannableStringBuilder != null && this.f36582c != null && org.telegram.messenger.g0.f22543p == this.d) {
            if (this.f36581b != org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) {
                Drawable drawable = this.f36582c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                this.f36581b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36580a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22543p;
            Drawable mutate = context.getResources().getDrawable(this.f36583e).mutate();
            this.f36582c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.f36581b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36585g;
            if (i10 <= 0) {
                L = this.f36582c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36582c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36586i);
            this.f36582c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36582c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36580a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
