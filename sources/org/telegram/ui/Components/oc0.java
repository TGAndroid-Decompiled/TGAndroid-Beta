package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 {
    public SpannableStringBuilder f29331a;
    public int f29332b;
    public Drawable f29333c;
    public float d;
    public final int f29334e;
    public final int f29335f;
    public int f29336g = -1;
    public int h = -1;
    public float f29337i = 4.66f;

    public oc0(int i10, int i11) {
        this.f29334e = i10;
        this.f29335f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f29331a;
        int i10 = this.f29335f;
        if (spannableStringBuilder != null && this.f29333c != null && AndroidUtilities.density == this.d) {
            if (this.f29332b != org.telegram.ui.ActionBar.i6.v0(i10, d6Var)) {
                Drawable drawable = this.f29333c;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                this.f29332b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f29331a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f29334e).mutate();
            this.f29333c = mutate;
            int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
            this.f29332b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f29336g;
            if (i11 <= 0) {
                dp = this.f29333c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f29333c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f29337i);
            this.f29333c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f29333c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f29331a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
