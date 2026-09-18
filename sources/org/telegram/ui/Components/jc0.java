package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class jc0 {
    public SpannableStringBuilder f25296a;
    public int f25297b;
    public Drawable f25298c;
    public float d;
    public final int e;
    public final int f25299f;
    public int f25300g = -1;
    public int h = -1;
    public float f25301i = 4.66f;

    public jc0(int i10, int i11) {
        this.e = i10;
        this.f25299f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f25296a;
        int i10 = this.f25299f;
        if (spannableStringBuilder != null && this.f25298c != null && AndroidUtilities.density == this.d) {
            if (this.f25297b != org.telegram.ui.ActionBar.j6.v0(i10, e6Var)) {
                Drawable drawable = this.f25298c;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
                this.f25297b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f25296a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f25298c = mutate;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
            this.f25297b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f25300g;
            if (i11 <= 0) {
                dp = this.f25298c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f25298c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f25301i);
            this.f25298c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f25298c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f25296a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
