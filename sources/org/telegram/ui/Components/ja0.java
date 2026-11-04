package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class ja0 {
    public SpannableStringBuilder f35006a;
    public int f35007b;
    public Drawable f35008c;
    public float d;
    public final int f35009e;
    public final int f35010f;
    public int f35011g = -1;
    public int h = -1;
    public float f35012i = 4.66f;

    public ja0(int i3, int i10) {
        this.f35009e = i3;
        this.f35010f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f35006a;
        int i3 = this.f35010f;
        if (spannableStringBuilder != null && this.f35008c != null && org.telegram.messenger.g0.f22607p == this.d) {
            if (this.f35007b != org.telegram.ui.ActionBar.k6.w0(i3, e6Var)) {
                Drawable drawable = this.f35008c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                this.f35007b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f35006a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22607p;
            Drawable mutate = context.getResources().getDrawable(this.f35009e).mutate();
            this.f35008c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            this.f35007b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f35011g;
            if (i10 <= 0) {
                L = this.f35008c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f35008c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f35012i);
            this.f35008c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f35008c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f35006a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
