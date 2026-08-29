package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class wb0 {
    public SpannableStringBuilder f34363a;
    public int f34364b;
    public Drawable f34365c;
    public float d;
    public final int f34366e;
    public final int f34367f;
    public int f34368g = -1;
    public int h = -1;
    public float f34369i = 4.66f;

    public wb0(int i10, int i11) {
        this.f34366e = i10;
        this.f34367f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f34363a;
        int i10 = this.f34367f;
        if (spannableStringBuilder != null && this.f34365c != null && AndroidUtilities.density == this.d) {
            if (this.f34364b != org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) {
                Drawable drawable = this.f34365c;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                this.f34364b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f34363a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f34366e).mutate();
            this.f34365c = mutate;
            int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            this.f34364b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f34368g;
            if (i11 <= 0) {
                dp = this.f34365c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f34365c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f34369i);
            this.f34365c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f34365c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f34363a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
