package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class hb0 {
    public SpannableStringBuilder f26686a;
    public int f26687b;
    public Drawable f26688c;
    public float d;
    public final int e;
    public final int f26689f;
    public int f26690g = -1;
    public int h = -1;
    public float f26691i = 4.66f;

    public hb0(int i10, int i11) {
        this.e = i10;
        this.f26689f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f26686a;
        int i10 = this.f26689f;
        if (spannableStringBuilder != null && this.f26688c != null && org.telegram.messenger.i0.f16025p == this.d) {
            if (this.f26687b != org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) {
                Drawable drawable = this.f26688c;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                this.f26687b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26686a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.i0.f16025p;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f26688c = mutate;
            int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            this.f26687b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26690g;
            if (i11 <= 0) {
                L = this.f26688c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.i0.L(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                L2 = this.f26688c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.i0.L(i12);
            }
            int L3 = org.telegram.messenger.i0.L(this.f26691i);
            this.f26688c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26688c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(2.0f)), 1, 2, 33);
            this.f26686a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
