package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class cc0 {
    public SpannableStringBuilder f23923a;
    public int f23924b;
    public Drawable f23925c;
    public float d;
    public final int e;
    public final int f23926f;
    public int f23927g = -1;
    public int h = -1;
    public float f23928i = 4.66f;

    public cc0(int i10, int i11) {
        this.e = i10;
        this.f23926f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f23923a;
        int i10 = this.f23926f;
        if (spannableStringBuilder != null && this.f23925c != null && AndroidUtilities.density == this.d) {
            if (this.f23924b != org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) {
                Drawable drawable = this.f23925c;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                this.f23924b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f23923a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f23925c = mutate;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            this.f23924b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f23927g;
            if (i11 <= 0) {
                dp = this.f23925c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f23925c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f23928i);
            this.f23925c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f23925c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.o2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f23923a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
