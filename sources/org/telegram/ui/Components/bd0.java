package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bd0 {
    public SpannableStringBuilder f24930a;
    public int f24931b;
    public Drawable f24932c;
    public float d;
    public final int f24933e;
    public final int f24934f;
    public int f24935g = -1;
    public int h = -1;
    public float f24936i = 4.66f;

    public bd0(int i10, int i11) {
        this.f24933e = i10;
        this.f24934f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f24930a;
        int i10 = this.f24934f;
        if (spannableStringBuilder != null && this.f24932c != null && AndroidUtilities.density == this.d) {
            if (this.f24931b != org.telegram.ui.ActionBar.i6.w0(i10, e6Var)) {
                Drawable drawable = this.f24932c;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
                this.f24931b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f24930a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f24933e).mutate();
            this.f24932c = mutate;
            int w03 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
            this.f24931b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f24935g;
            if (i11 <= 0) {
                dp = this.f24932c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f24932c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f24936i);
            this.f24932c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f24932c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f24930a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
