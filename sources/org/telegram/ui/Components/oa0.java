package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class oa0 {
    public SpannableStringBuilder f36555a;
    public int f36556b;
    public Drawable f36557c;
    public float d;
    public final int f36558e;
    public final int f36559f;
    public int f36560g = -1;
    public int h = -1;
    public float f36561i = 4.66f;

    public oa0(int i7, int i10) {
        this.f36558e = i7;
        this.f36559f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36555a;
        int i7 = this.f36559f;
        if (spannableStringBuilder != null && this.f36557c != null && org.telegram.messenger.g0.f22566p == this.d) {
            if (this.f36556b != org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) {
                Drawable drawable = this.f36557c;
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                this.f36556b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36555a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22566p;
            Drawable mutate = context.getResources().getDrawable(this.f36558e).mutate();
            this.f36557c = mutate;
            int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.f36556b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36560g;
            if (i10 <= 0) {
                L = this.f36557c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36557c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36561i);
            this.f36557c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36557c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36555a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
