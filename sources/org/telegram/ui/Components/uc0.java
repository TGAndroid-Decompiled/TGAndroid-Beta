package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class uc0 {
    public SpannableStringBuilder f31091a;
    public int f31092b;
    public Drawable f31093c;
    public float d;
    public final int e;
    public final int f31094f;
    public int f31095g = -1;
    public int h = -1;
    public float f31096i = 4.66f;

    public uc0(int i10, int i11) {
        this.e = i10;
        this.f31094f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f31091a;
        int i10 = this.f31094f;
        if (spannableStringBuilder != null && this.f31093c != null && AndroidUtilities.density == this.d) {
            if (this.f31092b != org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) {
                Drawable drawable = this.f31093c;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                this.f31092b = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            return this.f31091a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f31093c = mutate;
            int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            this.f31092b = w03;
            mutate.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f31095g;
            if (i11 <= 0) {
                dp = this.f31093c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f31093c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f31096i);
            this.f31093c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f31093c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f31091a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
