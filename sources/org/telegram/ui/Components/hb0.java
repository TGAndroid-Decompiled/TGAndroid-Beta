package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class hb0 {
    public SpannableStringBuilder f26744a;
    public int f26745b;
    public Drawable f26746c;
    public float d;
    public final int e;
    public final int f26747f;
    public int f26748g = -1;
    public int h = -1;
    public float f26749i = 4.66f;

    public hb0(int i10, int i11) {
        this.e = i10;
        this.f26747f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f26744a;
        int i10 = this.f26747f;
        if (spannableStringBuilder != null && this.f26746c != null && org.telegram.messenger.i0.f16171p == this.d) {
            if (this.f26745b != org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) {
                Drawable drawable = this.f26746c;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                this.f26745b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26744a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.i0.f16171p;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f26746c = mutate;
            int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            this.f26745b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26748g;
            if (i11 <= 0) {
                L = this.f26746c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.i0.L(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                L2 = this.f26746c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.i0.L(i12);
            }
            int L3 = org.telegram.messenger.i0.L(this.f26749i);
            this.f26746c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26746c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.t2(org.telegram.messenger.i0.L(2.0f)), 1, 2, 33);
            this.f26744a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
