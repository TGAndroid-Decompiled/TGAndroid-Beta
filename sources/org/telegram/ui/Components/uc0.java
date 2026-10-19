package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class uc0 {
    public SpannableStringBuilder f30927a;
    public int f30928b;
    public Drawable f30929c;
    public float d;
    public final int e;
    public final int f30930f;
    public int f30931g = -1;
    public int h = -1;
    public float f30932i = 4.66f;

    public uc0(int i10, int i11) {
        this.e = i10;
        this.f30930f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f30927a;
        int i10 = this.f30930f;
        if (spannableStringBuilder != null && this.f30929c != null && AndroidUtilities.density == this.d) {
            if (this.f30928b != org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) {
                Drawable drawable = this.f30929c;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                this.f30928b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f30927a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f30929c = mutate;
            int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
            this.f30928b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f30931g;
            if (i11 <= 0) {
                dp = this.f30929c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f30929c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f30932i);
            this.f30929c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f30929c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f30927a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
