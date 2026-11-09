package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
public final class pa0 {
    public SpannableStringBuilder f36961a;
    public int f36962b;
    public Drawable f36963c;
    public float d;
    public final int f36964e;
    public final int f36965f;
    public int f36966g = -1;
    public int h = -1;
    public float f36967i = 4.66f;

    public pa0(int i7, int i10) {
        this.f36964e = i7;
        this.f36965f = i10;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        int L;
        int L2;
        SpannableStringBuilder spannableStringBuilder = this.f36961a;
        int i7 = this.f36965f;
        if (spannableStringBuilder != null && this.f36963c != null && org.telegram.messenger.g0.f22562p == this.d) {
            if (this.f36962b != org.telegram.ui.ActionBar.l6.w0(i7, g6Var)) {
                Drawable drawable = this.f36963c;
                int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
                this.f36962b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f36961a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = org.telegram.messenger.g0.f22562p;
            Drawable mutate = context.getResources().getDrawable(this.f36964e).mutate();
            this.f36963c = mutate;
            int w03 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
            this.f36962b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i10 = this.f36966g;
            if (i10 <= 0) {
                L = this.f36963c.getIntrinsicWidth();
            } else {
                L = org.telegram.messenger.g0.L(i10);
            }
            int i11 = this.h;
            if (i11 <= 0) {
                L2 = this.f36963c.getIntrinsicHeight();
            } else {
                L2 = org.telegram.messenger.g0.L(i11);
            }
            int L3 = org.telegram.messenger.g0.L(this.f36967i);
            this.f36963c.setBounds(0, L3, L, L2 + L3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f36963c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.r2(org.telegram.messenger.g0.L(2.0f)), 1, 2, 33);
            this.f36961a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
