package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ac0 {
    public SpannableStringBuilder f22350a;
    public int f22351b;
    public Drawable f22352c;
    public float d;
    public final int e;
    public final int f22353f;
    public int f22354g = -1;
    public int h = -1;
    public float f22355i = 4.66f;

    public ac0(int i10, int i11) {
        this.e = i10;
        this.f22353f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f22350a;
        int i10 = this.f22353f;
        if (spannableStringBuilder != null && this.f22352c != null && AndroidUtilities.density == this.d) {
            if (this.f22351b != org.telegram.ui.ActionBar.i6.v0(i10, e6Var)) {
                Drawable drawable = this.f22352c;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                this.f22351b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f22350a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f22352c = mutate;
            int v03 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
            this.f22351b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f22354g;
            if (i11 <= 0) {
                dp = this.f22352c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f22352c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f22355i);
            this.f22352c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f22352c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f22350a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
