package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bd0 {
    public SpannableStringBuilder f23741a;
    public int f23742b;
    public Drawable f23743c;
    public float d;
    public final int e;
    public final int f23744f;
    public int f23745g = -1;
    public int h = -1;
    public float f23746i = 4.66f;

    public bd0(int i10, int i11) {
        this.e = i10;
        this.f23744f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f23741a;
        int i10 = this.f23744f;
        if (spannableStringBuilder != null && this.f23743c != null && AndroidUtilities.density == this.d) {
            if (this.f23742b != org.telegram.ui.ActionBar.g6.w0(i10, c6Var)) {
                Drawable drawable = this.f23743c;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                this.f23742b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f23741a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f23743c = mutate;
            int w03 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
            this.f23742b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f23745g;
            if (i11 <= 0) {
                dp = this.f23743c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f23743c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f23746i);
            this.f23743c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f23743c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f23741a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
