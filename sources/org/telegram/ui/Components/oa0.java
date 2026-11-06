package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class oa0 {
    public SpannableStringBuilder f36562a;
    public int f36563b;
    public Drawable f36564c;
    public float d;
    public final int f36565e;
    public final int f36566f;
    public int f36567g = -1;
    public int h = -1;
    public float f36568i = 4.66f;

    public oa0(int i7, int i10) {
        this.f36565e = i7;
        this.f36566f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36562a;
        int i7 = this.f36566f;
        if (spannableStringBuilder != null && this.f36564c != null && org.telegram.messenger.g0.f22536p == this.d) {
            if (this.f36563b != org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) {
                Drawable drawable = this.f36564c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                this.f36563b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36562a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22536p;
            Drawable mutate = context.getResources().getDrawable(this.f36565e).mutate();
            this.f36564c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.f36563b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36567g;
            if (i10 <= 0) {
                L = this.f36564c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36564c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36568i);
            this.f36564c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36564c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36562a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
