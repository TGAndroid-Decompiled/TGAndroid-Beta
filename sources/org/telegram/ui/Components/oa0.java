package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class oa0 {
    public SpannableStringBuilder f36684a;
    public int f36685b;
    public Drawable f36686c;
    public float d;
    public final int f36687e;
    public final int f36688f;
    public int f36689g = -1;
    public int h = -1;
    public float f36690i = 4.66f;

    public oa0(int i7, int i10) {
        this.f36687e = i7;
        this.f36688f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36684a;
        int i7 = this.f36688f;
        if (spannableStringBuilder != null && this.f36686c != null && org.telegram.messenger.g0.f22536p == this.d) {
            if (this.f36685b != org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) {
                Drawable drawable = this.f36686c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                this.f36685b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36684a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22536p;
            Drawable mutate = context.getResources().getDrawable(this.f36687e).mutate();
            this.f36686c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.f36685b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36689g;
            if (i10 <= 0) {
                L = this.f36686c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36686c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36690i);
            this.f36686c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36686c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36684a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
